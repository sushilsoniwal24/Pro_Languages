package Java.Java_OOPs.OOPs1_Classes_And_Objects;

class Student {

    // Data Members.
    String name;
    int age;
    String roll_num;
    int marks;

    // Member Function.
    void display_Info() {
        System.out.println("Name is:- " + name);
        System.out.println("Age is:- " + age);
        System.out.println("Roll Numbe is:- " + roll_num);
    }

    // Another Method.
    int get_Marks() {
        return marks;
    }

}

public class Classes_And_Objects {
    public static void main(String[] args) {

        // Objects Of "Student" Class.

        Student st1 = new Student();
        Student st2 = new Student();

        // Adding values for student 1.
        st1.name = "Sushil";
        st1.age = 19;
        st1.roll_num = "30ECE2003";
        st1.marks = 75;

        // Calling member functions for student1.
        st1.display_Info();
        System.out.println("Marks is:- " + st1.get_Marks());

        // Adding values for student 2.
        st2.name = "Suresh";
        st2.age = 20;
        st2.roll_num = "30ECE2004";
        st2.marks = 80;

        // Calling member functions for student1.
        st2.display_Info();
        System.out.println("Marks is:- " + st2.get_Marks());

    }
}
