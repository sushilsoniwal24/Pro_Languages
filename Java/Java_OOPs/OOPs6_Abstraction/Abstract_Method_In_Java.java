package Java.Java_OOPs.OOPs6_Abstraction;

abstract class Fruits {
    abstract void color();

    abstract void taste();
}

abstract class Apple extends Fruits {
    @Override
    void color() {
        System.out.println("Apple's color is Red");
    }
}

class Mango extends Fruits {
    @Override
    void color() {
        System.out.println("Mango's color is Yellow");
    }

    @Override
    void taste() {
        System.out.println("Mango's taste is delicious");
    }
}

public class Abstract_Method_In_Java {
    public static void main(String[] args) {

        // Apple app = new Apple();
        // app.color();

        Mango aam = new Mango();
        aam.color();
        aam.taste();
    }
}
