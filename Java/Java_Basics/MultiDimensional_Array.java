package Java.Java_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 2 ways to declare & initialise multidimensional array in java.;

        int[][] mat1 = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 },
                { 10 },
                { 11, 12, 13, 14, 15, 16 }
        };

        for (int[] i : mat1) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println("Enter the number of rows:- ");
        int row_size = in.nextInt();
        System.out.println("Enter the number of columns:- ");
        int col_size = in.nextInt();

        int[][] mat2 = new int[row_size][col_size];

        for (int row = 0; row < row_size; row++) {
            for (int col = 0; col < col_size; col++) {
                mat2[row][col] = in.nextInt();
            }
        }

        for (int[] i : mat2) {
            System.out.println(Arrays.toString(i));
        }

        in.close();
    }
}

/* ********** All About Multi Dimensional Arrays In Java ********** */

/*
 * (1) It can be called as an "Array Of Arrays".
 * (2) A 2-D array is a structure of rows & columns.
 */
