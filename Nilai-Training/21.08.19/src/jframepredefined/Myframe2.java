package jframepredefined;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Myframe2 extends JFrame {

	private JPanel contentPane1;
	private JTextField textField;
	private JLabel lblPassword;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myframe2 frame = new Myframe2();
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
	public Myframe2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(28, 26, 82, 29);
		contentPane1.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(95, 30, 86, 20);
		contentPane1.add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(28, 66, 62, 20);
		contentPane1.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 66, 86, 20);
		contentPane1.add(textField_1);
		textField_1.setColumns(10);
	}
}
