package Java.Java_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 2 ways to declare & initialise array in java.

        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        in.close();
    }
}

/* ********** All About Arrays In Java ********** */

/*
 * Array:- It is the collection of elements of same data type. It is a
 * non-primitive data type, That stores data in a continuous manner.
 * 
 * Declaration Of An Array In Java:-
 * Syntax1 => data_type[] arrayName = new data_type[size];
 * Example1:- int[] arr = new int[10];
 * Syntax2 => data_Type[] arrayName = {Array_Elements};
 * Example2:- int[] arr = {1,2,3,4,5};
 * 
 * (1) Declaration And Initialization Happens At The Compile Time In Stack.
 * (2) Object Is Being Created At The Run Time In Heap.
 * (3) Internally In Java Memory Allocation Totally Depends Upon JVM, Whether It
 * Will Continuous Or Not.
 */
