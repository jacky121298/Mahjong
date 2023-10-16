package GUI;

import javax.swing.*;
import java.awt.event.*;
import record_data.*;

public class HistoryGUI {
	
	private History history = null;
	private int ID;
	
	/**
	 * Default constructor for class History1GUI
	 */
	public HistoryGUI(int ID) {
		history = new History();
		this.ID = ID;
	}
	
	/**
	 * Launch the History
	 */
	public void launch() {
		history.setUser(ID);
		history.setData(new CalculateStatistic().calculate(UserGUI.getUser(ID)));
		
		BtnListener btnl = new BtnListener();
		history.getBack().addActionListener(btnl);
		history.getBack().setActionCommand("Back" + Integer.toString(ID));
		
		history.getNext().addActionListener(btnl);
		history.getNext().setActionCommand("Next" + Integer.toString(ID));
		history.setVisible(true);
	}
	
	class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Back" + Integer.toString(ID))) {
				history.setVisible(false);
			}
			
			else if (e.getActionCommand().equals("Next" + Integer.toString(ID))) {
				history.setVisible(false);
			}
		}
	}
	
	/**
	 * Accessor for btnBack
	 * @return JButton btnBack
	 */
	public JButton getBack() {
		return history.getBack();
	}
	
	/**
	 * Accessor for btnNext
	 * @return JButton btnNext
	 */
	public JButton getNext() {
		return history.getNext();
	}
}