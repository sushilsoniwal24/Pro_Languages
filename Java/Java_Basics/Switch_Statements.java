package Java.Java_Basics;

import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Colour ex.:- Red, Yellow, Green");
        String clr = in.next();

        switch (clr) {
            case "Red":
                System.out.println("It's a red apple");
                break;
            case "Yellow":
                System.out.println("It's a yellow banana");
                break;
            case "Green":
                System.out.println("It's a green watermelon");
                break;
            default:
                System.out.println("Not avalible");
        }

        /* New Syntax For Switch Statements. */
        switch (clr) {
            case "Red" -> System.out.println("It's a red apple");
            case "Yellow" -> System.out.println("It's a yellow banana");
            case "Green" -> System.out.println("It's a green watermelon");
            default -> System.out.println("Not avalible");
        }

        in.close();
    }
}
