package GUI;

import java.awt.*;
import javax.swing.*;

public class FinalPage extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton btnHome;
	
	private JLabel lblName1;
	private JLabel lblName2;
	private JLabel lblName3;
	private JLabel lblName4;
	
	private JLabel lblUser1;
	private JLabel lblUser2;
	private JLabel lblUser3;
	private JLabel lblUser4;
	
	private JLabel lblScore1;
	private JLabel lblScore2;
	private JLabel lblScore3;
	private JLabel lblScore4;
	
	private JLabel lblTotal1;
	private JLabel lblTotal2;
	private JLabel lblTotal3;
	private JLabel lblTotal4;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalPage finalpage = new FinalPage();
					finalpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Default constructor for class FinalPage
	 */
	public FinalPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/src/Icon/score.png"));
		setTitle("Final Score");
		setBounds(100, 100, 560, 632);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(224, 255, 255));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblTitle = new JLabel("Final Score");
		lblTitle.setForeground(new Color(255, 0, 0));
		lblTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(165, 87, 200, 60);
		getContentPane().add(lblTitle);
		
		JLabel lblMedal = new JLabel("");
		lblMedal.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/Icon/medal.png"));
		lblMedal.setBounds(200, 15, 128, 140);
		getContentPane().add(lblMedal);
		
		lblUser1 = new JLabel("");
		lblUser1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblUser1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser1.setBounds(150, 180, 110, 60);
		getContentPane().add(lblUser1);
		
		lblUser2 = new JLabel("");
		lblUser2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblUser2.setBounds(150, 260, 110, 60);
		getContentPane().add(lblUser2);
		
		lblUser3 = new JLabel("");
		lblUser3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblUser3.setBounds(150, 340, 110, 60);
		getContentPane().add(lblUser3);
		
		lblUser4 = new JLabel("");
		lblUser4.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblUser4.setBounds(150, 420, 110, 60);
		getContentPane().add(lblUser4);
		
		btnHome = new JButton("Home Page");
		btnHome.setBackground(new Color(255, 250, 205));
		btnHome.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnHome.setBounds(0, 525, 542, 60);
		btnHome.setActionCommand("Home");
		getContentPane().add(btnHome);
		
		lblName1 = new JLabel("User1:");
		lblName1.setForeground(new Color(30, 144, 255));
		lblName1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName1.setBounds(45, 180, 100, 60);
		getContentPane().add(lblName1);
		
		lblName2 = new JLabel("User2:");
		lblName2.setForeground(new Color(30, 144, 255));
		lblName2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblName2.setBounds(45, 260, 100, 60);
		getContentPane().add(lblName2);
		
		lblName3 = new JLabel("User3:");
		lblName3.setForeground(new Color(30, 144, 255));
		lblName3.setHorizontalAlignment(SwingConstants.CENTER);
		lblName3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblName3.setBounds(45, 340, 100, 60);
		getContentPane().add(lblName3);
		
		lblName4 = new JLabel("User4:");
		lblName4.setForeground(new Color(30, 144, 255));
		lblName4.setHorizontalAlignment(SwingConstants.CENTER);
		lblName4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblName4.setBounds(45, 420, 100, 60);
		getContentPane().add(lblName4);
		
		lblScore1 = new JLabel("Score:");
		lblScore1.setForeground(new Color(30, 144, 255));
		lblScore1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore1.setBounds(270, 180, 100, 60);
		getContentPane().add(lblScore1);
		
		lblScore2 = new JLabel("Score:");
		lblScore2.setForeground(new Color(30, 144, 255));
		lblScore2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore2.setBounds(270, 260, 100, 60);
		getContentPane().add(lblScore2);
		
		lblScore3 = new JLabel("Score:");
		lblScore3.setForeground(new Color(30, 144, 255));
		lblScore3.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore3.setBounds(270, 340, 100, 60);
		getContentPane().add(lblScore3);
		
		lblScore4 = new JLabel("Score:");
		lblScore4.setForeground(new Color(30, 144, 255));
		lblScore4.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore4.setBounds(270, 420, 100, 60);
		getContentPane().add(lblScore4);
		
		lblTotal1 = new JLabel("");
		lblTotal1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotal1.setBounds(384, 180, 110, 60);
		getContentPane().add(lblTotal1);
		
		lblTotal2 = new JLabel("");
		lblTotal2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotal2.setBounds(384, 260, 110, 60);
		getContentPane().add(lblTotal2);
		
		lblTotal3 = new JLabel("");
		lblTotal3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotal3.setBounds(384, 340, 110, 60);
		getContentPane().add(lblTotal3);
		
		lblTotal4 = new JLabel("");
		lblTotal4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTotal4.setBounds(384, 420, 110, 60);
		getContentPane().add(lblTotal4);
	}
	
	public void setUser(int[] total) {
		lblUser1.setText(UserGUI.getUser(1));
		lblUser2.setText(UserGUI.getUser(2));
		lblUser3.setText(UserGUI.getUser(3));
		lblUser4.setText(UserGUI.getUser(4));
		
		lblTotal1.setText(Integer.toString(total[0]));
		lblTotal2.setText(Integer.toString(total[1]));
		lblTotal3.setText(Integer.toString(total[2]));
		lblTotal4.setText(Integer.toString(total[3]));
	}
	
	/**
	 * Accessor for btnHome
	 * @return JButton btnHome
	 */
	public JButton getHome() {
		return btnHome;
	}
}