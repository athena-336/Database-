

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



public class Inventory extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1,textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		String[] equipment= {"排球","籃球","足球","羽球","羽球拍","網球","網球拍"};
		contentPane.setBackground(SystemColor.controlLtHighlight);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(631, 187, 17, 158);
		contentPane.add(scrollBar);
		
		JLabel lblNewLabel_2 = new JLabel("   ID    器材     實際數量     日期     勾選刪除");
		lblNewLabel_2.setBounds(321, 131, 301, 23);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 1, 725, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel = new JLabel("庫存增減");
		lblNewLabel.setBounds(324, 13, 101, 41);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setFont(new Font("Apple Braille", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("返回");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(22, 13, 60, 33);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMainPage ump = new UserMainPage();
				ump.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Apple Braille", Font.BOLD, 13));
		
		JLabel lblNewLabel_1 = new JLabel("快速查詢");
		lblNewLabel_1.setFont(new Font("Apple Braille", Font.BOLD, 16));
		lblNewLabel_1.setBounds(65, 116, 79, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("新增庫存");
		lblNewLabel_1_1.setFont(new Font("Apple Braille", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(66, 300, 83, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setText("請選擇器材");
		textField_6.setFont(new Font("微軟正黑體", Font.PLAIN, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(66, 149, 158, 31);
		contentPane.add(textField_6);
		
		JComboBox comboBox = new JComboBox(equipment);
		comboBox.setBackground(SystemColor.text);
		comboBox.setBounds(66, 150, 180, 30);
		contentPane.add(comboBox);
		
		JTextField textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Apple Braille", Font.PLAIN, 12));
		textField.setText("輸入器材ID");
		textField.setBounds(65, 184, 175, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("搜尋");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton_1.setBounds(183, 233, 63, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("增加器材");
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton_2.setBounds(183, 408, 63, 33);
		contentPane.add(btnNewButton_2);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(310, 116, 349, 279);
		contentPane.add(list);
		
		JButton btnNewButton_3 = new JButton("刪除");
		btnNewButton_3.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton_3.setBounds(596, 408, 63, 33);
		contentPane.add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setText("輸入器材數量");
		textField_1.setFont(new Font("Apple Braille", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(59, 365, 175, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setText("請選擇器材");
		textField_2.setFont(new Font("微軟正黑體", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(59, 332, 158, 31);
		contentPane.add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(59, 334, 181, 27);
		contentPane.add(comboBox_1);
	}

}
