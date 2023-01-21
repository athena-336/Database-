import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class BlackList extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackList frame = new BlackList();
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
	public BlackList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 1, 725, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("黑名單");
		lblNewLabel.setFont(new Font("Apple Braille", Font.PLAIN, 20));
		lblNewLabel.setBounds(331, 10, 77, 40);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("回上頁");
		btnNewButton.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		btnNewButton.setBounds(22, 13, 60, 33);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMainPage ump = new UserMainPage();
				ump.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("快速查詢");
		lblNewLabel_1.setFont(new Font("Apple Braille", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(25, 94, 69, 27);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"逾期歸還", "損毀"}));
		comboBox.setBounds(18, 129, 133, 27);
		contentPane.add(comboBox);
		
		txtid = new JTextField();
		txtid.setBackground(Color.LIGHT_GRAY);
		txtid.setText("請輸入違規者ID");
		txtid.setBounds(25, 168, 133, 33);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(25, 251, 126, 27);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("過期日期");
		lblNewLabel_1_1.setFont(new Font("Apple Braille", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(25, 216, 69, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(205, 94, 486, 306);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("過期日");
		lblNewLabel_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2.setEnabled(true);
		lblNewLabel_2.setBounds(19, 17, 50, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("種類");
		lblNewLabel_2_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_1.setEnabled(true);
		lblNewLabel_2_1.setBounds(91, 17, 39, 16);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("數量");
		lblNewLabel_2_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_2.setEnabled(true);
		lblNewLabel_2_2.setBounds(161, 17, 50, 16);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("租借者");
		lblNewLabel_2_3.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_3.setEnabled(true);
		lblNewLabel_2_3.setBounds(223, 17, 50, 16);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("ID");
		lblNewLabel_2_4.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_4.setEnabled(true);
		lblNewLabel_2_4.setBounds(324, 17, 50, 16);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("違規情況");
		lblNewLabel_2_5.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_5.setEnabled(true);
		lblNewLabel_2_5.setBounds(404, 17, 76, 16);
		panel_1.add(lblNewLabel_2_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 27, 486, 23);
		panel_1.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(205, 88, 486, 23);
		contentPane.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(205, 396, 486, 23);
		contentPane.add(separator_2);
		
		JButton searchBtn = new JButton("搜尋");
		searchBtn.setBounds(109, 290, 84, 45);
		contentPane.add(searchBtn);
	}

}
