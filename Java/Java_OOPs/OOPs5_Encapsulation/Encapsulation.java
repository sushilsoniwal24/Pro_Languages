package Java.Java_OOPs.OOPs5_Encapsulation;

class Student {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student sam = new Student();
        sam.setMarks(35);
        System.out.println(sam.getMarks());
    }
}
