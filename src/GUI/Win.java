package GUI;

import java.awt.*;
import javax.swing.*;

public class Win extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JLabel lblWinner;
	private JLabel lblWin1;
	private JLabel lblWin2;
	
	private JButton btnCancel;
	private JButton btnEnter;
	
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Win win = new Win();
					win.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Default constructor for class Win
	 */
	public Win() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/src/Icon/trophy.png"));
		getContentPane().setBackground(new Color(224, 255, 255));
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Winner");
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblWinner = new JLabel("");
		lblWinner.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setBounds(0, 0, 432, 87);
		getContentPane().add(lblWinner);
		
		lblWin1 = new JLabel("\u7FFB");
		lblWin1.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblWin1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWin1.setBounds(50, 100, 40, 40);
		getContentPane().add(lblWin1);
		
		lblWin2 = new JLabel("\u7B26");
		lblWin2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWin2.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblWin2.setBounds(210, 100, 40, 40);
		getContentPane().add(lblWin2);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnCancel.setBackground(new Color(255, 250, 240));
		btnCancel.setBounds(0, 189, 217, 64);
		getContentPane().add(btnCancel);
		
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnEnter.setBackground(new Color(255, 250, 240));
		btnEnter.setBounds(215, 189, 217, 64);
		getContentPane().add(btnEnter);
		
		UIManager.put("ComboBox.selectionBackground", new Color(127, 255, 150));
		
		comboBox1 = new JComboBox<String>();
		comboBox1.setMaximumRowCount(9);
		comboBox1.setBackground(new Color(255, 250, 205));
		comboBox1.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		comboBox1.setBounds(95, 100, 101, 40);
		comboBox1.addItem("1翻");
		comboBox1.addItem("2翻");
		comboBox1.addItem("3翻");
		comboBox1.addItem("4翻");
		comboBox1.addItem("滿貫");
		comboBox1.addItem("跳滿");
		comboBox1.addItem("倍滿");
		comboBox1.addItem("三倍滿");
		comboBox1.addItem("役滿");
		getContentPane().add(comboBox1);
		
		comboBox2 = new JComboBox<String>();
		comboBox2.setMaximumRowCount(11);
		comboBox2.setBackground(new Color(255, 250, 205));
		comboBox2.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		comboBox2.setBounds(264, 100, 101, 40);
		comboBox2.addItem("20符");
		comboBox2.addItem("25符");
		comboBox2.addItem("30符");
		comboBox2.addItem("40符");
		comboBox2.addItem("50符");
		comboBox2.addItem("60符");
		comboBox2.addItem("70符");
		comboBox2.addItem("80符");
		comboBox2.addItem("90符");
		comboBox2.addItem("100符");
		comboBox2.addItem("110符");
		getContentPane().add(comboBox2);
	}
	
	public void setWinner(String winner) {
		lblWinner.setText("Winner: " + winner);
	}
	
	/**
	 * Accessor for btnCancel
	 * @return JButton btnCancel
	 */
	public JButton getCancel() {
		return btnCancel;
	}
	
	/**
	 * Accessor for btnEnter
	 * @return JButton btnEnter
	 */
	public JButton getEnter() {
		return btnEnter;
	}
	
	/**
	 * Accessor for comboBox1
	 * @return JComboBox<String> comboBox1
	 */
	public JComboBox<String> getComboBox1() {
		return comboBox1;
	}
	
	/**
	 * Accessor for comboBox2
	 * @return JComboBox<String> comboBox2
	 */
	public JComboBox<String> getComboBox2() {
		return comboBox2;
	}
}