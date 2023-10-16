package GUI;

import javax.swing.*;
import java.awt.event.*;

public class WinGUI {
	private Win win = null;
	private boolean isEast;
	private boolean self;
	
	private static String[] score = {"+0", "+0", "+0", "+0"};
	private static String han = "1翻";
	
	private static int fuku = 20;
	private int homba;
	private int winner;
	private int loser;
	private int host;
	
	/**
	 * Default constructor for class WinGUI
	 */
	public WinGUI(int winner, int loser, int host, int homba, boolean isEast, boolean self) {
		win = new Win();
		win.setWinner(UserGUI.getUser(winner));
		
		this.winner = winner;
		this.loser = loser;
		this.host = host;
		
		this.homba = homba;
		this.isEast = isEast;
		this.self = self;
		
		WinGUI.han = "1翻";
		WinGUI.fuku = 20;
	}
	
	/**
	 * Launch the Win
	 */
	public void launch() {
		win.getComboBox1().addItemListener(new Combo1Listener());
		win.getComboBox2().addItemListener(new Combo2Listener());
		win.getCancel().addActionListener(new CancelListener());
		win.getEnter().addActionListener(new EnterListener());
		win.setVisible(true);
	}
	
	class Combo1Listener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				han = win.getComboBox1().getSelectedItem().toString();
			}
		}
	}
	
	class Combo2Listener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				String item = win.getComboBox2().getSelectedItem().toString();
				fuku = Integer.parseInt(item.substring(0, item.indexOf("符")));
			}
		}
	}
	
	class CancelListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			win.setVisible(false);
		}	
	}
	
	class EnterListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (checkVaild(han, fuku)) {
				// 自摸
				if (self) {
					if (isEast) {
						int point = Score.TsumoCalculateScore(isEast, han, fuku, homba, !isEast);
						for (int i = 0; i < 4; i++) {
							if ((i+1) == winner) score[i] = "+" + Integer.toString(3 * point);
							else score[i] = "-" + Integer.toString(point);
						}
					}
					
					else {
						int total = 0, point = 0;
						for (int i = 0; i < 4; i++) {
							if ((i+1) == host) point = Score.TsumoCalculateScore(isEast, han, fuku, homba, true);
							else if ((i+1) != winner) point = Score.TsumoCalculateScore(isEast, han, fuku, homba, false);
							if ((i+1) != winner) {
								score[i] = "-" + Integer.toString(point);
								total += point;
							}
						}
						score[winner - 1] = "+" + Integer.toString(total);
					}
				}
				
				// 胡
				else {
					int point = Score.RonCalculateScore(isEast, han, fuku, homba);
					for (int i = 0; i < 4; i++) {
						if ((i+1) == winner) score[i] = "+" + Integer.toString(point);
						else if ((i+1) == loser) score[i] = "-" + Integer.toString(point);
						else score[i] = "+0";
					}
				}
			
				win.setVisible(false);
			}
			
			else {
				WarningGUI gui = new WarningGUI();
				gui.launch();
			}
		}	
	}
	
	public static boolean checkVaild(String han, int fuku) {
		if ((han.equals("1翻") && fuku < 30) || (han.equals("2翻") && fuku < 25) || (han.equals("3翻") && (fuku < 25 || fuku > 60)) || (han.equals("4翻") && (fuku < 25 || fuku > 30))) {
			return false;
		}
		else return true;
	}
	
	public static String[] getScore() {
		return score;
	}
	
	public static String getHan() {
		return han;
	}
	
	public static int getFuku() {
		return fuku;
	}
	
	/**
	 * Accessor for btnCancel
	 * @return JButton btnCancel
	 */
	public JButton getCancel() {
		return win.getCancel();
	}
	
	/**
	 * Accessor for btnEnter
	 * @return JButton btnEnter
	 */
	public JButton getEnter() {
		return win.getEnter();
	}
}