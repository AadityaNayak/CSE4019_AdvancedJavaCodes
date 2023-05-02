import java.util.*;
import java.lang.*;

public class Main {

    public static int find(int arr[]) {
        int min = arr[0];
        for (int i : arr) {
            min = Integer.min(min, i);
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2}, {3, 4, 5, 6}, {7, 8}};

        for (int a[] : arr) {
            for (int e : a) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        try{
        System.out.println(arr[4]);
        }catch(Exception e){
            System.out.println("The exception encountered is: "+  e);
        }
    }
}