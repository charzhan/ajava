import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server extends JFrame implements ActionListener {
    public  static void  main(String[] args){
        JPanel jp=null;
        JTextArea jta=null;
        JButton jb=null;
        JScrollBar jsb=null;

    }
@Test
    public void tesstserver() throws Exception{
    new server1();
}

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class server1{
    public server1()throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        System.out.println(bufferedReader.readLine());


    }
}