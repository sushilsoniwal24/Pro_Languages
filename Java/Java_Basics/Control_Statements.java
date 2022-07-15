package Java.Java_Basics;

import java.util.Scanner;

public class Control_Statements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age in years");
        int age = in.nextInt();

        if (age < 1) {
            System.out.println("Please Enter A Valid Age");
        } else if (age > 0 && age < 18) {
            System.out.println("You Can't Vote In This Election");
        } else {
            System.out.println("You Can Vote");
        }

        in.close();
    }
}
