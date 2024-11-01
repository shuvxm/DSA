// package NewArray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        int[][] arr2D = {
                { 1, 2, 3 }, // 0th index
                { 4, 5 }, // 1st index
                { 6, 7, 8, 9 } // 2nd index -> arr[2] = {6,7,8,9}
        };
        // System.out.println(Arrays.toString(arr2D[2]));

        // take input 2D
        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output print
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        // OR
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

    }
}
