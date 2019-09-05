package javanetworking.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class NetworkingWithDB extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkingWithDB frame = new NetworkingWithDB();
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
	public NetworkingWithDB() throws SQLException {
		EmployeeService service=new EmployeeServiceImpl();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 348);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(40, 28, 86, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(40, 73, 66, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(40, 120, 66, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(40, 169, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(160, 25, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 70, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 117, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 166, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddEmployee = new JButton("Add employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				Socket client = null;
		        
		        // Default port number we are going to use
		        int portnumber = 1234;
		        
		        
		        for (int i=0; i <1; i++) {
		            try {
		                String msg = "";
		                
		                // Create a client socket
		                
		                client = new Socket(InetAddress.getLocalHost(), portnumber);
		                System.out.println("Client socket is created " + client);
		                
		                // Create an output stream of the client socket
		                OutputStream clientOut = client.getOutputStream();
		                PrintWriter pw = new PrintWriter(clientOut, true);
		                
		                // Create an input stream of the client socket
		                InputStream clientIn = client.getInputStream();
		                BufferedReader br = new BufferedReader(new
		                        InputStreamReader(clientIn));
		                
		                // Create BufferedReader for a standard input
		                BufferedReader stdIn = new BufferedReader(new
		                        InputStreamReader(System.in));
		                
		                // Read data from standard input device and write it
		                // to the output stream of the client socket.
		                //msg = stdIn.readLine().trim();
		                msg=textField.getText()+" "+textField_1.getText()+" "+textField_2.getText()+" "+textField_3.getText();
		                pw.println(msg);
		                // Read data from the input stream of the client socket.
		                System.out.println("Message returned from the server = " + br.readLine());
		                
		                 pw.close();
		                br.close();
		                client.close();
		                
		                // Stop the operation
		                if (msg.equalsIgnoreCase("Bye")) {
		                    break;
		                }
		                
		            } catch (IOException ie) {
		                System.out.println("I/O error - Start server and turn off Firewall" + ie);
		            }
		        }
			}
		});
		btnAddEmployee.setBackground(Color.CYAN);
		btnAddEmployee.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAddEmployee.setBounds(84, 237, 113, 23);
		contentPane.add(btnAddEmployee);
		
		textField_4 = new JTextField();
		textField_4.setBounds(468, 91, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEnterId = new JLabel("Enter id");
		lblEnterId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEnterId.setBackground(new Color(240, 240, 240));
		lblEnterId.setBounds(327, 94, 46, 14);
		contentPane.add(lblEnterId);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				NetworkingServer server=new NetworkingServer();
				Socket client = null;
		        
		        // Default port number we are going to use
		        int portnumber = 1234;
		        
		        
		        for (int i=0; i <10; i++) {
		            try {
		                String msg = "";
		                
		                // Create a client socket
		                
		                client = new Socket(InetAddress.getLocalHost(), portnumber);
		                System.out.println("Client socket is created " + client);
		                
		                // Create an output stream of the client socket
		                OutputStream clientOut = client.getOutputStream();
		                PrintWriter pw = new PrintWriter(clientOut, true);
		                
		                // Create an input stream of the client socket
		                InputStream clientIn = client.getInputStream();
		                BufferedReader br = new BufferedReader(new
		                        InputStreamReader(clientIn));
		                
		                // Create BufferedReader for a standard input
		                BufferedReader stdIn = new BufferedReader(new
		                        InputStreamReader(System.in));
		                
		                System.out.println("Enter your name. Type Bye to exit. ");
		                
		                // Read data from standard input device and write it
		                // to the output stream of the client socket.
		                //msg = stdIn.readLine().trim();
		                msg=textField_4.getText();
		                //pw.println(msg);
		                server.getallEmployee(msg);
		                
		                // Read data from the input stream of the client socket.
		               // System.out.println("Message returned from the server = " + br.readLine());
		                
		                 pw.close();
		                br.close();
		                client.close();
		                
		                // Stop the operation
		                if (msg.equalsIgnoreCase("Bye")) {
		                    break;
		                }
		                
		            } catch (IOException ie) {
		                System.out.println("I/O error - Start server and turn off Firewall" + ie);
		            }
		        }
			}
		});
		btnDisplay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDisplay.setBounds(432, 238, 89, 23);
		contentPane.add(btnDisplay);
	}

	protected void getallEmployee(String msg) {
		// TODO Auto-generated method stub
		
	}

}
