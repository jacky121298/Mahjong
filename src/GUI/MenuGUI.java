package GUI;

import java.util.*;
import javax.swing.*;

import database_utils.GameDataHandler;

import java.awt.event.*;
import record_data.*;

public class MenuGUI {
	
	private Menu menu = null;
	private MainPageGUI gui = null;
	private boolean setuser = false;
	
	private HistoryGUI history1;
	private HistoryGUI history2;
	private HistoryGUI history3;
	private HistoryGUI history4;
	
	private int roundn = 0;
	
	/**
	 * Default constructor for class MenuGUI
	 */
	public MenuGUI() {
		menu = new Menu();
		
		history1 = new HistoryGUI(1);
		history1.getBack().addActionListener(new HistoryListener());
		history1.getNext().addActionListener(new HistoryListener());
		
		history2 = new HistoryGUI(2);
		history2.getBack().addActionListener(new HistoryListener());
		history2.getNext().addActionListener(new HistoryListener());
		
		history3 = new HistoryGUI(3);
		history3.getBack().addActionListener(new HistoryListener());
		history3.getNext().addActionListener(new HistoryListener());
		
		history4 = new HistoryGUI(4);
		history4.getBack().addActionListener(new HistoryListener());
		history4.getNext().addActionListener(new HistoryListener());
		
		GameDataHandler.createGameDataTable();
		GameDataHandler.deleteAllGameData();
	}
	
	/**
	 * Launch the Menu
	 */
	public void launch() {
		menu.getBattleMode().addActionListener(new BattleModeListener());
		menu.getHistory().addActionListener(new HistoryListener());
		menu.setVisible(true);
	}
	
	class BattleModeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (setuser == false) {
				menu.setVisible(false);
				setuser = true;
				
				UserGUI gui = new UserGUI();
				
				JButton back = gui.getBack();
				back.setActionCommand("User");
				back.addActionListener(new BackListener());
				
				JButton enter = gui.getEnter();
				enter.addActionListener(new EnterListener());
				
				gui.launch();
			}
			
			else {
				menu.setVisible(false);
				gui = new MainPageGUI(roundn++);
				gui.getBtn1().addActionListener(new FinalPageListener());
				gui.launch();
				
				JButton btn2 = gui.getBtn2();
				btn2.addActionListener(new BackListener());
			}
		}
	}
	
	class HistoryListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("History")) {
				menu.setVisible(false);
				history1.launch();
			}
			
			else if (e.getActionCommand().equals("Back1"))
				menu.setVisible(true);
			
			else if (e.getActionCommand().equals("Next1"))
				history2.launch();
			
			else if (e.getActionCommand().equals("Back2"))
				history1.launch();
			
			else if (e.getActionCommand().equals("Next2"))
				history3.launch();
			
			else if (e.getActionCommand().equals("Back3"))
				history2.launch();
			
			else if (e.getActionCommand().equals("Next3"))
				history4.launch();
			
			else if (e.getActionCommand().equals("Back4"))
				history3.launch();
			
			else if (e.getActionCommand().equals("Next4"))
				menu.setVisible(true);
		}
	}

	class BackListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "Home" || e.getActionCommand() == "User")
				menu.setVisible(true);
			if (e.getActionCommand() == "User")
				setuser = false;
		}
	}
	
	class EnterListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			gui = new MainPageGUI(roundn++);
			gui.getBtn1().addActionListener(new FinalPageListener());
			gui.launch();
			
			JButton btn2 = gui.getBtn2();
			btn2.addActionListener(new BackListener());
		}
	}
	
	class FinalPageListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (gui.isEnd()) {
				FinalPageGUI fgui = new FinalPageGUI(gui.getTotal());
				fgui.getHome().addActionListener(new BackListener());
				fgui.launch();
			}
		}
	}
}