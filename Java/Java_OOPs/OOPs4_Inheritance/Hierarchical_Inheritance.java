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

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.eat();
        tom.meow();
        // tom.bark(); Error
    }
}
