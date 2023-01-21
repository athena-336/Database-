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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;

public class ManagerRecordPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerRecordPage frame = new ManagerRecordPage();
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
	public ManagerRecordPage() {
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
		
		JLabel lblNewLabel = new JLabel("租借紀錄");
		lblNewLabel.setFont(new Font("Apple Braille", Font.PLAIN, 20));
		lblNewLabel.setBounds(325, 10, 97, 41);
		panel.add(lblNewLabel);
		
		JButton backBtn = new JButton("回上頁");
		backBtn.setBounds(22, 13, 60, 33);
		panel.add(backBtn);
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserMainPage ump = new UserMainPage();
				ump.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("快速查詢");
		lblNewLabel_1.setFont(new Font("Apple Braille", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(25, 94, 69, 23);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"籃球", "排球", "羽球拍", "網球拍"}));
		comboBox.setBounds(23, 116, 162, 27);
		contentPane.add(comboBox);
		
		txtid = new JTextField();
		txtid.setText("輸入租借者ID");
		txtid.setBounds(25, 155, 160, 26);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"已歸還", "未歸還", "逾期歸還", "損毀", ""}));
		comboBox_1.setBounds(25, 195, 162, 27);
		contentPane.add(comboBox_1);
		
		JButton searchBtn = new JButton("搜尋");
		searchBtn.setBounds(114, 246, 91, 45);
		contentPane.add(searchBtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(251, 81, 447, 338);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("日期");
		lblNewLabel_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2.setEnabled(true);
		lblNewLabel_2.setBounds(24, 11, 37, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("器材");
		lblNewLabel_2_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_1.setEnabled(true);
		lblNewLabel_2_1.setBounds(93, 11, 37, 16);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("數量");
		lblNewLabel_2_2.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_2.setEnabled(true);
		lblNewLabel_2_2.setBounds(158, 11, 37, 16);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("租借者");
		lblNewLabel_2_3.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_3.setEnabled(true);
		lblNewLabel_2_3.setBounds(220, 11, 60, 16);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("ID");
		lblNewLabel_2_4.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_4.setEnabled(true);
		lblNewLabel_2_4.setBounds(292, 11, 37, 16);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("歸還情況");
		lblNewLabel_2_5.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_2_5.setEnabled(true);
		lblNewLabel_2_5.setBounds(367, 11, 60, 16);
		panel_1.add(lblNewLabel_2_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 27, 447, 12);
		panel_1.add(separator);
		separator.setForeground(Color.BLACK);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(251, 75, 447, 12);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(251, 415, 447, 12);
		contentPane.add(separator_1_1);
	}

}
