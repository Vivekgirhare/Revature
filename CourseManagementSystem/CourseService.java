package CourseManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseService {

    ArrayList<Course> courses = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // CREATE
    public void addCourse() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO courses VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter ID: ");
            ps.setInt(1, sc.nextInt());
            sc.nextLine();

            System.out.print("Enter Name: ");
            ps.setString(2, sc.nextLine());

            System.out.print("Enter Duration: ");
            ps.setInt(3, sc.nextInt());

            System.out.print("Enter Fee: ");
            ps.setDouble(4, sc.nextDouble());

            ps.executeUpdate();
            System.out.println("Course Added");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public void viewCourses() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM courses";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                                rs.getString(2) + " | " +
                                rs.getInt(3) + " months | ₹" +
                                rs.getDouble(4)
                );
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateCourse() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE courses SET course_name=?, duration=?, fee=? WHERE course_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Course ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("New Name: ");
            ps.setString(1, sc.nextLine());

            System.out.print("New Duration: ");
            ps.setInt(2, sc.nextInt());

            System.out.print("New Fee: ");
            ps.setDouble(3, sc.nextDouble());

            ps.setInt(4, id);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Updated" : "Not Found");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public void deleteCourse() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM courses WHERE course_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Course ID: ");
            ps.setInt(1, sc.nextInt());

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Deleted" : "Not Found");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
