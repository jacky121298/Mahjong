package GUI;

import java.awt.*;
import javax.swing.*;

public class User extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	
	private JButton btnEnter;
	private JButton btnCancel;
	private JButton btnBack;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User user = new User();
					user.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Default constructor for class User
	 */
	public User() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/src/Icon/user.png"));
		getContentPane().setBackground(new Color(224, 255, 255));
		setTitle("User Setting");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lbl1 = new JLabel("User 1:");
		lbl1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(33, 30, 80, 34);
		getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("User 2:");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl2.setBounds(33, 80, 80, 34);
		getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("User 3:");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl3.setBounds(33, 130, 80, 34);
		getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("User 4:");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl4.setBounds(33, 180, 80, 34);
		getContentPane().add(lbl4);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setColumns(10);
		textField1.setBounds(127, 30, 147, 34);
		textField1.setActionCommand("1");
		getContentPane().add(textField1);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setColumns(10);
		textField2.setBounds(127, 80, 147, 34);
		textField2.setActionCommand("2");
		getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setColumns(10);
		textField3.setBounds(127, 130, 147, 34);
		textField3.setActionCommand("3");
		getContentPane().add(textField3);
		
		textField4 = new JTextField();
		textField4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField4.setHorizontalAlignment(SwingConstants.CENTER);
		textField4.setColumns(10);
		textField4.setBounds(127, 180, 147, 34);
		textField4.setActionCommand("4");
		getContentPane().add(textField4);
		
		btnEnter = new JButton("Enter");
		btnEnter.setBackground(new Color(255, 250, 205));
		btnEnter.setBounds(305, 155, 99, 27);
		getContentPane().add(btnEnter);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 250, 205));
		btnCancel.setBounds(305, 105, 99, 27);
		getContentPane().add(btnCancel);
		
		btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 250, 205));
		btnBack.setBounds(305, 55, 99, 27);
		getContentPane().add(btnBack);
	}
	
	/**
	 * Accessor for textField1
	 * @return JTextField textField1
	 */
	public JTextField getTextField1() {
		return textField1;
	}
	
	/**
	 * Accessor for textField2
	 * @return JTextField textField2
	 */
	public JTextField getTextField2() {
		return textField2;
	}
	
	/**
	 * Accessor for textField3
	 * @return JTextField textField3
	 */
	public JTextField getTextField3() {
		return textField3;
	}
	
	/**
	 * Accessor for textField4
	 * @return JTextField textField4
	 */
	public JTextField getTextField4() {
		return textField4;
	}
	
	/**
	 * Accessor for btnEnter
	 * @return JButton btnEnter
	 */
	public JButton getEnter() {
		return btnEnter;
	}
	
	/**
	 * Accessor for btnBack
	 * @return JButton btnBack
	 */
	public JButton getBack() {
		return btnBack;
	}
	
	/**
	 * Accessor for btnCancel
	 * @return JButton btnCancel
	 */
	public JButton getCancel() {
		return btnCancel;
	}
}