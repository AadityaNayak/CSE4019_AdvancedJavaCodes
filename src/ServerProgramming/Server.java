package ServerProgramming;
import java.io.*;
import java.net.*;
import java.nio.Buffer;

public class Server {

    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";

        while(!str1.equals("bye")){
            str1 = dis.readUTF();
            System.out.println("Client: " + str1);
            str2  = br.readLine();
            dos.writeUTF(str2);
            dos.flush();
        }

    }
}
