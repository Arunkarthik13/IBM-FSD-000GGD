package jframepredefined;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Employeeform extends JFrame {
     
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeeform frame = new Employeeform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Employeeform() throws SQLException {
		EmployeeService service=new EmployeeServiceImpl();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][grow]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmployeeId.setBackground(Color.ORANGE);
		contentPane.add(lblEmployeeId, "cell 1 1");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 7 1,alignx left");
		textField.setColumns(12);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblFirstname, "cell 1 3");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 7 3,alignx left");
		textField_1.setColumns(12);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblLastname, "cell 1 5");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 7 5,alignx left");
		textField_2.setColumns(12);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblEmail, "cell 1 7");
		
		textField_3 = new JTextField();
		textField_3.setText("");
		contentPane.add(textField_3, "cell 7 7,alignx left");
		textField_3.setColumns(12);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, "cell 16 9");
		
		JButton btnLogin = new JButton("Add Employee");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				service.createEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText(),textField_2.getText(),textField_3.getText()));
			}
		});
		contentPane.add(btnLogin, "cell 2 11");
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					new Mytable();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(" ");
				textField_1.setText(" ");
			    textField_2.setText(" ");
			    textField_3.setText(" ");
			}
		});
		contentPane.add(btnReset, "cell 7 11");
		contentPane.add(btnDisplay, "cell 11 11");
		
		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					service.Deletedata(Integer.parseInt(textField.getText()));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btndelete, "cell 6 13");
	}

}
