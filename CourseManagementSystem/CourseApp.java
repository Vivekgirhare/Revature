package CourseManagementSystem;

import java.util.Scanner;

public class CourseApp {

    public static void main(String[] args) {

        CourseService service = new CourseService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Course Management System ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.addCourse();
                    break;
                case 2:
                    service.viewCourses();
                    break;
                case 3:
                    service.updateCourse();
                    break;
                case 4:
                    service.deleteCourse();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}