package GUI;

import javax.swing.*;
import java.awt.event.*;

public class FinalPageGUI {
	
	private FinalPage finalpage = null;
	
	/**
	 * Default constructor for class MainPageGUI
	 */
	public FinalPageGUI(int[] total) {
		finalpage = new FinalPage();
		finalpage.setUser(total);
	}
	
	/**
	 * Launch the MainPage
	 */
	public void launch() {
		finalpage.setVisible(true);
		finalpage.getHome().addActionListener(new HomeListener());
	}
	
	class HomeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			finalpage.setVisible(false);
		}
	}
	
	/**
	 * Accessor for btnHome
	 * @return JButton btnHome
	 */
	public JButton getHome() {
		return finalpage.getHome();
	}
}