package ServerProgramming;
import java.io.*;
import java.net.*;
public class Client {

    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 1234);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";

        while(!str1.equals("bye")){
            str1 = br.readLine();
            dos.writeUTF(str1);
            dos.flush();
            str2 = dis.readUTF();
            System.out.println("Server: " + str2);
        }
        dis.close();
        dos.close();
        s.close();
    }

}
