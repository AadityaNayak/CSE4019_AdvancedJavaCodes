// Reg no: 20BCE10950
// Date: 29/03/2023
import java.util.*;
import java.io.*;

public class Exp1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input using Scanner class: ");
        String output1 = sc.nextLine();

        Console con =System.console();
        System.out.println("Input using Console class");
        String output2 = con.readLine();

        InputStreamReader r =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(r);
        System.out.println("Input using InputStreamReader and BufferReader class: ");
        String output3 = "";
        try {
            output3 = br.readLine();
        }
        catch(Exception e){
            System.out.println(e);
        }


        System.out.println("The output from input via Scanner class: " + output1);
        System.out.println("The output from input via Console class: " + output2);
        System.out.println("The output from input via InputStreamReader and BufferReader class: " + output3);

    }
}
