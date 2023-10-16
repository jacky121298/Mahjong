package record_data;

import java.time.LocalDate;

public class Game {

	private LocalDate date;
	private int gameNumber;
	private int roundNumber;
	private boolean draw;
	private int winner; // 0~3
	private int chunker;
	private boolean selfDraw;
	private String han;
	private int fu;
	
	// name of players
	private String[] player = new String[4];
	
	// total points of these players
	private int[] totalPoints = new int[4];
	
	// point changing in this game
	private int[] deltaPoints = new int[4];
	
	private boolean[] isRichi = new boolean[4];
	
	private boolean[] ready = new boolean[4];
	
	public Game(int year, int month, int day, int gameNumber, int roundNumber, boolean draw, int winner, int chunker,
			boolean selfDraw, String han, int fu, String player1, String player2, String player3, String player4,
			int totalPoint1, int totalPoint2, int totalPoint3, int totalPoint4, int deltaPoint1, int deltaPoint2,
			int deltaPoint3, int deltaPoint4, boolean richi1, boolean richi2, boolean richi3, boolean richi4,
			boolean ready1, boolean ready2, boolean ready3, boolean ready4) {
		
		super();
		this.date = LocalDate.of(year, month, day);
		this.gameNumber = gameNumber;
		this.roundNumber = roundNumber;
		this.draw = draw;
		this.winner = winner;
		this.chunker = chunker;
		this.selfDraw = selfDraw;
		this.han = han;
		this.fu = fu;
		
		this.player[0] = player1;
		this.player[1] = player2;
		this.player[2] = player3;
		this.player[3] = player4;
		
		this.totalPoints[0] = totalPoint1;
		this.totalPoints[1] = totalPoint2;
		this.totalPoints[2] = totalPoint3;
		this.totalPoints[3] = totalPoint4;
		
		this.deltaPoints[0] = deltaPoint1;
		this.deltaPoints[1] = deltaPoint2;
		this.deltaPoints[2] = deltaPoint3;
		this.deltaPoints[3] = deltaPoint4;
		
		this.isRichi[0] = richi1;
		this.isRichi[1] = richi2;
		this.isRichi[2] = richi3;
		this.isRichi[3] = richi4;
		
		this.ready[0] = ready1;
		this.ready[1] = ready2;
		this.ready[2] = ready3;
		this.ready[3] = ready4;
	}
	
	public Game() {
		return;
	}
	
	/*
	public Game(int x){
		this.gameNumber = x;
		this.roundNumber = 1;
		this.draw = false;
		this.winner = x % 4 + 1;
		this.chunker = (x + 1) % 4 + 1;
		this.selfDraw = false;
		this.han = 3;
		this.fu = 20;
		this.player1 = "player1";
		this.player2 = "player2";
		this.player3 = "player3";
		this.player4 = "player4";
		this.totalPoint1 = 25000;
		this.totalPoint2 = 25000;
		this.totalPoint3 = 25000;
		this.totalPoint4 = 25000;
		this.deltaPoint1 = 0;
		this.deltaPoint2 = 0;
		this.deltaPoint3 = 0;
		this.deltaPoint4 = 0;
		this.richi1 = false;
		this.richi2 = false;
		this.richi3 = false;
		this.richi4 = false;
		this.ready1 = false;
		this.ready2 = false;
		this.ready3 = false;
		this.ready4 = false;
	}
	*/
	
	// date
	/** Getter of date
	 * @return date, java.time.LocalDate
	 */
	public LocalDate getDate() {
		return date;
	}
	
	/** Gets year of date
	 * @return Integer
	 */
	public int getDateYear() {
		return date.getYear();
	}
	
	/** Gets integer value of month of date
	 * @return Integer
	 */
	public int getDateMonth() {
		return date.getMonthValue();
	}
	
	/** Gets day of month of date
	 * @return Integer
	 */
	public int getDateDay() {
		return date.getDayOfMonth();
	}

	/** Setter of date.
	 * @param date, java.time.LocalDate
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	/** Setter of date, another way.
	 * @param year Integer
	 * @param month Integer
	 * @param day Integer
	 */
	public void setDate(int year, int month, int day) {
		this.date = LocalDate.of(year, month, day);
	}
	
	/**
	 * @return the gameNumber
	 */
	public int getGameNumber() {
		return gameNumber;
	}

	/**
	 * @param gameNumber the gameNumber to set
	 */
	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}

	/**
	 * @return the roundNumber
	 */
	public int getRoundNumber() {
		return roundNumber;
	}

	/**
	 * @param roundNumber the roundNumber to set
	 */
	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	/**
	 * @return the draw
	 */
	public boolean isDraw() {
		return draw;
	}

	/**
	 * @param draw the draw to set
	 */
	public void setDraw(boolean draw) {
		this.draw = draw;
	}

	/**
	 * @return the winner
	 */
	public int getWinner() {
		return winner;
	}

	/**
	 * @param winner the winner to set
	 */
	public void setWinner(int winner) {
		this.winner = winner;
	}

	/**
	 * @return the chunker
	 */
	public int getChunker() {
		return chunker;
	}

	/**
	 * @param chunker the chunker to set
	 */
	public void setChunker(int chunker) {
		this.chunker = chunker;
	}

	/**
	 * @return the selfDraw
	 */
	public boolean isSelfDraw() {
		return selfDraw;
	}

	/**
	 * @param selfDraw the selfDraw to set
	 */
	public void setSelfDraw(boolean selfDraw) {
		this.selfDraw = selfDraw;
	}

	/**
	 * @return the han
	 */
	public String getHan() {
		return han;
	}

	/**
	 * @param han the han to set
	 */
	public void setHan(String han) {
		this.han = han;
	}

	/**
	 * @return the fu
	 */
	public int getFu() {
		return fu;
	}

	/**
	 * @param fu the fu to set
	 */
	public void setFu(int fu) {
		this.fu = fu;
	}

	/**
	 * @return the player
	 */
	public String[] getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(String[] player) {
		this.player = player;
	}

	/**
	 * @return the totalPoints
	 */
	public int[] getTotalPoints() {
		return totalPoints.clone();
	}

	/**
	 * @param totalPoints the totalPoints to set
	 */
	public void setTotalPoints(int[] totalPoints) {
		this.totalPoints = totalPoints.clone();
	}

	/**
	 * @return the deltaPoints
	 */
	public int[] getDeltaPoints() {
		return deltaPoints.clone();
	}

	/**
	 * @param deltaPoints the deltaPoints to set
	 */
	public void setDeltaPoints(int[] deltaPoints) {
		this.deltaPoints = deltaPoints.clone();
	}

	/**
	 * @return the isRichi
	 */
	public boolean[] getIsRichi() {
		return isRichi.clone();
	}

	/**
	 * @param isRichi the isRichi to set
	 */
	public void setIsRichi(boolean[] isRichi) {
		this.isRichi = isRichi.clone();
	}

	/**
	 * @return the ready
	 */
	public boolean[] getReady() {
		return ready.clone();
	}

	/**
	 * @param ready the ready to set
	 */
	public void setReady(boolean[] ready) {
		this.ready = ready.clone();
	}
	
	@Override
	public String toString() {
		String st = super.toString() + "\n";
		String st1 = "Date: " + this.getDate().toString() + "\n";
		String st2 = "Game Number: " + this.getGameNumber() + " / Round Number: " + this.getRoundNumber() + "\n";
		String st3 = "<P1>: " + this.getPlayer()[0] + "  <P2>: " + this.getPlayer()[1] + "\n";
		String st4 = "<P3>: " + this.getPlayer()[2] + "  <P4>: " + this.getPlayer()[3] + "\n";
		int[] TP = this.getTotalPoints();
		String st5 = "Total Points: " + TP[0] + ", " + TP[1] + ", " + TP[2] + ", " + TP[3] + "\n";
		int[] DP = this.getDeltaPoints();
		String st6 = "Point Changes: " + DP[0] + ", " + DP[1] + ", " + DP[2] + ", " + DP[3] + "\n";
		
		boolean[] isRichis = this.getIsRichi();
		String st7 = "Richi: " + isRichis[0] + ", " + isRichis[1] + ", " + isRichis[2] + ", " + isRichis[3] + "\n";
		boolean[] isReadys = this.getReady();
		String st8 = "Ready: " + isReadys[0] + ", " + isReadys[1] + ", " + isReadys[2] + ", " + isReadys[3] + "\n";
		
		return st + st1 + st2 + st3 + st4 + st5 + st6 + st7 + st8;
	}
	
	public static void main(String[] argvs){
		boolean[] a = {true, false};
		boolean[] b = a.clone();
		
		for(boolean i : a){
			System.out.println(i);
		}
		
		b[0] = false;
		b[1] = false;
		
		for(boolean i : a){
			System.out.println(i);
		}
	}
}