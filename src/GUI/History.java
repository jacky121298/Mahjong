package GUI;

import java.awt.*;
import javax.swing.*;
import record_data.*;

public class History extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel lblUser;
	
	private JButton btnBack;
	private JButton btnNext;
	
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl10;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl13;
	private JLabel lbl14;
	
	private JLabel lbl15;
	private JLabel lbl16;
	private JLabel lbl17;
	private JLabel lbl18;
	private JLabel lbl19;
	private JLabel lbl20;
	private JLabel lbl21;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History history = new History();
					history.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Default constructor for class History
	 */
	public History() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/src/Icon/history.png"));
		setTitle("History");
		setBounds(100, 100, 560, 632);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(224, 255, 255));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblUser = new JLabel("");
		lblUser.setForeground(new Color(255, 105, 180));
		lblUser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setBounds(115, 30, 320, 70);
		getContentPane().add(lblUser);
		
		btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 250, 205));
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnBack.setBounds(0, 533, 273, 52);
		getContentPane().add(btnBack);
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnNext.setBackground(new Color(255, 250, 205));
		btnNext.setBounds(269, 533, 273, 52);
		getContentPane().add(btnNext);
		
		JLabel lblGame = new JLabel("\u7E3D\u5171\u5C40\u6578:");
		lblGame.setForeground(new Color(30, 144, 255));
		lblGame.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setBounds(40, 120, 99, 36);
		getContentPane().add(lblGame);
		
		JLabel lblFirstRate = new JLabel("\u4E00\u4F4D\u7387:");
		lblFirstRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstRate.setForeground(new Color(30, 144, 255));
		lblFirstRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblFirstRate.setBounds(195, 120, 99, 36);
		getContentPane().add(lblFirstRate);
		
		JLabel lblSecondRate = new JLabel("\u4E8C\u4F4D\u7387:");
		lblSecondRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondRate.setForeground(new Color(30, 144, 255));
		lblSecondRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblSecondRate.setBounds(350, 120, 99, 36);
		getContentPane().add(lblSecondRate);
		
		JLabel lblThirdRate = new JLabel("\u4E09\u4F4D\u7387:");
		lblThirdRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblThirdRate.setForeground(new Color(30, 144, 255));
		lblThirdRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblThirdRate.setBounds(40, 180, 99, 36);
		getContentPane().add(lblThirdRate);
		
		JLabel lblDourthRate = new JLabel("\u56DB\u4F4D\u7387:");
		lblDourthRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDourthRate.setForeground(new Color(30, 144, 255));
		lblDourthRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblDourthRate.setBounds(195, 180, 99, 36);
		getContentPane().add(lblDourthRate);
		
		JLabel lblAveragePlace = new JLabel("\u5E73\u5747\u9806\u4F4D:");
		lblAveragePlace.setHorizontalAlignment(SwingConstants.CENTER);
		lblAveragePlace.setForeground(new Color(30, 144, 255));
		lblAveragePlace.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblAveragePlace.setBounds(350, 180, 99, 36);
		getContentPane().add(lblAveragePlace);
		
		JLabel lblRichiRate = new JLabel("\u7ACB\u76F4\u7387:");
		lblRichiRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRichiRate.setForeground(new Color(30, 144, 255));
		lblRichiRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblRichiRate.setBounds(40, 240, 99, 36);
		getContentPane().add(lblRichiRate);
		
		JLabel lblChunkerRate = new JLabel("\u653E\u69CD\u7387:");
		lblChunkerRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblChunkerRate.setForeground(new Color(30, 144, 255));
		lblChunkerRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblChunkerRate.setBounds(195, 240, 99, 36);
		getContentPane().add(lblChunkerRate);
		
		JLabel lblSelfDrawRate = new JLabel("\u81EA\u6478\u7387:");
		lblSelfDrawRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelfDrawRate.setForeground(new Color(30, 144, 255));
		lblSelfDrawRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblSelfDrawRate.setBounds(350, 240, 99, 36);
		getContentPane().add(lblSelfDrawRate);
		
		JLabel lblLonRate = new JLabel("\u69AE\u548C\u7387:");
		lblLonRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblLonRate.setForeground(new Color(30, 144, 255));
		lblLonRate.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblLonRate.setBounds(40, 300, 99, 36);
		getContentPane().add(lblLonRate);
		
		JLabel lblAverageHan = new JLabel("\u5E73\u5747\u756A\u6578:");
		lblAverageHan.setHorizontalAlignment(SwingConstants.CENTER);
		lblAverageHan.setForeground(new Color(30, 144, 255));
		lblAverageHan.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblAverageHan.setBounds(195, 300, 99, 36);
		getContentPane().add(lblAverageHan);
		
		JLabel lblOneHan = new JLabel("\u4E00\u756A:");
		lblOneHan.setHorizontalAlignment(SwingConstants.CENTER);
		lblOneHan.setForeground(new Color(30, 144, 255));
		lblOneHan.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblOneHan.setBounds(350, 300, 99, 36);
		getContentPane().add(lblOneHan);
		
		JLabel lblTwoHan = new JLabel("\u4E8C\u756A:");
		lblTwoHan.setHorizontalAlignment(SwingConstants.CENTER);
		lblTwoHan.setForeground(new Color(30, 144, 255));
		lblTwoHan.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblTwoHan.setBounds(40, 360, 99, 36);
		getContentPane().add(lblTwoHan);
		
		JLabel lblThreeHan = new JLabel("\u4E09\u756A:");
		lblThreeHan.setHorizontalAlignment(SwingConstants.CENTER);
		lblThreeHan.setForeground(new Color(30, 144, 255));
		lblThreeHan.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblThreeHan.setBounds(195, 360, 99, 36);
		getContentPane().add(lblThreeHan);
		
		JLabel lblFourHan = new JLabel("\u56DB\u756A:");
		lblFourHan.setHorizontalAlignment(SwingConstants.CENTER);
		lblFourHan.setForeground(new Color(30, 144, 255));
		lblFourHan.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblFourHan.setBounds(350, 360, 99, 36);
		getContentPane().add(lblFourHan);
		
		JLabel lblMoreThanFiveHan = new JLabel("\u4E94\u756A\u4EE5\u4E0A:");
		lblMoreThanFiveHan.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoreThanFiveHan.setForeground(new Color(30, 144, 255));
		lblMoreThanFiveHan.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblMoreThanFiveHan.setBounds(40, 420, 99, 36);
		getContentPane().add(lblMoreThanFiveHan);
		
		JLabel lblBaiman = new JLabel("\u500D\u6EFF:");
		lblBaiman.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaiman.setForeground(new Color(30, 144, 255));
		lblBaiman.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblBaiman.setBounds(40, 480, 99, 36);
		getContentPane().add(lblBaiman);
		
		JLabel lblMangan = new JLabel("\u6EFF\u8CAB:");
		lblMangan.setHorizontalAlignment(SwingConstants.CENTER);
		lblMangan.setForeground(new Color(30, 144, 255));
		lblMangan.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblMangan.setBounds(195, 420, 99, 36);
		getContentPane().add(lblMangan);
		
		JLabel lblHaneman = new JLabel("\u8DF3\u6EFF:");
		lblHaneman.setHorizontalAlignment(SwingConstants.CENTER);
		lblHaneman.setForeground(new Color(30, 144, 255));
		lblHaneman.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblHaneman.setBounds(350, 420, 99, 36);
		getContentPane().add(lblHaneman);
		
		JLabel lblSanbaiman = new JLabel("\u4E09\u500D\u6EFF:");
		lblSanbaiman.setHorizontalAlignment(SwingConstants.CENTER);
		lblSanbaiman.setForeground(new Color(30, 144, 255));
		lblSanbaiman.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblSanbaiman.setBounds(195, 480, 99, 36);
		getContentPane().add(lblSanbaiman);
		
		JLabel lblYakuman = new JLabel("\u5F79\u6EFF:");
		lblYakuman.setHorizontalAlignment(SwingConstants.CENTER);
		lblYakuman.setForeground(new Color(30, 144, 255));
		lblYakuman.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblYakuman.setBounds(350, 480, 99, 36);
		getContentPane().add(lblYakuman);
		
		lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl1.setBounds(140, 120, 60, 36);
		getContentPane().add(lbl1);
		
		lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl2.setBounds(295, 120, 60, 36);
		getContentPane().add(lbl2);
		
		lbl3 = new JLabel("");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl3.setBounds(450, 120, 60, 36);
		getContentPane().add(lbl3);
		
		lbl4 = new JLabel("");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl4.setBounds(140, 180, 60, 36);
		getContentPane().add(lbl4);
		
		lbl5 = new JLabel("");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl5.setBounds(295, 180, 60, 36);
		getContentPane().add(lbl5);
		
		lbl6 = new JLabel("");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl6.setBounds(450, 180, 60, 36);
		getContentPane().add(lbl6);
		
		lbl7 = new JLabel("");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl7.setBounds(140, 240, 60, 36);
		getContentPane().add(lbl7);
		
		lbl8 = new JLabel("");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl8.setBounds(295, 240, 60, 36);
		getContentPane().add(lbl8);
		
		lbl9 = new JLabel("");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl9.setBounds(450, 240, 60, 36);
		getContentPane().add(lbl9);
		
		lbl10 = new JLabel("");
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl10.setBounds(140, 300, 60, 36);
		getContentPane().add(lbl10);
		
		lbl11 = new JLabel("");
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl11.setBounds(295, 300, 60, 36);
		getContentPane().add(lbl11);
		
		lbl12 = new JLabel("");
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl12.setBounds(450, 300, 60, 36);
		getContentPane().add(lbl12);
		
		lbl13 = new JLabel("");
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl13.setBounds(140, 360, 60, 36);
		getContentPane().add(lbl13);
		
		lbl14 = new JLabel("");
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl14.setBounds(295, 360, 60, 36);
		getContentPane().add(lbl14);
		
		lbl15 = new JLabel("");
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl15.setBounds(450, 360, 60, 36);
		getContentPane().add(lbl15);
		
		lbl16 = new JLabel("");
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl16.setBounds(153, 420, 60, 36);
		getContentPane().add(lbl16);
		
		lbl17 = new JLabel("");
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl17.setBounds(295, 420, 60, 36);
		getContentPane().add(lbl17);
		
		lbl18 = new JLabel("");
		lbl18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl18.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl18.setBounds(450, 420, 60, 36);
		getContentPane().add(lbl18);
		
		lbl19 = new JLabel("");
		lbl19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl19.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl19.setBounds(140, 480, 60, 36);
		getContentPane().add(lbl19);
		
		lbl20 = new JLabel("");
		lbl20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl20.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl20.setBounds(295, 480, 60, 36);
		getContentPane().add(lbl20);
		
		lbl21 = new JLabel("");
		lbl21.setHorizontalAlignment(SwingConstants.CENTER);
		lbl21.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lbl21.setBounds(450, 480, 60, 36);
		getContentPane().add(lbl21);
	}
	
	public void setUser(int ID) {
		lblUser.setText("User" + Integer.toString(ID) + ": " + UserGUI.getUser(ID));
	}
	
	public void setData(Statistic statistic) {
		lbl1.setText(Integer.toString(statistic.getNumberOfGame()));
		lbl2.setText(String.format("%.1f", statistic.getFirstRate()));
		lbl3.setText(String.format("%.1f", statistic.getSecondRate()));
		lbl4.setText(String.format("%.1f", statistic.getThirdRate()));
		lbl5.setText(String.format("%.1f", statistic.getFourthRate()));
		lbl6.setText(String.format("%.1f", statistic.getAveragePlace()));
		lbl7.setText(String.format("%.1f", statistic.getRichiRate()));
		
		lbl8.setText(String.format("%.1f", statistic.getChunkerRate()));
		lbl9.setText(String.format("%.1f", statistic.getSelfDrawRate()));
		lbl10.setText(String.format("%.1f", statistic.getLonRate()));
		lbl11.setText(String.format("%.1f", statistic.getAverageHan()));
		lbl12.setText(Integer.toString(statistic.getOneHan()));
		lbl13.setText(Integer.toString(statistic.getTwoHan()));
		lbl14.setText(Integer.toString(statistic.getThreeHan()));
		
		lbl15.setText(Integer.toString(statistic.getFourHan()));
		lbl16.setText(Integer.toString(statistic.getMoreThanFiveHan()));
		lbl17.setText(Integer.toString(statistic.getMangan()));
		lbl18.setText(Integer.toString(statistic.getHaneman()));
		lbl19.setText(Integer.toString(statistic.getBaiman()));
		lbl20.setText(Integer.toString(statistic.getSanbaiman()));
		lbl21.setText(Integer.toString(statistic.getYakuman()));
	}
	
	/**
	 * Accessor for btnBack
	 * @return JButton btnBack
	 */
	public JButton getBack() {
		return btnBack;
	}
	
	/**
	 * Accessor for btnNext
	 * @return JButton btnNext
	 */
	public JButton getNext() {
		return btnNext;
	}
}