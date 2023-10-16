package GUI;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	
	private JButton btn31;
	private JButton btn32;
	private JButton btn33;
	private JButton btn34;
	
	private JButton btn71;
	private JButton btn72;
	private JButton btn73;
	private JButton btn74;
	
	private JButton btn91;
	private JButton btn92;
	private JButton btn93;
	private JButton btn94;
	
	private JLabel lblUser1;
	private JLabel lblUser2;
	private JLabel lblUser3;
	private JLabel lblUser4;
	
	private JLabel lblScore1;
	private JLabel lblScore2;
	private JLabel lblScore3;
	private JLabel lblScore4;
	
	private JLabel lblDir1;
	private JLabel lblDir2;
	private JLabel lblDir3;
	private JLabel lblDir4;
	
	private JButton btn1;
	private JButton btn2;
	
	private JLabel lblEntrust;
	private JLabel lblRound;
	private JLabel lblNum;
	
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage main = new MainPage();
					main.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Default constructor for class MainPage
	 */
	public MainPage() {
		getContentPane().setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		getContentPane().setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/src/Icon.png"));
		setBounds(100, 100, 1032, 624);
		setTitle("Battle Mode");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 338, 192);
		panel1.setLayout(null);
		getContentPane().add(panel1);
		
		btn11 = new JButton("\u80E1");
		btn11.setBackground(new Color(224, 255, 255));
		btn11.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn11.setBounds(0, 0, 169, 96);
		btn11.setActionCommand("110");
		panel1.add(btn11);
		
		btn12 = new JButton("\u81EA\u6478");
		btn12.setBackground(new Color(224, 255, 255));
		btn12.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn12.setBounds(169, 0, 169, 96);
		btn12.setActionCommand("120");
		panel1.add(btn12);
		
		btn13 = new JButton("\u7ACB\u76F4");
		btn13.setBackground(new Color(224, 255, 255));
		btn13.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn13.setBounds(0, 96, 169, 96);
		btn13.setActionCommand("130");
		panel1.add(btn13);
		
		btn14 = new JButton("\u8A50\u80E1");
		btn14.setBackground(new Color(224, 255, 255));
		btn14.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn14.setBounds(169, 96, 169, 96);
		btn14.setActionCommand("140");
		panel1.add(btn14);
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(0, 255, 127));
		panel2.setBounds(338, 0, 338, 192);
		panel2.setLayout(null);
		getContentPane().add(panel2);
		
		lblUser3 = new JLabel("User3: " + UserGUI.getUser(3));
		lblUser3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblUser3.setBounds(45, 35, 250, 50);
		panel2.add(lblUser3);
		
		lblScore3 = new JLabel("");
		lblScore3.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore3.setBounds(165, 110, 128, 50);
		panel2.add(lblScore3);
		
		lblDir3 = new JLabel("");
		lblDir3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDir3.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblDir3.setBounds(50, 110, 50, 50);
		panel2.add(lblDir3);
		
		panel3 = new JPanel();
		panel3.setBounds(676, 0, 338, 192);
		panel3.setLayout(null);
		getContentPane().add(panel3);
		
		btn31 = new JButton("\u80E1");
		btn31.setBackground(new Color(224, 255, 255));
		btn31.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn31.setBounds(0, 0, 169, 96);
		btn31.setActionCommand("310");
		panel3.add(btn31);
		
		btn32 = new JButton("\u81EA\u6478");
		btn32.setBackground(new Color(224, 255, 255));
		btn32.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn32.setBounds(169, 0, 169, 96);
		btn32.setActionCommand("320");
		panel3.add(btn32);
		
		btn33 = new JButton("\u7ACB\u76F4");
		btn33.setBackground(new Color(224, 255, 255));
		btn33.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn33.setBounds(0, 96, 169, 96);
		btn33.setActionCommand("330");
		panel3.add(btn33);
		
		btn34 = new JButton("\u8A50\u80E1");
		btn34.setBackground(new Color(224, 255, 255));
		btn34.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn34.setBounds(169, 96, 169, 96);
		btn34.setActionCommand("340");
		panel3.add(btn34);
		
		panel4 = new JPanel();
		panel4.setBackground(new Color(0, 255, 127));
		panel4.setBounds(0, 192, 338, 193);
		panel4.setLayout(null);
		getContentPane().add(panel4);
		
		lblUser4 = new JLabel("User4: " + UserGUI.getUser(4));
		lblUser4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblUser4.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser4.setBounds(45, 35, 250, 50);
		panel4.add(lblUser4);
		
		lblScore4 = new JLabel("");
		lblScore4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore4.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore4.setBounds(165, 110, 128, 50);
		panel4.add(lblScore4);
		
		lblDir4 = new JLabel("");
		lblDir4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDir4.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblDir4.setBounds(50, 110, 50, 50);
		panel4.add(lblDir4);
		
		panel5 = new JPanel();
		panel5.setBackground(new Color(0, 255, 127));
		panel5.setBounds(338, 192, 338, 193);
		panel5.setLayout(null);
		getContentPane().add(panel5);
		
		btn1 = new JButton("\u6D41\u5C40");
		btn1.setBackground(new Color(255, 250, 205));
		btn1.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn1.setBounds(50, 130, 100, 35);
		btn1.setActionCommand("Draw");
		panel5.add(btn1);
		
		btn2 = new JButton("\u9996\u9801");
		btn2.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn2.setBackground(new Color(255, 250, 205));
		btn2.setBounds(190, 130, 100, 35);
		btn2.setActionCommand("Home");
		panel5.add(btn2);
		
		lblRound = new JLabel("");
		lblRound.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblRound.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound.setBounds(50, 20, 100, 50);
		panel5.add(lblRound);
		
		lblNum = new JLabel("");
		lblNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblNum.setBounds(190, 20, 100, 50);
		panel5.add(lblNum);
		
		lblEntrust = new JLabel("");
		lblEntrust.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrust.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblEntrust.setBounds(70, 68, 200, 50);
		panel5.add(lblEntrust);
		
		panel6 = new JPanel();
		panel6.setBackground(new Color(0, 255, 127));
		panel6.setBounds(676, 192, 338, 193);
		panel6.setLayout(null);
		getContentPane().add(panel6);
		
		lblUser2 = new JLabel("User2: " + UserGUI.getUser(2));
		lblUser2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblUser2.setBounds(45, 35, 250, 50);
		panel6.add(lblUser2);
		
		lblScore2 = new JLabel("");
		lblScore2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore2.setBounds(165, 110, 128, 50);
		panel6.add(lblScore2);
		
		lblDir2 = new JLabel("");
		lblDir2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDir2.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblDir2.setBounds(50, 110, 50, 50);
		panel6.add(lblDir2);
		
		panel7 = new JPanel();
		panel7.setBounds(0, 385, 338, 192);
		panel7.setLayout(null);
		getContentPane().add(panel7);
		
		btn71 = new JButton("\u80E1");
		btn71.setBackground(new Color(224, 255, 255));
		btn71.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn71.setBounds(0, 0, 169, 96);
		btn71.setActionCommand("710");
		panel7.add(btn71);
		
		btn72 = new JButton("\u81EA\u6478");
		btn72.setBackground(new Color(224, 255, 255));
		btn72.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn72.setBounds(169, 0, 169, 96);
		btn72.setActionCommand("720");
		panel7.add(btn72);
		
		btn73 = new JButton("\u7ACB\u76F4");
		btn73.setBackground(new Color(224, 255, 255));
		btn73.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn73.setBounds(0, 96, 169, 96);
		btn73.setActionCommand("730");
		panel7.add(btn73);
		
		btn74 = new JButton("\u8A50\u80E1");
		btn74.setBackground(new Color(224, 255, 255));
		btn74.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn74.setBounds(169, 96, 169, 96);
		btn74.setActionCommand("740");
		panel7.add(btn74);
		
		panel8 = new JPanel();
		panel8.setBackground(new Color(0, 255, 127));
		panel8.setBounds(338, 385, 338, 192);
		panel8.setLayout(null);
		getContentPane().add(panel8);
		
		lblUser1 = new JLabel("User1: " + UserGUI.getUser(1));
		lblUser1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblUser1.setBounds(45, 35, 250, 50);
		panel8.add(lblUser1);
		
		lblScore1 = new JLabel("");
		lblScore1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblScore1.setBounds(165, 110, 128, 50);
		panel8.add(lblScore1);
		
		lblDir1 = new JLabel("");
		lblDir1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDir1.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblDir1.setBounds(50, 110, 50, 50);
		panel8.add(lblDir1);
		
		panel9 = new JPanel();
		panel9.setBounds(676, 385, 338, 192);
		panel9.setLayout(null);
		getContentPane().add(panel9);
		
		btn91 = new JButton("\u80E1");
		btn91.setBackground(new Color(224, 255, 255));
		btn91.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn91.setBounds(0, 0, 169, 96);
		btn91.setActionCommand("910");
		panel9.add(btn91);
		
		btn92 = new JButton("\u81EA\u6478");
		btn92.setBackground(new Color(224, 255, 255));
		btn92.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn92.setBounds(169, 0, 169, 96);
		btn92.setActionCommand("920");
		panel9.add(btn92);
		
		btn93 = new JButton("\u7ACB\u76F4");
		btn93.setBackground(new Color(224, 255, 255));
		btn93.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn93.setBounds(0, 96, 169, 96);
		btn93.setActionCommand("930");
		panel9.add(btn93);
		
		btn94 = new JButton("\u8A50\u80E1");
		btn94.setBackground(new Color(224, 255, 255));
		btn94.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btn94.setBounds(169, 96, 169, 96);
		btn94.setActionCommand("940");
		panel9.add(btn94);	
	}
	
	public void setScore(int ID, String score, boolean red) {
		switch(ID) {
			case 1:
				lblScore1.setText(score);
				if (red) lblScore1.setForeground(new Color(255, 0, 0));
				else lblScore1.setForeground(new Color(0, 0, 0));
				break;
			
			case 2:
				lblScore2.setText(score);
				if (red) lblScore2.setForeground(new Color(255, 0, 0));
				else lblScore2.setForeground(new Color(0, 0, 0));
				break;
			
			case 3:
				lblScore3.setText(score);
				if (red) lblScore3.setForeground(new Color(255, 0, 0));
				else lblScore3.setForeground(new Color(0, 0, 0));
				break;
				
			case 4:
				lblScore4.setText(score);
				if (red) lblScore4.setForeground(new Color(255, 0, 0));
				else lblScore4.setForeground(new Color(0, 0, 0));
				break;
		}
	}
	
	public void drawScore(String[] score) {
		for (int i = 0; i < 4; i++)
			setScore(i + 1, score[i], true);
	}
	
	public void setDir(ArrayList<String> dir, String round, int homba, int entrust) {
		lblDir1.setText(dir.get(0));
		lblDir2.setText(dir.get(1));
		lblDir3.setText(dir.get(2));
		lblDir4.setText(dir.get(3));
		
		lblEntrust.setText("供托點數: " + Integer.toString(entrust));
		lblRound.setText(round);
		lblNum.setText(Integer.toString(homba) + "本場");
	}
	
	public void setUser() {
		lblUser1.setText("User1: " + UserGUI.getUser(1));
		lblUser2.setText("User2: " + UserGUI.getUser(2));
		lblUser3.setText("User3: " + UserGUI.getUser(3));
		lblUser4.setText("User4: " + UserGUI.getUser(4));
	}
	
	public void drawMainPage(String b1, String b2, String b3, String b4, String cmd, String btn1text, String btn1act, String btn2text, String btn2act, Color c) {
		btn11.setText(b1);
		btn12.setText(b2);
		btn13.setText(b3);
		btn14.setText(b4);
		
		btn11.setBackground(c);
		btn12.setBackground(c);
		btn13.setBackground(c);
		btn14.setBackground(c);
		
		btn11.setActionCommand("11" + cmd);
		btn12.setActionCommand("12" + cmd);
		btn13.setActionCommand("13" + cmd);
		btn14.setActionCommand("14" + cmd);
		
		btn31.setText(b1);
		btn32.setText(b2);
		btn33.setText(b3);
		btn34.setText(b4);
		
		btn31.setBackground(c);
		btn32.setBackground(c);
		btn33.setBackground(c);
		btn34.setBackground(c);
		
		btn31.setActionCommand("31" + cmd);
		btn32.setActionCommand("32" + cmd);
		btn33.setActionCommand("33" + cmd);
		btn34.setActionCommand("34" + cmd);
		
		btn71.setText(b1);
		btn72.setText(b2);
		btn73.setText(b3);
		btn74.setText(b4);
		
		btn71.setBackground(c);
		btn72.setBackground(c);
		btn73.setBackground(c);
		btn74.setBackground(c);
		
		btn71.setActionCommand("71" + cmd);
		btn72.setActionCommand("72" + cmd);
		btn73.setActionCommand("73" + cmd);
		btn74.setActionCommand("74" + cmd);
		
		btn91.setText(b1);
		btn92.setText(b2);
		btn93.setText(b3);
		btn94.setText(b4);
		
		btn91.setBackground(c);
		btn92.setBackground(c);
		btn93.setBackground(c);
		btn94.setBackground(c);
		
		btn91.setActionCommand("91" + cmd);
		btn92.setActionCommand("92" + cmd);
		btn93.setActionCommand("93" + cmd);
		btn94.setActionCommand("94" + cmd);
		
		btn1.setText(btn1text);
		btn1.setActionCommand(btn1act);
		btn2.setText(btn2text);
		btn2.setActionCommand(btn2act);
	}
	
	public void setConfirm() {
		drawMainPage("胡", "自摸", "立直", "詐胡", "0", "流局", "Draw", "首頁", "Home", new Color(224, 255, 255));
	}
	
	public void setDraw() {
		drawMainPage("聽", "沒聽", "", "", "1", "確認", "Confirm", "取消", "Cancel", new Color(245, 255, 250));
	}
	
	public void setWin() {
		drawMainPage("胡", "放槍", "", "", "2", "確認", "Win", "取消", "Cancel", new Color(245, 255, 250));
	}
	
	public void setSelf() {
		drawMainPage("", "自摸", "", "", "3", "確認", "Self", "取消", "Cancel", new Color(245, 255, 250));
	}
	
	public void setScam() {
		drawMainPage("", "", "", "詐胡", "4", "確認", "Scam", "取消", "Cancel", new Color(245, 255, 250));
	}
	
	/**
	 * Accessor for btn1
	 * @return JButton btn1
	 */
	public JButton getBtn1() {
		return btn1;
	}
	
	/**
	 * Accessor for btn2
	 * @return JButton btn2
	 */
	public JButton getBtn2() {
		return btn2;
	}
	
	/**
	 * Accessor for btn
	 * @return JButton btn
	 */
	public JButton getBtn(int num) {
		switch(num) {
			case 11: return btn11;
			case 12: return btn12;
			case 13: return btn13;
			case 14: return btn14;
			
			case 31: return btn31;
			case 32: return btn32;
			case 33: return btn33;
			case 34: return btn34;
			
			case 71: return btn71;
			case 72: return btn72;
			case 73: return btn73;
			case 74: return btn74;
			
			case 91: return btn91;
			case 92: return btn92;
			case 93: return btn93;
			case 94: return btn94;
			default: return null;
		}
	}
}