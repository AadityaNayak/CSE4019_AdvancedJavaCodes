// Name: Aaditya Nayak
// Reg no: 20BCE10950
// Date: 07/04/2023

package Exp2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exp2 extends Exp2_Parent implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread ran");
    }

    @Override
    public void introduction() {
        System.out.println("I am output via method from Inherited Parent");
    }

    public static void main(String[] args) {

        System.out.println("---------------------Arrays------------------");
        // Arrays
        int[] arr = {10, 11, 2, 7, 8, 9};
        System.out.println("Array is as: ");
        for (int it : arr) {
            System.out.println(it + " ");
        }


        System.out.println();
        System.out.println("---------------------Inheritance------------------");
        System.out.println();


        // Interface
        Exp2 obj = new Exp2();
        obj.introduction();


        System.out.println();
        System.out.println("---------------------Exception------------------");
        System.out.println();


        // Exception
        try {
            System.out.println(arr[8]);
        } catch (Exception e) {
            System.out.println("The exception description is as: ");
            System.out.println(e);
        }


        System.out.println();
        System.out.println("---------------------Serialization------------------");
        System.out.println();


        // Serialization
        try {
            Exp2_Employee obj0 = new Exp2_Employee("Aaditya");
            Exp2_Employee obj1 = new Exp2_Employee("Akhil");

            FileOutputStream fout = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream((fout));

            out.writeObject(obj0);
            out.writeObject(obj1);
            out.flush();
            out.close();
            System.out.println("Successfully serialized");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
            Exp2_Employee obj0 = (Exp2_Employee) in.readObject();
            Exp2_Employee obj1 = (Exp2_Employee) in.readObject();

            System.out.println("Successfully Deserialized object 1: " + obj0.name);
            System.out.println("Successfully Deserialized object 2: " + obj1.name);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println();
        System.out.println("---------------------Threading------------------");
        System.out.println();


        // Threading
        Exp2 T = new Exp2();
        Thread Th = new Thread(T);
        Th.start();
    }

}
