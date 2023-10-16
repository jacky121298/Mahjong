package GUI;

import java.awt.*;
import javax.swing.*;

import database_utils.GameDataHandler;

import java.awt.event.*;
import java.util.*;
import record_data.*;

public class MainPageGUI {
	private MainPage mainpage = null;
	private String[] score = {"+0", "+0", "+0", "+0"};
	private String[] round = {"東一局", "東二局", "東三局", "東四局", "南一局", "南二局", "南三局", "南四局"};
	private String[] players = {UserGUI.getUser(1), UserGUI.getUser(2), UserGUI.getUser(3), UserGUI.getUser(4)};
	
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	private ArrayList<Integer> draw = new ArrayList<Integer>();    // 流局
	private ArrayList<Integer> riichi = new ArrayList<Integer>();  // 立直
	private ArrayList<String> dir = new ArrayList<String>();       // 方位
	private int[] total = {25000, 25000, 25000, 25000};
	
	private int winner = 0;
	private int loser = 0;
	
	private int homba = 0;    // 本場
	private int game = 0;     // 局
	private int entrust = 0;  // 供托點數
	private int roundn;       // 場
	
	private boolean end = false;
	
	/**
	 * Default constructor for class MainPageGUI
	 */
	public MainPageGUI(int roundn) {
		this.roundn = roundn;
		mainpage = new MainPage();
		dir.add("東"); dir.add("南"); dir.add("西"); dir.add("北");
		
		mainpage.setDir(dir, round[game], homba, entrust);
		mainpage.setUser();
		
		mainpage.setScore(1, Integer.toString(total[0]), false);
		mainpage.setScore(2, Integer.toString(total[1]), false);
		mainpage.setScore(3, Integer.toString(total[2]), false);
		mainpage.setScore(4, Integer.toString(total[3]), false);
	}
	
	/**
	 * Launch the MainPage
	 */
	public void launch() {
		// player & button
		map.put(91, 1); map.put(1, 91);
		map.put(31, 2); map.put(2, 31);
		map.put(11, 3); map.put(3, 11);
		map.put(71, 4); map.put(4, 71);
		
		BtnListener btnl = new BtnListener();
		int[] idx = {11, 12, 13, 14, 31, 32, 33, 34, 71, 72, 73, 74, 91, 92, 93, 94};
		
		for(int i: idx) {
			mainpage.getBtn(i).addActionListener(btnl);
		}

		mainpage.getBtn1().addActionListener(new Btn1Listener());
		mainpage.getBtn2().addActionListener(new Btn2Listener());
		mainpage.setVisible(true);
	}
	
	class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int nbtn = Integer.parseInt(e.getActionCommand().substring(0, 2));
			
			switch(Integer.parseInt(e.getActionCommand())) {
				/********************** 胡 (In main page) **********************/
				case 110: case 310: case 710: case 910:
					mainpage.setWin();
					mainpage.getBtn(nbtn).setBackground(new Color(255, 255, 0));
					winner = map.get(nbtn);
					break;
				
				/********************** 自摸 (In main page) **********************/
				case 120: case 320: case 720: case 920:
					mainpage.setSelf();
					mainpage.getBtn(nbtn).setBackground(new Color(255, 255, 0));
					winner = map.get(nbtn - 1);
					
					int host = dir.indexOf("東") + 1;
					WinGUI gui = new WinGUI(winner, loser, host, homba, (winner == host), true);
					mainpage.getBtn1().setActionCommand("SelfWinConfirm");
					
					BackListener bkl = new BackListener();
					JButton cancel = gui.getCancel();
					cancel.addActionListener(bkl);
					cancel.setActionCommand("Cancel");
					
					JButton enter = gui.getEnter();
					enter.addActionListener(bkl);
					enter.setActionCommand("Enter");
					
					gui.launch();
					break;

				/********************** 立直 (Riichi) **********************/
				case 130: case 330: case 730: case 930:
					int rwho = map.get(nbtn - 2);
					if (riichi.contains(rwho)) {
						mainpage.getBtn(nbtn).setBackground(new Color(224, 255, 255));
						riichi.remove(new Integer(rwho));
						entrust -= 1000;
						total[rwho - 1] += 1000;
					}
					
					else {
						mainpage.getBtn(nbtn).setBackground(new Color(255, 255, 0));
						riichi.add(rwho);
						entrust += 1000;
						total[rwho - 1] -= 1000;
					}
					
					for (int i = 0; i < 4; i++)
						mainpage.setScore(i + 1, Integer.toString(total[i]), false);
		
					mainpage.setDir(dir, round[game], homba, entrust);
					break;
					
				/********************** 詐胡 (Scam) **********************/
				case 140: case 340: case 740: case 940:
					int swho = map.get(nbtn - 3);
					
					// 莊家詐胡
					if (dir.get(swho - 1).equals("東")) {
						for (int i = 0; i < 4; i++) {
							if (swho - 1 == i) score[i] = "-12000";
							else score[i] = "+4000";
						}
					}
					
					// 非莊家詐胡
					else {
						for (int i = 0; i < 4; i++) {
							if (dir.get(i).equals("東")) score[i] = "+4000";
							else if (swho - 1 == i) score[i] = "-8000";
							else score[i] = "+2000";
						}
					}
					
					mainpage.setScam();
					mainpage.drawScore(score);
					mainpage.getBtn(nbtn).setBackground(new Color(255, 255, 0));;
					break;
				
				/********************** 流局 (Draw) **********************/
				case 111: DrawSelect(3, 11, 12, true); break;
				case 311: DrawSelect(2, 31, 32, true); break;
				case 711: DrawSelect(4, 71, 72, true); break;
				case 911: DrawSelect(1, 91, 92, true); break;
				
				case 121: DrawSelect(3, 11, 12, false); break;
				case 321: DrawSelect(2, 31, 32, false); break;
				case 721: DrawSelect(4, 71, 72, false); break;
				case 921: DrawSelect(1, 91, 92, false); break;

				/********************** Winner and Loser **********************/
				case 112: case 312: case 712: case 912:
					mainpage.getBtn(map.get(winner)).setBackground(new Color(245, 255, 250));
					mainpage.getBtn(nbtn).setBackground(new Color(255, 255, 0));
					winner = map.get(nbtn);
					break;
					
				case 122: case 322: case 722: case 922:
					if (loser == 0) {
						mainpage.getBtn(nbtn).setBackground(new Color(255, 255, 0));
						loser = map.get(nbtn - 1);
					}
					
					else {
						mainpage.getBtn(map.get(loser) + 1).setBackground(new Color(245, 255, 250));
						mainpage.getBtn(nbtn).setBackground(new Color(255, 255, 0));
						loser = map.get(nbtn - 1);
					}
					break;
			}
			
			/********************** Calculate draw's score **********************/
			if (e.getActionCommand().endsWith("1")) {
				for (int i = 0; i < 4; i++)
					score[i] = "+0";
				
				if (draw.size() == 1) {
					for (int i = 0; i < 4; i++) {
						if (draw.contains(i + 1))
							score[i] = "+3000";
						else score[i] = "-1000";
					}
				}
				
				else if (draw.size() == 2) {
					for (int i = 0; i < 4; i++) {
						if (draw.contains(i + 1))
							score[i] = "+1500";
						else score[i] = "-1500";
					}
				}
				
				else if (draw.size() == 3) {
					for (int i = 0; i < 4; i++) {
						if (draw.contains(i + 1))
							score[i] = "+1000";
						else score[i] = "-3000";
					}
				}
				mainpage.drawScore(score);
			}
		}
	}
	
	// 選擇誰聽誰沒聽
	private void DrawSelect(int idx, int btn1, int btn2, boolean add) {
		if (add) {
			draw.add(idx);
			mainpage.getBtn(btn1).setBackground(new Color(255, 255, 0));
			mainpage.getBtn(btn2).setBackground(new Color(245, 255, 250));
		}
		
		else {
			draw.remove(new Integer(idx));
			mainpage.getBtn(btn1).setBackground(new Color(245, 255, 250));
			mainpage.getBtn(btn2).setBackground(new Color(255, 255, 0));
		}
	}

	class Btn1Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 流局 (In main page)
			if (e.getActionCommand() == "Draw") {
				mainpage.setDraw();
			}
			
			// 確認誰聽誰沒聽
			else if (e.getActionCommand() == "Confirm") {	
				int host = dir.indexOf("東") + 1;
				if (draw.contains(host)) { // 莊家有聽
					homba += 1;
					mainpage.setDir(dir, round[game], homba, entrust);
				}
				
				else { // 莊家沒聽
					homba += 1; game += 1;
					checkRound();
				}
				
				int[] deltaPoints = updateScore();
				addGame(true, -1, -1, false, "0", 0, deltaPoints);
				draw.clear();
			}
			
			// 詐胡
			else if (e.getActionCommand() == "Scam") {
				homba = 0; game += 1;
				checkRound();
				
				int[] deltaPoints = updateScore();
				addGame(false, -1, -1, false, "0", 0, deltaPoints);
			}
			
			// 確認誰胡
			else if (e.getActionCommand() == "Win") {
				int host = dir.indexOf("東") + 1;
				WinGUI gui = new WinGUI(winner, loser, host, homba, (winner == host), false);
				mainpage.getBtn1().setActionCommand("WinConfirm");
				
				BackListener bkl = new BackListener();
				JButton cancel = gui.getCancel();
				cancel.addActionListener(bkl);
				cancel.setActionCommand("Cancel");
				
				JButton enter = gui.getEnter();
				enter.addActionListener(bkl);
				enter.setActionCommand("Enter");
				
				gui.launch();
			}
			
			// 胡時選擇翻符
			else if (e.getActionCommand() == "WinConfirm") {
				entrust = 0;
				int host = dir.indexOf("東") + 1;
				
				if (winner == host) {
					homba += 1;
					mainpage.setDir(dir, round[game], homba, entrust);
				}
				
				else {
					homba = 0; game += 1;
					checkRound();
				}
				
				int[] deltaPoints = updateScore();
				addGame(false, winner, loser, false, WinGUI.getHan(), WinGUI.getFuku(), deltaPoints);
			}
			
			// 自摸時選擇翻符
			else if (e.getActionCommand() == "SelfWinConfirm") {
				entrust = 0;
				int host = dir.indexOf("東") + 1;
				
				if (winner == host) {
					homba += 1;
					mainpage.setDir(dir, round[game], homba, entrust);
				}
				
				else {
					homba = 0; game += 1;
					checkRound();
				}
				
				int[] deltaPoints = updateScore();
				addGame(false, winner, 0, true, WinGUI.getHan(), WinGUI.getFuku(), deltaPoints);
			}
		}
	}
	
	class Btn2Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "Home")
				mainpage.setVisible(false);
			
			else if (e.getActionCommand() == "Cancel") {
				mainpage.setConfirm(); draw.clear();
				for (int i = 0; i < 4; i++)
					mainpage.setScore(i + 1, Integer.toString(total[i]), false);
				
				for (int idx: riichi)
					mainpage.getBtn(map.get(idx) + 2).setBackground(new Color(255, 255, 0));
			}
		}
	}
	
	class BackListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Enter")) {
				if (WinGUI.checkVaild(WinGUI.getHan(), WinGUI.getFuku())) {
					// update score
					score = WinGUI.getScore();
					if (entrust > 0) {
						int total = Integer.parseInt(score[winner - 1].substring(1)) + entrust;
						score[winner - 1] = "+" + Integer.toString(total);
					}
					mainpage.drawScore(score);
				}
			}
			
			else if (e.getActionCommand().equals("Cancel")) {
				for (int i = 0; i < 4; i++)
					score[i] = "+0";
			}
		}
	}
	
	private void checkRound() {
		if (game == 8) {
			this.end = true;
			mainpage.setVisible(false);
		}
		
		else {
			changeDir();
			mainpage.setDir(dir, round[game], homba, entrust);
		}
	}
	
	private void changeDir() {
		String tmp = dir.remove(3);
		dir.add(0, tmp);
	}
	
	private int[] updateScore() {
		mainpage.setConfirm();
		int[] deltaPoints = {0, 0, 0, 0};
		
		// update score
		for (int i = 0; i < 4; i++) {
			if (score[i].contains("-")) {
				total[i] -= Integer.parseInt(score[i].substring(1));
				deltaPoints[i] = -1 * Integer.parseInt(score[i].substring(1));
			}
			else {
				total[i] += Integer.parseInt(score[i].substring(1));
				deltaPoints[i] = Integer.parseInt(score[i].substring(1));
			}
			mainpage.setScore(i + 1, Integer.toString(total[i]), false);
		}
		return deltaPoints;
	}
	
	public boolean isEnd() {
		return this.end;
	}
	
	public int[] getTotal() {
		return total;
	}
	
	private void addGame(boolean isDraw, int winner, int loser, boolean selfdraw, String han, int fuku, int[] deltaPoints) {
		Game game = new Game();
		
		game.setDate(1, 1, 1);
		game.setGameNumber(this.game);
		game.setRoundNumber(this.roundn);
		
		game.setDraw(isDraw);
		game.setWinner(winner - 1);
		game.setChunker(loser - 1);
		game.setSelfDraw(selfdraw);
		
		game.setHan(han);
		game.setFu(fuku);
		
		game.setPlayer(this.players);
		game.setTotalPoints(this.total);
		game.setDeltaPoints(deltaPoints);
		
		boolean richi[] = {riichi.contains(1), riichi.contains(2), riichi.contains(3), riichi.contains(4)};
		boolean ready[] = {draw.contains(1), draw.contains(2), draw.contains(3), draw.contains(4)};
		
		game.setIsRichi(richi);
		game.setReady(ready);
		riichi.clear();
		
		GameDataHandler.addGameData(game);
	}
	
	/**
	 * Accessor for btn1
	 * @return JButton btn1
	 */
	public JButton getBtn1() {
		return mainpage.getBtn1();
	}
	
	/**
	 * Accessor for btn2
	 * @return JButton btn2
	 */
	public JButton getBtn2() {
		return mainpage.getBtn2();
	}
}