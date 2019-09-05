package javanetworking.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class NetworkingJframe extends JFrame {

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
					NetworkingJframe frame = new NetworkingJframe();
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
	public NetworkingJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoadData = new JButton("Load data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
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
		                msg=textField.getText();
		                pw.println(msg);
		                
		                // Read data from the input stream of the client socket.
		               // System.out.println("Message returned from the server = " + br.readLine());
		                textField_1.setText(br.readLine());
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
		btnLoadData.setBackground(Color.PINK);
		btnLoadData.setBounds(156, 92, 89, 23);
		contentPane.add(btnLoadData);
		
		textField = new JTextField();
		textField.setBounds(156, 34, 86, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 179, 89, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
