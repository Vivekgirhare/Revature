package jan21;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeArrayList {

    public static void main(String[] args) {
        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"Shashi","sales",35000.));
        employeeList.add(new Employee(2,"Suresh","account",45000.56));
        employeeList.add(new Employee(3,"Neeta","sales",37000.33));
        employeeList.add(new Employee(4,"Lakshmi","IT",38000.38));

        //filter the employees from IT department
        //stream api
//        List<Employee>salesdept=employeeList.stream()
//                .filter(emp->emp.getDepartment().equals("sales"))
//                .collect(Collectors.toList());
//        System.out.println("sales department data");
//        salesdept.forEach(System.out::println);


//        //earning more than 30000
//        List<String>thirtymore=employeeList.stream()
//                .filter(e->e.getSalary()>30000)
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//        System.out.println("Names of who are Earning more than 30 thousand");
//        System.out.println(thirtymore);


        // Sort the employees by salary
        System.out.println("Employees sorted by salary:");
        employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .forEach(System.out::println);

        // Sort employees according to the name
        System.out.println("\nEmployees sorted by name:");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        // Employee with highest salary
        Employee highestSalaryEmployee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .get();

        System.out.println("\nHighest salary employee:");
        System.out.println(highestSalaryEmployee.getName() + " - " + highestSalaryEmployee.getSalary());

        // Employee with lowest salary
        Employee lowestSalaryEmployee = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .get();

        System.out.println("\nLowest salary employee:");
        System.out.println(lowestSalaryEmployee.getName() + " - " + lowestSalaryEmployee.getSalary());

    }
}