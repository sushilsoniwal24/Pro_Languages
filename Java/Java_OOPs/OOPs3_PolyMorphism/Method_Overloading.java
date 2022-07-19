package Java.Java_OOPs.OOPs3_PolyMorphism;

class Maths {

    // Method without parameters.
    void add() {
        int a = 3, b = 4;
        int c = a + b;
        System.out.println(c);
    }

    // Method with 2 parameters.
    void add(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    // Method with return type & different parameters.
    double add(int num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {

        Maths m1 = new Maths();

        m1.add(); 
        m1.add(5, 10); 
        System.out.println(m1.add(50, 30.78));
    }
}