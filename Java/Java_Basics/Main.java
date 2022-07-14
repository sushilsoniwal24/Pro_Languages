package Java.Java_Basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}

/* ********** Complete Decoding Of Line No. 4. ********** */

// (1) public:- The public is an access modifier that used to specified that who can call the main method. The "JVM" calls the main() method from outside the class, Therefore it's necessary to declare the main method as "public".

// (2) static:- Static is a keyword in java which is used to call the method without creating the instance of that class. The "JVM" calls the main() method without creating the instance of the class, Therefore it's necessary to create it as static.

// (3) void:-  Void is a return type, The java main() method doesn't return anything.

// (4) main:- It's the name of the method. It's the method from where the program execution starts.

// (5) String[] args:- "String" in java is a class that used to work upon strings and "args" is a reference variable that refers to an array of type string. If we want to pass the arguments via command line then it's necessary to make the argument of the main() method as "String[] args".