

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class UserRecordPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRecordPage frame = new UserRecordPage();
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
	public UserRecordPage() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(57, 107, 123, 345);
		panel.setBorder(null);
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel borrowDateLabel = new JLabel("租借日期");
		borrowDateLabel.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		borrowDateLabel.setBounds(35, 17, 57, 16);
		panel.add(borrowDateLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(6, 27, 111, 12);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("-----------------------------------------------------\n");
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(180, 107, 222, 345);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("器材名稱");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(82, 17, 52, 16);
		lblNewLabel.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		panel_1.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 27, 210, 12);
		panel_1.add(separator_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(510, 107, 130, 345);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("狀態");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(52, 16, 26, 16);
		panel_3.add(lblNewLabel_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(6, 27, 118, 12);
		panel_3.add(separator_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(401, 107, 110, 345);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("租借數量");
		lblNewLabel_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(32, 17, 61, 16);
		panel_2.add(lblNewLabel_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(6, 27, 98, 12);
		panel_2.add(separator_2);
		
		JButton backtoHomeBtn = new JButton("回到首頁");
		backtoHomeBtn.setHorizontalAlignment(SwingConstants.LEADING);
		backtoHomeBtn.setBackground(Color.LIGHT_GRAY);
		backtoHomeBtn.setForeground(Color.DARK_GRAY);
		backtoHomeBtn.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		backtoHomeBtn.setBounds(413, 68, 96, 29);
		contentPane.add(backtoHomeBtn);
		backtoHomeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home home= new Home();
				setVisible(false);
				home.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("租借紀錄");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(510, 68, 96, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("器材租借");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(604, 68, 96, 29);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userBorrowPage ubp = new userBorrowPage();
				ubp.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("酷酷的體育館資料庫系統");
		lblNewLabel_3.setFont(new Font("Apple Braille", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(34, 35, 322, 42);
		contentPane.add(lblNewLabel_3);
		
		JButton nextpageBtn = new JButton("下一頁");
		nextpageBtn.setForeground(Color.DARK_GRAY);
		nextpageBtn.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		nextpageBtn.setBounds(652, 423, 73, 29);
		contentPane.add(nextpageBtn);
		nextpageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userBorrowPage ubp = new userBorrowPage();
				ubp.setVisible(true);
				setVisible(false);
			}
		});
	}
}
