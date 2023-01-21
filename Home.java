

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.SoftBevelBorder;

//import com.mysql.cj.jdbc.exceptions.MySQLQueryInterruptedException;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.sql.SQLClientInfoException;
import java.text.SimpleDateFormat;
import java.time.OffsetTime;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.management.loading.PrivateClassLoader;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.CardLayout;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JMenu;

public class Home extends JFrame {

	private JPanel contentPane;
	//private UserLoginPanel ulp;
	//private ExecSQL sql;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(0, 0, 334, 473);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(". . . . . .");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Myanmar MN", Font.BOLD, 48));
		lblNewLabel_1.setBounds(25, -17, 218, 68);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("] ] ] ] ] ]");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Klee", Font.PLAIN, 29));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(33, 22, 165, 60);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/nccu.jpeg")));
		lblNewLabel.setBounds(6, 43, 456, 245);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3 = new JLabel("Higher  faster  stronger");
		lblNewLabel_3.setFont(new Font("LingWai SC", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setBounds(129, 265, 241, 112);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NCCU");
		lblNewLabel_4.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_4.setForeground(new Color(102, 102, 102));
		lblNewLabel_4.setBounds(21, 383, 253, 68);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(334, 0, 391, 473);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 21, 391, 452);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(86, 2, 199, 27);
		panel_2.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"山下體育館：第一場地", "山下體育館：第二場地", "山下體育館：第三場地", "山下體育館：第四場地","環山運動場：五期排球場","環山運動場：五期籃球場"}));
		
		JLabel lblNewLabel_5= new JLabel("當前場地：");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(16, 6, 76, 16);
		panel_2.add(lblNewLabel_5);
		
		JLabel eight = new JLabel("  8:00    ---------------------------------");
		eight.setForeground(Color.GRAY);
		eight.setBounds(36, 53, 345, 16);
		panel_2.add(eight);
		
		JLabel ten = new JLabel("10:00    ---------------------------------");
		ten.setForeground(Color.GRAY);
		ten.setBounds(36, 99, 345, 16);
		panel_2.add(ten);
		
		JLabel nine = new JLabel("  9:00    ---------------------------------");
		nine.setForeground(Color.GRAY);
		nine.setBounds(36, 76, 345, 16);
		panel_2.add(nine);
		
		JLabel thirteen = new JLabel("13:00    ---------------------------------");
		thirteen.setForeground(Color.GRAY);
		thirteen.setBounds(36, 168, 345, 16);
		panel_2.add(thirteen);
		
		JLabel twelve = new JLabel("12:00    ---------------------------------");
		twelve.setForeground(Color.GRAY);
		twelve.setBounds(36, 145, 345, 16);
		panel_2.add(twelve);
		
		JLabel eleven = new JLabel("11:00    ---------------------------------");
		eleven.setForeground(Color.GRAY);
		eleven.setBounds(36, 122, 345, 16);
		panel_2.add(eleven);
		
		JLabel sixteen = new JLabel("16:00    ---------------------------------");
		sixteen.setForeground(Color.GRAY);
		sixteen.setBounds(36, 237, 345, 16);
		panel_2.add(sixteen);
		
		JLabel fifteen = new JLabel("15:00    ---------------------------------");
		fifteen.setForeground(Color.GRAY);
		fifteen.setBounds(36, 214, 345, 16);
		panel_2.add(fifteen);
		
		JLabel fourteen = new JLabel("14:00    ---------------------------------");
		fourteen.setForeground(Color.GRAY);
		fourteen.setBounds(36, 191, 345, 16);
		panel_2.add(fourteen);
		
		JLabel seventeen = new JLabel("17:00    ---------------------------------");
		seventeen.setForeground(Color.GRAY);
		seventeen.setBounds(36, 260, 345, 16);
		panel_2.add(seventeen);
		
		JLabel twenty = new JLabel("20:00    ---------------------------------");
		twenty.setForeground(Color.GRAY);
		twenty.setBounds(36, 329, 345, 16);
		panel_2.add(twenty);
		
		JLabel nineteen = new JLabel("19:00    ---------------------------------");
		nineteen.setForeground(Color.GRAY);
		nineteen.setBounds(36, 306, 345, 16);
		panel_2.add(nineteen);
		
		JLabel eighteen = new JLabel("18:00    ---------------------------------");
		eighteen.setForeground(Color.GRAY);
		eighteen.setBounds(36, 283, 345, 16);
		panel_2.add(eighteen);
		
		JLabel twentyone = new JLabel("21:00    ---------------------------------");
		twentyone.setForeground(Color.GRAY);
		twentyone.setBounds(36, 352, 345, 16);
		panel_2.add(twentyone);
		
		JLabel closetime = new JLabel("23:30    ---------------------------------");
		closetime.setForeground(Color.GRAY);
		closetime.setBounds(36, 398, 345, 16);
		panel_2.add(closetime);
		
		JLabel tewntytwo = new JLabel("22:00    ---------------------------------");
		tewntytwo.setForeground(Color.GRAY);
		tewntytwo.setBounds(36, 375, 345, 16);
		panel_2.add(tewntytwo);
		
		JLabel lblNewLabel_5_1 = new JLabel("週次：");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(16, 26, 39, 21);
		panel_2.add(lblNewLabel_5_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(56, 24, 199, 27);
		panel_2.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(week()));
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.BLACK);
		menuBar.setToolTipText("");
		menuBar.setForeground(Color.WHITE);
		menuBar.setBounds(336, 0, 55, 20);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		mnNewMenu.setBackground(Color.BLACK);
		mnNewMenu.setForeground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("使用者登入");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage login = new LoginPage();
				setVisible(false);
				login.setVisible(true);
			}
		});
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.RIGHT);
		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("管理員登入");
		mntmNewMenuItem_1.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.RIGHT);
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPageManager login = new LoginPageManager();
				setVisible(false);
				login.setVisible(true);
			}
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("回首頁");
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.RIGHT);
		mntmNewMenuItem_2.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_2);
	}
	public String[] week() {
		SimpleDateFormat sdFormat = new SimpleDateFormat("MM/dd");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)+1);
		case 3:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)-1);
		case 4:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)-2);
		case 5:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)-3);
		case 6:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)-4);
		case 7:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)+2);
		}
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(cal.getTime());
		cal1.set(Calendar.DATE, cal1.get(Calendar.DATE)+4);
		Date firstWeekStar = cal.getTime();
		Date firstWeekEnd = cal1.getTime();
		String[] weeks= new String[5];
		weeks[0]=new String(sdFormat.format(firstWeekStar)+"~"+sdFormat.format(firstWeekEnd));
		for (int i=0;i<4;i++) {
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)+7);
			cal1.set(Calendar.DATE, cal1.get(Calendar.DATE)+7);
			firstWeekStar = cal.getTime();
			firstWeekEnd = cal1.getTime();
			weeks[i+1]=new String(sdFormat.format(firstWeekStar)+"~"+sdFormat.format(firstWeekEnd));
		}
		return weeks;
	}
}

