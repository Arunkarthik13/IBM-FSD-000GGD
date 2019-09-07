package MulticastClientServer;
import java.net.*;
import java.io.*;

public class MulticastChatClient {
    
    public static void main(String args[])
    throws Exception {
        
        
        // Default port number we are going to use
        int portnumber = 1236;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }
        
        // Create a MulticastSocket
        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
        
        // Determine the IP address of a host, given the host name
        InetAddress group =
                InetAddress.getByName("228.0.0.1");
        
        // Joins a multicast group
        chatMulticastSocket.joinGroup(group);
        
        // Prompt a user to enter a message
        String msg = "";
        boolean infinite = true;
        System.out.println("Type a message for the server:");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        msg = br.readLine();
//        do
//        {
        // Send the message to Multicast address
        DatagramPacket data = new
                DatagramPacket(msg.getBytes(), 0,
                msg.length(), group, portnumber);
        chatMulticastSocket.send(data);
        //get data from the server
        
            byte buf[] = new byte[1024];
            DatagramPacket data1 =
                    new DatagramPacket(buf, buf.length);
            chatMulticastSocket.receive(data1);
            String msg1 =
                    new String(data.getData()).trim();
            System.out.println("Message received from server = " + msg1);
            br = new BufferedReader(new InputStreamReader(System.in));
            msg = br.readLine();
        
       // }while(!msg.equalsIgnoreCase("exit"));
        
        // Close the socket
        chatMulticastSocket.close();
    }
}