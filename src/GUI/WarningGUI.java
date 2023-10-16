package GUI;

import java.awt.event.*;
import javax.swing.*;

public class WarningGUI {
	private Warning warning = null;
	
	/**
	 * Default constructor for class WinGUI
	 */
	public WarningGUI() {
		warning = new Warning();
	}
	
	/**
	 * Launch the Win
	 */
	public void launch() {
		warning.getEnter().addActionListener(new EnterListener());
		warning.setVisible(true);
	}
	
	class EnterListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			warning.setVisible(false);
		}	
	}
	
	/**
	 * Accessor for btnEnter
	 * @return JButton btnEnter
	 */
	public JButton getEnter() {
		return warning.getEnter();
	}
}