package Java.Java_Basics;

public class Loops {
    public static void main(String[] args) {
        multiFor();
        multiWhile();
        multiDoWhile();
    }

    // Multiplication Table Of 2 Using For-Loop.
    public static void multiFor() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 X %d = %d", i, 2 * i);
            System.out.println();
        }
    }
    // -----------------------------------------------------------------------------------

    // Multiplication Table Of 2 Using While-Loop.
    public static void multiWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.printf("2 X %d = %d", i, 2 * i);
            System.out.println();
            i++;
        }
    }
    // -----------------------------------------------------------------------------------

    // Multiplication Table Of 2 Using Do-While-Loop.
    public static void multiDoWhile() {
        int i = 1;
        do {
            System.out.printf("2 X %d = %d", i, 2 * i);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}
