package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UserGUI {
	
	private User user = null;
	private static String user1 = "A";
	private static String user2 = "B";
	private static String user3 = "C";
	private static String user4 = "D";
	
	/**
	 * Default constructor for class UserGUI
	 */
	public UserGUI() {
		user = new User();
	}
	
	/**
	 * Launch the User
	 */
	public void launch() {
		TextFieldListener tfl = new TextFieldListener();
		user.getTextField1().addActionListener(tfl);
		user.getTextField2().addActionListener(tfl);
		user.getTextField3().addActionListener(tfl);
		user.getTextField4().addActionListener(tfl);
		
		user.getEnter().addActionListener(new EnterListener());
		user.getBack().addActionListener(new BackListener());
		user.getCancel().addActionListener(new CancelListener());
		user.setVisible(true);
	}
	
	class TextFieldListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch(Integer.parseInt(e.getActionCommand())) {
				case 1: user1 = user.getTextField1().getText(); user.getTextField1().setBackground(new Color(127, 255, 212)); break;
				case 2: user2 = user.getTextField2().getText(); user.getTextField2().setBackground(new Color(127, 255, 212)); break;
				case 3: user3 = user.getTextField3().getText(); user.getTextField3().setBackground(new Color(127, 255, 212)); break;
				case 4: user4 = user.getTextField4().getText(); user.getTextField4().setBackground(new Color(127, 255, 212)); break;
			}
		}
	}
	
	class EnterListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			user1 = user.getTextField1().getText();
			user2 = user.getTextField2().getText();
			user3 = user.getTextField3().getText();
			user4 = user.getTextField4().getText();
			
			user.setVisible(false);
		}
	}
	
	class BackListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			user.setVisible(false);
		}
	}
	
	class CancelListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			user.getTextField1().setText("");
			user.getTextField2().setText("");
			user.getTextField3().setText("");
			user.getTextField4().setText("");
			
			user.getTextField1().setBackground(new Color(255, 255, 255));
			user.getTextField2().setBackground(new Color(255, 255, 255));
			user.getTextField3().setBackground(new Color(255, 255, 255));
			user.getTextField4().setBackground(new Color(255, 255, 255));
			
			user1 = user2 = user3 = user4 = null;
		}
	}
	
	/**
	 * Accessor for user name
	 * @param ID user id
	 * @return user name
	 */
	public static String getUser(int ID) {
		switch(ID) {
			case 1: return user1;
			case 2: return user2;
			case 3: return user3;
			case 4: return user4;
			default: return "";
		}
	}
	
	/**
	 * Accessor for btnBack
	 * @return JButton btnBack
	 */
	public JButton getBack() {
		return user.getBack();
	}
	
	/**
	 * Accessor for btnEnter
	 * @return JButton btnEnter
	 */
	public JButton getEnter() {
		return user.getEnter();
	}
}