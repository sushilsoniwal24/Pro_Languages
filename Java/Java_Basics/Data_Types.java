package Java.Java_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Data_Types {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Primitive:- Can't be break into smaller types
        boolean isMale = true;
        byte a = 10;
        short r = -5000;
        int num = 3;
        long l = 1234567891L;
        float pi = 3.14f;
        double d = 1456.45213;
        char ch = 'a';

        // Non-Premitive:- Can be break into smaller types.
        String str = "Sushil Soniwal";
        int[] arr = { 1, 2, 3 };

        System.out.println("The boolean is:- " + isMale);
        System.out.println("The byte is:- " + a);
        System.out.println("The short is:- " + r);
        System.out.println("The integer is:- " + num);
        System.out.println("The long is:- " + l);
        System.out.println("The float is:- " + pi);
        System.out.println("The double is:- " + d);
        System.out.println("The char is:- " + ch);

        System.out.println("The string is:- " + str);
        System.out.println("The Array is:-" + Arrays.toString(arr));
        in.close();
    }
}

/* ********** Complete Explanation Of Primitive Data Types In Java ********** */

/*
 * (1) Boolean:- It is used to store only two possible values: true and false.
 * Default Value => false;
 * Range => True/False;
 * Size => 1 bit.
 * Ex:- boolean isAdult = false;
 */

/*
 * (2) Byte:- It is an 8-bit signed two's complement integer.
 * Default Value => 0;
 * Range => (-128) - (127);
 * Size => 1 byte(8 bits).
 * Ex:- byte a = 10, byte b = -20;
 */

/*
 * (3) Short:- It is a 16-bit signed two's complement integer.
 * Default Value => 0;
 * Range => (-32768) - (32767);
 * Size => 2 bytes (16 bits).
 * Ex:- short s = 10000, short r = -5000;
 */

/*
 * (4) Int:- It is a 32-bit signed two's complement integer.
 * Default Value => 0;
 * Range => (-2,147,483,648) - (2,147,483,647);
 * Size => 4 bytes (32 bits).
 * Ex:- int a = 100000, int b = -200000 ;
 */

/*
 * (5) Long:- It is a 64-bit two's complement integer.
 * Default Value => 0L;
 * Range => (-9,223,372,036,854,775,808) - (9,223,372,036,854,775,807);
 * Size => 8 bytes (64 bits).
 * Ex:- long a = 100000L, long b = -200000L ;
 */

/*
 * (6) Float:- It is a single-precision 32-bit IEEE 754 floating point.
 * Default Value => 0.0F;
 * Range => (3.40282347 x 10^38) - (1.40239846 x 10^-45);
 * Size => 4 bytes (32 bits).
 * Ex:- float f1 = 234.5f ;
 */

/*
 * (7) Double:- It is a double-precision 64-bit IEEE 754 floating point.
 * Default Value => 0.0d;
 * Range => (1.7976931348623157 x 10^308) - (4.9406564584124654 x 10^-324);
 * Size => 8 bytes (64 bits).
 * Ex:- double d1 = 12.3 ;
 */

/*
 * (8) Char:- It is a single 16-bit Unicode character.
 * Default Value => '\u0000';
 * Range => ('\u0000') - ('\uffff'); (0) - (65535);
 * Size => 2 bytes (16 bits).
 * Ex:- char ch = 's' ;
 * 
 * Q:- Why char uses 2 byte in java and what is \u0000 ?
 * A:- It is because java uses Unicode system not ASCII code system. The \u0000
 * is the lowest range of Unicode system.
 */
