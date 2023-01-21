

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JTextField passwordField;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 501);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("List.selectionInactiveBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號：");
		lblNewLabel.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel.setBounds(229, 180, 44, 33);
		getContentPane().add(lblNewLabel);
		
		idField = new JTextField();
		idField.setForeground(new Color(0, 0, 0));
		idField.setBackground(new Color(255, 255, 255));
		idField.setBounds(275, 180, 202, 33);
		getContentPane().add(idField);
		idField.setColumns(10);
		
		JButton loginButton = new JButton("LOG IN");
		loginButton.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		loginButton.setForeground(Color.BLACK);
		loginButton.setBackground(Color.WHITE);
		loginButton.setBounds(208, 342, 299, 40);
		getContentPane().add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e ) {
				UserRecordPage usp = new UserRecordPage();
				usp.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("密碼：");
		lblNewLabel_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(229, 239, 44, 33);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JTextField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setColumns(10);
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(275, 239, 202, 33);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("LOG IN");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Apple Braille", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(275, 112, 166, 56);
		contentPane.add(lblNewLabel_2);

	}
}
