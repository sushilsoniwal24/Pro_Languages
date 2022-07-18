package Java.Java_OOPs.OOPs2_Constructors;

class Animal {

    String color;
    int age;

    // Non-Parameterized Constructor.
    Animal() {
        System.out.println("Non-Parameterized Constructor Called");
    }

    // Parameterized Constructor.
    Animal(String col) {
        color = col;
    }

    // Constructor Overloading.
    Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    // Copy Constructor.
    Animal(Animal aml) {
        this.color = aml.color;
        this.age = aml.age;
    }

    void display() {
        System.out.println(color + " " + age);
    }

}

public class Constructors {
    public static void main(String[] args) {

        Animal cow = new Animal("Black", 7);

        // Copying values of cow object.
        Animal dog = new Animal(cow);

        // Both will print the same values.
        cow.display();
        dog.display();

    }
}
