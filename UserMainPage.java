import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JLabel;

public class UserMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMainPage frame = new UserMainPage();
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
	public UserMainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton courtBtn = new JButton("場地管理");
		courtBtn.setBackground(Color.WHITE);
		courtBtn.setFont(new Font("Apple Braille", Font.PLAIN, 18));
		courtBtn.setBounds(271, 106, 175, 65);
		contentPane.add(courtBtn);
		courtBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				CourtManagement cm = new CourtManagement();
				cm.setVisible(true);
				setVisible(false);
				}
		});
		
		JButton inventoryBtn = new JButton("器材管理");
		inventoryBtn.setFont(new Font("Apple Braille", Font.PLAIN, 18));
		inventoryBtn.setBackground(Color.WHITE);
		inventoryBtn.setBounds(271, 245, 175, 65);
		contentPane.add(inventoryBtn);
		inventoryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				Inventory in = new Inventory();
				in.setVisible(true);
				setVisible(false);
				}
		});
		
		JButton borrowRecordBtn = new JButton("租借紀錄");
		borrowRecordBtn.setBounds(421, 217, 117, 49);
		contentPane.add(borrowRecordBtn);
		borrowRecordBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerRecordPage mrp = new ManagerRecordPage();
				mrp.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton blacklistBtn = new JButton("違規紀錄");
		blacklistBtn.setBounds(169, 289, 117, 49);
		contentPane.add(blacklistBtn);
		blacklistBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				BlackList b = new BlackList();
				b.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel = new JLabel("管理者姓名：");
		lblNewLabel.setBounds(18, 21, 97, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("管理者帳號：");
		lblNewLabel_1.setBounds(18, 43, 97, 16);
		contentPane.add(lblNewLabel_1);
	}

}
