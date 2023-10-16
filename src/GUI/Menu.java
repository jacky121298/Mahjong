package GUI;

import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton btnBattleMode;
	private JButton btnHistory;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu menu = new Menu();
					menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Default constructor for class Menu
	 */
	public Menu() {
		getContentPane().setBackground(new Color(224, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/src/Icon/mahjong.png"));
		this.setTitle("Mahjong Scoring System");
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		btnBattleMode = new JButton("Battle Mode");
		btnBattleMode.setBackground(new Color(255, 250, 205));
		btnBattleMode.setBounds(250, 125, 120, 37);
		this.getContentPane().add(btnBattleMode);
		
		btnHistory = new JButton("History");
		btnHistory.setBackground(new Color(255, 250, 205));
		btnHistory.setBounds(250, 180, 120, 37);
		btnHistory.setActionCommand("History");
		this.getContentPane().add(btnHistory);
		
		JLabel lblTitle = new JLabel("Welcome to Mahjong Scoring System!");
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(14, 0, 404, 107);
		getContentPane().add(lblTitle);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/Icon/mahjong.png"));
		lblNewLabel.setBounds(90, 90, 133, 155);
		getContentPane().add(lblNewLabel);
	}
	
	/**
	 * Accessor for btnBattleMode
	 * @return JButton btnBattleMode
	 */
	public JButton getBattleMode() {
		return btnBattleMode;
	}
	
	/**
	 * Accessor for btnHistory
	 * @return JButton btnHistory
	 */
	public JButton getHistory() {
		return btnHistory;
	}
}