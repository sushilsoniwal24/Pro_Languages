package Java.Java_OOPs.OOPs4_Inheritance;

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Dog floki = new Dog();
        floki.eat();
        floki.bark();
    }
}