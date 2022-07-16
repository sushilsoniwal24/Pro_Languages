package Java.Java_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional_Array {
    public static void main(String[] args) {
        intro1();
        intro2();
    }

    // Method-01 => To Input-Output a 2-D matrix.
    public static void intro1() {

        // Declaration & Initialization.
        int[][] mat1 = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 },
                { 10 },
                { 11, 12, 13, 14, 15, 16 }
        };

        /*
         * (1) mat1.length => Number Of Rows.
         * (2) mat1[row].length = > Number Of Elements present In A Row.
         */

        // Output 2-D Matrix.
        for (int row = 0; row < mat1.length; row++) {
            for (int col = 0; col < mat1[row].length; col++) {
                System.out.print(mat1[row][col] + " ");
            }
            System.out.println(); // Line Break
        }

        // Output Using Enhanced For-Loop.
        for (int[] i : mat1) {
            System.out.println(Arrays.toString(i));
        }
    }
    // ****************************************************************************

    // Method-02 => To Input-Output a 2-D matrix.
    public static void intro2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows:- ");
        int row_size = in.nextInt();
        System.out.println("Enter the number of columns:- ");
        int col_size = in.nextInt();

        // Declaration & Initialization.
        int[][] mat2 = new int[row_size][col_size];

        // Input A 2-D Array.
        System.out.println("Enter the elements of your matrix");
        for (int row = 0; row < row_size; row++) {
            for (int col = 0; col < col_size; col++) {
                mat2[row][col] = in.nextInt();
            }
        }

        // Output 2-D Matrix.
        for (int row = 0; row < row_size; row++) {
            for (int col = 0; col < col_size; col++) {
                System.out.print(mat2[row][col] + " ");
            }
            System.out.println(); // Line Break.
        }

        in.close();
    }
}

/* ********** All About Multi Dimensional Arrays In Java ********** */

/*
 * (1) It can be called as an "Array Of Arrays".
 * (2) A 2-D array is a structure of rows & columns.
 */
