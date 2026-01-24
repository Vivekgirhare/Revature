package jan14;

class Student {
    private int marks;   // private data (encapsulation)

    // Getter method
    public int getMarks() {
        return marks;
    }

    // Setter method
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.setMarks(85);                    // setting marks using setter
        System.out.println(s.getMarks());  // getting marks using getter
    }
}
