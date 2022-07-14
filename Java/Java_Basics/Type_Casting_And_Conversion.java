package Java.Java_Basics;

public class Type_Casting_And_Conversion {
    public static void main(String[] args) {
        implicit();
        explicit();
    }

    // Widening or implicit Type Conversion.
    public static void implicit() {
        int in = 2147483647; // Int max value in java.
        long lo = in; // Automatically converted to long, now we can extend l's value.
        lo = lo + 1;
        double db = lo; // Automatically converted to double.
        System.out.println("Int value : " + in);
        System.out.println("Long value : " + lo);
        System.out.println("Double value : " + db);
    }
    // -------------------------------------------------------------------------------------------------------

    // Narrowing Or Explicit Type Casting.
    public static void explicit() {
        double db = 25.150;
        int in = (int) db;
        System.out.println("double after casting to int is:- " + in);

        byte by = (byte) in;
        System.out.println("int after casting to byte is:- " + by);
    }
}

/* ********** Complete Explanation Of Type Casting In Java ********** */

/*
 * Q:- WHAT IS TYPE CASTING & TYPE CONVERSION.
 * Type Casting:- In type casting a data type is converted into another data
 * type by programmer.
 * Type Conversion:- In type conversion a data type is converted into another
 * data type by compiler.
 */

/*
 * Widening or Automatic Type Conversion.
 * It converts a small data type to a large data type.
 * byte -> short -> int -> long -> float -> double.
 */

/*
 * Narrowing Or Explicit Type Conversion.
 * It converts a large data type to a small data type.
 * double -> float -> long -> int -> short -> byte.
 * Syntax:- data_type var_name = (small) var_name(large).
 */
