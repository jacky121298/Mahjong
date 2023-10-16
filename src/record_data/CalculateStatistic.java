package record_data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import database_utils.GameDataHandler;

public class CalculateStatistic {
	public static List<Game> test = null; 
	
	public Statistic calculate(String player){
		if(player == null){
			return null;
		}
		// initialize games
		List<Game> games = new ArrayList<Game>();
		// read from database.
		games = GameDataHandler.getResultFromDatabase(player, -1, 0, 0, -1, 0, 0, -1, -1);
		if(games == null) {
			System.out.println("no such person");
			return new Statistic();
		}
		// divide games into group of rounds. 
		Map<Integer, List<Game>> map = new TreeMap<Integer, List<Game>>();
		for(Game g : games){
			if( !map.containsKey(g.getRoundNumber()) ){
				List<Game> tmp = new LinkedList<Game>();
				map.put(g.getRoundNumber(), tmp);
			}
			map.get(g.getRoundNumber()).add(g);
		}
		
		// Count Place
		int[] place = {0, 0, 0, 0, 0};
		double averagePlace = 0.0;
		Set<Integer> set = map.keySet();
		for(Integer i : set){
			List<Game> tmp = map.get(i);
			Game maxGame = null;
			for(Game g : tmp){
				if(maxGame == null){
					maxGame = g;
				}
				else if(g.getRoundNumber() > maxGame.getRoundNumber()){
					maxGame = g;
				}
			}
			place[countPlace(player, maxGame)]++;
		}
		for(int i = 1; i <= 4; i++){
			averagePlace += (double)place[i] * i;
		}
		averagePlace /= map.size();
		
		// 計算立直率，放槍率，自摸率，榮和率，番數
		int win = 0;
		int richi = 0;
		int chunk = 0;
		int selfDraw = 0;
		int lon = 0;
		int oneHan = 0;
		int twoHan = 0;
		int threeHan = 0;
		int fourHan = 0;
		int moreThanFiveHan = 0;
		int mangan = 0; // 滿貫
		int haneman = 0; // 跳滿
		int baiman = 0; // 倍滿
		int sanbaiman = 0; // 三倍滿
		int yakuman = 0; // 役滿
		for(Game g : games){
			// 立直數量
			if(isRichi(player, g)){
				richi++;
			}
			
			// 放槍數量
			if(isChunk(player, g)){
				chunk++;
			}
			
			if(isWinner(player, g)){
				win++;
			}
			
			// 自摸數量
			if(isSelfDraw(player, g)){
				selfDraw++;
			}
			
			// 榮和數量
			if(isLon(player, g)){
				lon++;
			}
			
			// 計算番數
			String tmpHan = countHan(player, g);
			if(tmpHan == null) {
				continue;
			}
			switch(tmpHan){
				case "1翻":
					oneHan++;
					break;
				case "2翻":
					twoHan++;
					break;	
				case "3翻":
					threeHan++;
					break;
				case "4翻":
					fourHan++;
					break;
				case "滿貫":
					moreThanFiveHan++;
					mangan++;
					break;
				case "跳滿":
					moreThanFiveHan++;
					haneman++;
					break;
				case "倍滿":
					moreThanFiveHan++;
					baiman++;
					break;
				case "三倍滿":
					moreThanFiveHan++;
					sanbaiman++;
					break;
				default:
					moreThanFiveHan++;
					yakuman++;
			}
			
		}
	
		
		// return value
		Statistic rev = new Statistic();
		rev.setNumberOfGame(games.size()); // 總共局數
		rev.setNumberOfRound(map.size()); // 總共場數（東南）
		rev.setFirstRate( 100 * format( (double)place[1] / rev.getNumberOfRound() ) ); // 一位率
		rev.setSecondRate( 100 * format( (double)place[2] / rev.getNumberOfRound() ) ); // 二位率
		rev.setThirdRate( 100 * format( (double)place[3] / rev.getNumberOfRound() ) ); // 三位率
		rev.setFourthRate( 100 * format( (double)place[4] / rev.getNumberOfRound() ) ); // 四位率
		rev.setAveragePlace( format(averagePlace) ); // 平均順位
		rev.setRichiRate( 100 * format( (double)richi / rev.getNumberOfGame() ) ); // 立直率
		rev.setChunkerRate( 100 * format( (double)chunk / rev.getNumberOfGame() ) ); // 放槍率
		rev.setSelfDrawRate( 100 * format( (double)selfDraw / win) ); // 自摸率
		rev.setLonRate( 100 * format( (double)lon / win) ); // 榮和率
	
		rev.setOneHan(oneHan); // 一番
		rev.setTwoHan(twoHan); // 二番
		rev.setThreeHan(threeHan); // 三番
		rev.setFourHan(fourHan); // 四番
		rev.setMoreThanFiveHan(moreThanFiveHan); // 五番以上
		rev.setMangan(mangan); // 滿貫
		rev.setHaneman(haneman); // 跳滿
		rev.setBaiman(baiman); // 倍滿
		rev.setSanbaiman(sanbaiman); // 三倍滿
		rev.setYakuman(yakuman); // 役滿
		return rev;
	}
	
	private boolean isRichi(String player, Game game){
		for(int i = 0; i < 4; i++){
			if(player.equals(game.getPlayer()[i])){
				//System.out.println(game.getIsRichi()[i]);
				return game.getIsRichi()[i];
			}
		}
		return false;
		
	}
	
	private boolean isWinner(String player, Game game){
		for(int i = 0; i < 4; i++){
			if(player.equals(game.getPlayer()[i])){
				return game.getWinner() == i;
			}
		}
		return false;
	}
	
	private int countPlace(String player, Game game){
		int index = 0;
		for(int i = 0; i < 4; i++){
			if(player.equals(game.getPlayer()[i])){
				index = i;
				break;
			}
		}
		
		int rev = 4;
		for(int i = 0; i < 4; i++){
			if(index != i && game.getTotalPoints()[index] > game.getTotalPoints()[i]){
				rev--;
			}
		}
		return rev;
	}
	
	private boolean isChunk(String player, Game game){
		for(int i = 0; i < 4; i++){
			if(player.equals(game.getPlayer()[i])){
				return game.getChunker() == i;
			}
		}
		return false;
	}
	
	private boolean isLon(String player, Game game){
		for(int i = 0; i < 4; i++){
			if(player.equals(game.getPlayer()[i])){
				return game.getWinner() == i && !game.isSelfDraw();
			}
		}
		return false;
	}
	
	private boolean isSelfDraw(String player, Game game){
		for(int i = 0; i < 4; i++){
			if(player.equals(game.getPlayer()[i])){
				return (game.getWinner() == i) && game.isSelfDraw();
			}
		}
		return false;
	}
	
	private String countHan(String player, Game game){
		for(int i = 0; i < 4; i++){
			if(player.equals(game.getPlayer()[i]) && game.getWinner() == i){
				return game.getHan();
			}
		}
		return null;
	}
	
	public static void main(String[] argcs){
		String[] players = {"Alice", "Bob", "Cindy", "Daniel"};
		int[] totalPoints = {30000, 25000, 25000, 20000};
		int[] deltaPoints = {5000, 0, 0, -5000};
		boolean[] richi = {true, false, false, true};
		boolean[] ready = {false, false, false, false};
		Game g1 = new Game();
		Game g2 = new Game();
		
		g1.setGameNumber(0);
		g1.setRoundNumber(0);
		g1.setDraw(false);
		g1.setWinner(0);
		g1.setChunker(3);
		g1.setSelfDraw(false);
		g1.setHan("3");
		g1.setFu(40);
		g1.setPlayer(players);
		g1.setTotalPoints(totalPoints);
		g1.setDeltaPoints(deltaPoints);
		g1.setIsRichi(richi);
		g1.setReady(ready);
		
		totalPoints[0] += -1000;
		totalPoints[1] += 7000;
		totalPoints[2] += -5000;
		totalPoints[3] += -1000;
		deltaPoints[0] = -1000;
		deltaPoints[1] = 7000;
		deltaPoints[2] = -5000;
		deltaPoints[3] = -1000;
		
		g2.setGameNumber(1);
		g2.setRoundNumber(0);
		g2.setDraw(false);
		g2.setWinner(1);
		g2.setChunker(2);
		g2.setSelfDraw(false);
		g2.setHan("3");
		g2.setFu(40);
		g2.setPlayer(players);
		g2.setTotalPoints(totalPoints);
		g2.setDeltaPoints(deltaPoints);
		g2.setIsRichi(richi);
		g2.setReady(ready);
		
		test = new ArrayList<Game>();
		test.add(g1);
		test.add(g2);
		
		CalculateStatistic tmp = new CalculateStatistic();
		Statistic result = tmp.calculate(players[0]);
		
		System.out.println(result);
		
	}
	
	
	/**
	 * This method is used to round a double to 2nd decimal .place
	 * @param d
	 * @return
	 */
	private static double format(double d){
		return (double)Math.round(d * 10000) / 10000;
	}
}