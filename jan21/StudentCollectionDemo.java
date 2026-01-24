package jan21;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student {
    int studentId;
    String studentName;
    double marks;

    public Student() {
    }

    public Student(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class StudentCollectionDemo {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Rahul", 85.5));
        studentList.add(new Student(2, "Anita", 92.0));
        studentList.add(new Student(3, "Vivek", 78.4));
        studentList.add(new Student(4, "Priya", 88.9));

        System.out.println(studentList);

        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(101, new Student(11, "Amit", 91.2));
        studentHashMap.put(102, new Student(12, "Neha", 84.6));
        studentHashMap.put(103, new Student(13, "Rohan", 76.3));
        studentHashMap.put(104, new Student(14, "Sneha", 89.7));

        System.out.println(studentHashMap);

        for (Map.Entry<Integer, Student> entry : studentHashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " +
                    entry.getValue().studentName.toUpperCase());
        }
    }
}