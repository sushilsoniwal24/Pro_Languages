package Java.Java_OOPs;

class Student {

    // Class Data Members.
    String name;
    int age;
    String roll_Num;
    int percentage;

    // Class Member Function.
    void print_Student_Details() {
        System.out.println("Name of the student is:- " + name);
        System.out.println("Age of the student is:- " + age);
        System.out.println("Roll Number of the student is:- " + roll_Num);
    }

    int get_Percentage() {
        return percentage;
    }

}

public class Main {
    public static void main(String[] args) {

        // Objects of "Student" class.
        Student st1 = new Student(); // Initializing object for student1.
        Student st2 = new Student(); // Initializing object for student2.

        // Adding values for student 1.
        st1.name = "Sushil";
        st1.age = 19;
        st1.roll_Num = "30ECE2003";
        st1.percentage = 75;

        // Calling member functions for student1.
        st1.print_Student_Details();
        System.out.println("Percentage of the student is:- " + st1.get_Percentage());

        // Adding values for student 2.
        st2.name = "Suresh";
        st2.age = 20;
        st2.roll_Num = "30ECE2004";
        st2.percentage = 80;

        // Calling member functions for student1.
        st2.print_Student_Details();
        System.out.println("Percentage of the student is:- " + st2.get_Percentage());
    }
}