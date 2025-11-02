import ObjAndClassPK.Employee;
import ObjAndClassPK.HomeAddress;
import ObjAndClassPK.StringUtils;
import ObjAndClassPK.Student;

import java.time.LocalDate;
import java.time.Period;

public class objectsAndClasses {

    public void task_1(){
        System.out.println("Using the built-in Date or LocalDate class, create a program that calculates the number of days in the summer semester and displays it on the screen.");

        LocalDate Today = LocalDate.now();
        System.out.println("Current date is: " + Today);

        LocalDate SchoolEndsDate = LocalDate.of(2026, 6, 26);

        Period daysToEnd = Period.between(Today, SchoolEndsDate);

        System.out.println("School ends in: " + daysToEnd.getDays() + " days " + daysToEnd.getMonths() + " months and " + daysToEnd.getYears() + " years");
    }

    public void task_2(){
        System.out.println("""
                Create a Student class representing a person.
                The student must have the following instance fields: age, name, and height.
                The class should contain:
                
                ●one empty (default) constructor, and
                
                ●another constructor requiring all fields to be provided.
                
                Encapsulation principles must be applied.
                In the Main.java file, create a new instance of the class using each constructor.
                """);

        Student student1 = new Student();
        Student student2 = new Student(1, "Tom", 157.45);

        System.out.println("student1: " + student1);
        System.out.println("student2: " + student2);
    }

    public void task_3(){
        System.out.println("""
                Create a StringUtils class with a method:
                
                Boolean isAnagram(String s1, String s2)
                
                which checks whether string s1 is an anagram of string s2.
                
                In the Main.java file, create one instance of the StringUtils object,
                and then call the isAnagram() method three times with different strings.
                
                (An anagram is a word or phrase formed by rearranging the letters of another word or phrase.)
                """);

        Main.input.nextLine();
        System.out.println("Enter first word:");
        String s1 = Main.input.nextLine();
        System.out.println("Enter second word:");
        String s2 = Main.input.nextLine();

        StringUtils stringUtils = new StringUtils();

        boolean isAnagram = stringUtils.isAnagram(s1, s2);

        System.out.println("isAnagram: " + isAnagram);
    }

    public void task_4_5(){
        System.out.println("""
                Create an Employee class representing an employee and a HomeAddress class.
                Employee must have private fields:
                name, salary, hireDate, and homeAddress.
                These fields should be initialized via arguments passed into the constructor.
                
                Prepare the following methods:
                
                ●getInfo() → returns information about the employee along with their address.
                ●setNewAddress(HomeAddress newAddress) → allows changing the address.
                ●raiseSalary(Double byPercent) → increases the employee’s salary by p%.
                
                In the Main.java file:
                
                ●Create an array of employees (minimum 3),
                ●Fill in their data and display their information,
                ●Increase their salaries,
                
                Then display their updated information again.
                
                Task 5. Add an additional constructor to the Employee class with a default value for salary.
                """);

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Tom", 12345, new HomeAddress("Address1"));
        employees[1] = new Employee("Ana", 78912, new HomeAddress("Address2"));
        employees[2] = new Employee();

        for(Employee e : employees){
            System.out.println(e.getInfo());
        }
    }
}
