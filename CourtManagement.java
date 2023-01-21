import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourtManagement extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourtManagement frame = new CourtManagement();
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
	public CourtManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 725, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("場地管理");
		lblNewLabel.setFont(new Font("Apple Braille", Font.PLAIN, 20));
		lblNewLabel.setBounds(328, 15, 97, 34);
		panel.add(lblNewLabel);
		
		JButton backToMainPageBtn = new JButton("回上頁");
		backToMainPageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMainPage ump = new UserMainPage();
				ump.setVisible(true);
				setVisible(false);
			}
		});
		backToMainPageBtn.setFont(new Font("Apple Braille", Font.PLAIN, 14));
		backToMainPageBtn.setBounds(16, 15, 97, 34);
		panel.add(backToMainPageBtn);
		
		JLabel lblNewLabel_1 = new JLabel("快速查詢");
		lblNewLabel_1.setFont(new Font("Apple Braille", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(26, 89, 80, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setText("請輸入行程");
		textField.setBounds(26, 127, 138, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"體育館場地一", "體育館場地二", "體育館場地三", "體育館場地四"}));
		comboBox.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		comboBox.setBounds(26, 165, 138, 27);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		comboBox_1.setBounds(26, 232, 138, 27);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("日期");
		lblNewLabel_2.setBounds(26, 204, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton searchBtn = new JButton("搜尋");
		searchBtn.setBounds(220, 225, 91, 37);
		contentPane.add(searchBtn);
		
		JLabel lblNewLabel_1_1 = new JLabel("新增紀錄");
		lblNewLabel_1_1.setFont(new Font("Apple Braille", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(26, 274, 80, 27);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("請輸入行程");
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(26, 317, 138, 26);
		contentPane.add(textField_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"體育館場地一", "體育館場地二", "體育館場地三", "體育館場地四"}));
		comboBox_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		comboBox_2.setBounds(26, 355, 138, 27);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("日期");
		lblNewLabel_2_1.setBounds(26, 394, 61, 16);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		comboBox_1_1.setBounds(26, 422, 138, 27);
		contentPane.add(comboBox_1_1);
		
		JButton addRecordBtn = new JButton("增加紀錄");
		addRecordBtn.setBounds(220, 415, 91, 37);
		contentPane.add(addRecordBtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(323, 89, 380, 287);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("行程");
		lblNewLabel_3.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(19, 6, 39, 26);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("場地");
		lblNewLabel_3_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(112, 6, 39, 26);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("日期");
		lblNewLabel_3_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_3_2.setBounds(194, 6, 39, 26);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("勾選刪除");
		lblNewLabel_3_3.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_3_3.setBounds(279, 6, 76, 26);
		panel_1.add(lblNewLabel_3_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 24, 380, 27);
		panel_1.add(separator_1);
		
		JButton deleteRecordBtn = new JButton("減少紀錄");
		deleteRecordBtn.setBounds(586, 389, 117, 38);
		contentPane.add(deleteRecordBtn);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(323, 83, 380, 27);
		contentPane.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(323, 372, 380, 27);
		contentPane.add(separator_2);
	}

}
