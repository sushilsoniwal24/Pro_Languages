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

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyDog doge = new BabyDog();
        doge.weep();
        doge.bark();
        doge.eat();
    }
}
