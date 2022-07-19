package Java.Java_OOPs.OOPs3_PolyMorphism;

class Shapes {

    void draw() {
        System.out.println("Shape can be anything");
    }
}

class Triangle extends Shapes {

    @Override
    void draw() {
        System.out.println("It's a triangle");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Shapes sp = new Triangle();
        sp.draw();
    }
}

/* ********** Method Overriding ********** */

/*
 * (1) At the time of program execution "JVM" will check for method in
 * Super(Parent) class.
 * [i] If method found then it will check in Sub(Child) class for overriden
 * method.
 * [ii] If method doesn't found in parent class, It will give a compilation
 * error.
 * 
 * (2) If overriden method present in sub class, JVM will call this everytime.
 * (3) If Overriden method not present in sub class, JVM will call the super
 * class's method.
 */