package GUI;

import java.awt.*;
import javax.swing.*;

public class Warning extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JLabel lblWarning;
	private JButton btnEnter;
	
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warning warning = new Warning();
					warning.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Default constructor for class Warning
	 */
	public Warning() {
		setModal(true);
		setTitle("Warning");
		setBounds(100, 100, 450, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/src/Icon/error.png"));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(224, 255, 255));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblWarning = new JLabel("Invalid han & fuku!");
		lblWarning.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblWarning.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarning.setBounds(62, 50, 307, 106);
		getContentPane().add(lblWarning);
		
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnEnter.setBackground(new Color(255, 250, 240));
		btnEnter.setBounds(0, 189, 432, 64);
		getContentPane().add(btnEnter);
	}
	
	/**
	 * Accessor for btnEnter
	 * @return JButton btnEnter
	 */
	public JButton getEnter() {
		return btnEnter;
	}
}