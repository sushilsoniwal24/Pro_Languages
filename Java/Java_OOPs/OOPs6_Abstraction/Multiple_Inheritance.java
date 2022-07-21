package Java.Java_OOPs.OOPs6_Abstraction;

interface First {
    void show();
}

interface Second {
    void show();
}

class Third implements First, Second {
    public void show() {
        System.out.println("I am third");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Third th = new Third();
        th.show();
    }
}
