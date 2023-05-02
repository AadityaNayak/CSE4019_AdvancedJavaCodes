// Name: Aaditya Nayak
// Reg no: 20BCE10950
// Date: 07/04/2023

package Exp2;

import java.util.*;
import java.lang.*;

public class Exp3_Circle {
    public static float radius;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextFloat();
        System.out.println("Perimeter: " + 2 * Math.PI * radius);
        System.out.println("Area: " + Math.PI * radius*radius);
    }
}
