

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class userBorrowPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userBorrowPage frame = new userBorrowPage();
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
	public userBorrowPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserRecordPage urp = new UserRecordPage();
				urp.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnNewButton_2 = new JButton("器材租借");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(604, 68, 96, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("酷酷的體育館資料庫系統");
		lblNewLabel_3.setFont(new Font("Apple Braille", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(34, 35, 322, 42);
		contentPane.add(lblNewLabel_3);
		
	
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(104, 228, 144, 27);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[]{"籃球","排球","羽球拍","排球"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"8:00 a.m. ", "10:00 a.m.", "12:00 p.m. ", "2:00 p.m.", "4:00 p.m.", ""}));
		comboBox_1.setBounds(104, 189, 144, 27);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setText("租借數量");
		textField.setForeground(Color.GRAY);
		textField.setToolTipText("");
		textField.setBounds(104, 267, 144, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("新增");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton.setBounds(114, 317, 117, 29);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(299, 134, 378, 206);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("器材名稱");
		lblNewLabel.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(95, 16, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("剩餘數量");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(200, 16, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("租借數量");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(299, 16, 61, 16);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 31, 380, 12);
		panel.add(separator);
		separator.setForeground(Color.WHITE);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBounds(6, 57, 366, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		chckbxNewCheckBox_1.setBounds(6, 85, 366, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxSelectAll = new JCheckBox("全部");
		chckbxSelectAll.setForeground(Color.WHITE);
		chckbxSelectAll.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		chckbxSelectAll.setBounds(6, 12, 88, 23);
		panel.add(chckbxSelectAll);
		
		JComboBox datebox = new JComboBox();
		datebox.setBounds(107, 150, 141, 27);
		contentPane.add(datebox);
		
		JButton deleteBtn = new JButton("刪除");
		deleteBtn.setForeground(Color.DARK_GRAY);
		deleteBtn.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		deleteBtn.setBounds(560, 352, 117, 29);
		contentPane.add(deleteBtn);
		
		JButton borrowBtn = new JButton("租借");
		borrowBtn.setForeground(Color.BLACK);
		borrowBtn.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		borrowBtn.setBounds(309, 391, 141, 48);
		contentPane.add(borrowBtn);

	}
}
