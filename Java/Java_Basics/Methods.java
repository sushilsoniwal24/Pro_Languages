package Java.Java_Basics;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int a = 4, b = 8;

        /*
         * System.out.printf("Before Swapping A = %d & B = %d\n", a, b);
         * swap1(a, b);
         */

        /*
         * System.out.printf("Before Swapping A = %d & B = %d\n", a, b);
         * swap2(a, b);
         */

        System.out.println(a + " " + b);

        int[] arr = { 3, 4 };
        swap3(arr);
        System.out.println(Arrays.toString(arr));
    }

    // (1) Method to swap two numbers using third variable.
    public static void swap1(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("After Swapping A = %d & B = %d\n", num1, num2);
    }

    // (2) Method to swap two numbers without using third variable.
    public static void swap2(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.printf("After Swapping A = %d & B = %d\n", num1, num2);
    }

    // (3) Method to swap two numbers of a non-primitive data type..
    public static void swap3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}

/* ********** Pass By Value In Java ********** */
// Primitives :- Copy of the value is passed.
// Objects/References :- Copy of the reference variable is passed.
