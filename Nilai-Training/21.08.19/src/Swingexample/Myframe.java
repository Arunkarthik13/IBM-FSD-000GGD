package Swingexample;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Myframe extends JFrame implements ActionListener{
  private JLabel label1;
  private JTextField text1;
  private JButton button1;
  public Myframe() throws HeadlessException
  {
	  super();
	  label1=new JLabel();
	  label1.setText("enter your name:");
	  text1=new JTextField(30);
	  button1=new JButton();
	  button1.setText("Submit");
	  this.setTitle("My Frame Example");
	  this.setSize(400, 350);
	  this.setLayout(new FlowLayout());
	  this.add(label1);
	  this.add(text1);
	  this.add(button1);
	  button1.addActionListener(this);
	  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  this.setVisible(true);
	  
	  
  }
@Override
public void actionPerformed(ActionEvent arg0) {
   JOptionPane.showMessageDialog(this,"hello "+text1.getText().toString());
	
}
  
}
