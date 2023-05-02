package AreaFunctions;

import java.util.*;

public class ShapeArea implements FigureArea {
    @Override
    public void Circle(){
        System.out.print("Enter radius of circle: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println("The area of circle is = " + 3.142*r*r);

    }
    @Override
    public void Square(){
        System.out.print("Enter side length of square: ");
        Scanner sc = new Scanner(System.in);
        float s = sc.nextFloat();
        System.out.println("The area of square is = " + s*s);
    }
    @Override
    public void Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float w = sc.nextFloat();
        System.out.println("The area of rectangle is = " + l*w);
    }
    @Override
    public void Triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter height of triangle: ");
        float w = sc.nextFloat();
        System.out.println("The area of rectangle is = " + 0.5*l*w);
    }

    public static void main(String args[]){
        ShapeArea sa = new ShapeArea();
        sa.Circle();
        sa.Square();
        sa.Rectangle();
        sa.Triangle();
    }

}
