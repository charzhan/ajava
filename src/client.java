import org.junit.Test;
import sun.rmi.log.LogOutputStream;

import java.io.*;
import java.net.Socket;

public class client {
    @Test
  public void test1()throws  Exception{
        new client1();
    }
}
class client1{
    public client1()throws  Exception{
        Socket socket = new Socket("192.168.254.129", 80);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream));
        printWriter.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        printWriter.flush();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(bufferedReader.readLine());

    }
}