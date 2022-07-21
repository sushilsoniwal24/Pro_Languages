package Java.Java_OOPs.OOPs6_Abstraction;

import java.util.Scanner;

interface Client {
    void input(); // public + abstract.

    void output();// public + abstract.
}

class Programmer implements Client {
    String name;
    int age;

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name:- ");
        name = in.nextLine();

        System.out.print("Enter Your Age:- ");
        age = in.nextInt();

        in.close();
    }

    @Override
    public void output() {
        System.out.println("Name is:- " + name);
        System.out.println("Age is:- " + age);
    }
}

public class Interfaces_Abstraction {
    public static void main(String[] args) {
        Client Vikas = new Programmer();
        Vikas.input();
        Vikas.output();
    }
}
