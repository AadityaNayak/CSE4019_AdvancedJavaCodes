// Name: Aaditya Nayak
// Reg no: 20BCE10950
// Date: 07/04/2023

package Exp2;

import java.lang.*;

public class Exp4_Rectangle {

    public static float length;
    public static float width;

    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i<n; i++){
            System.out.print(" * ");
        }
        System.out.println();
        for(int i = 0; i<n-7; i++) {
            System.out.print(" *");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("   ");
            }
            System.out.print("  *");
            System.out.println();
        }
        for(int i = 0; i<n; i++){
            System.out.print(" * ");
        }
    }
}
