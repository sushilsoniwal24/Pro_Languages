package Java.Java_OOPs.OOPs6_Abstraction;

abstract class Birds {
    abstract void color();
}

class Parrot extends Birds {
    @Override
    void color() {
        System.out.println("Parrot's color is green");
    }
}

class Crow extends Birds {
    @Override
    void color() {
        System.out.println("Crow's color is black");
    }
}

public class Class_Abstraction {
    public static void main(String[] args) {
        Parrot pt = new Parrot();
        pt.color();

        Crow cr = new Crow();
        cr.color();
    }
}
