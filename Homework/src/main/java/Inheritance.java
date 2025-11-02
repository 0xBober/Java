import Inheritance_Animals.Animals;
import Inheritance_Animals.Cat;
import Inheritance_Animals.Dog;
import Inheritance_Animals.Fish;
import Inheritance_Employee.ContractEmployee;
import Inheritance_Employee.Employee;
import Inheritance_Employee.FullTimeEmployee;
import Inheritance_Employee.Intern;
import Inheritance_Shapes.*;


public class Inheritance {
    public void task_1(){

        System.out.println("""
                🐾 Task 1 — Zoo Animal Hierarchy
                
                Create a class hierarchy that simulates different types of animals in a zoo.
                Each animal can introduce itself and make sounds — but each does it differently.
                
                Create a base class Animal with the following fields and methods:
                
                ●Fields: name, age
                
                ●Methods:
                    ●introduceYourself() — prints the animal’s name and age
                    ●voice() and eat() — by default, print "voice" and "food"
                
                Create several derived classes representing animals that live in the zoo.
                Override the voice() and eat() methods to match each animal’s behavior.
                Use a loop to display information about all animals living in the zoo.
                """);

        Animals randomAnimal = new Animals("Random Animal", 66);
        Dog Delta = new Dog("Delta", 5);
        Cat Mimi = new Cat("Mimi", 6);
        Fish Steven = new Fish("Steven", 7);

        Animals[] animalList = new Animals[4];

        animalList[0] = randomAnimal;
        animalList[1] = Delta;
        animalList[2] = Mimi;
        animalList[3] = Steven;

        for (Animals animal : animalList) {
            Main.lineFill();
            animal.introduceYourself();
            animal.voice();
            animal.eat();
            Main.lineFill();
        }
    }


    public void task_2(){
        System.out.println("""
                🧮 Task 2 — Geometry Shape System
                
                Create a system that can calculate the area and perimeter of different geometric figures.
                Each figure has a name and a specific way to calculate its area and perimeter — depending on the figure type.
                
                Create an abstract class called Shape that contains:
                
                ●Private fields: name, area, perimeter
                ●A constructor that sets the name
                ●Two abstract methods:
                    →void calculateArea()
                    →void calculatePerimeter()
                ●One regular method:
                    →displayInfo() — displays information about the figure
                
                Create subclasses that inherit from Figure and implement the abstract methods.
                Use an array Figure[] to test the solution and display the calculated results.
                """);

        Shape[] shapeList = new Shape[4];

        shapeList[0] = new Square("Square", 5);
        shapeList[1] = new Circle("Circle", 5);
        shapeList[2] = new Rectangle("Rectangle", 5, 8);
        shapeList[3] = new Triangle("Triangle", 3, 4, 5);

        for (Shape shape : shapeList) {
            System.out.println(shape.showInfo());
        }

    }


    public void task_3(){
        System.out.println("""
                👔 Task 3 — Employee Hierarchy
        
                Using Task 4 from the “Objects and Classes” lesson as a base,
                create an abstract class Employee.

                Add an abstract method:
                
                void calculateSalary();
                
                which will calculate the salary depending on the type of employee.
                
                Create derived classes representing different forms of employment:
                ●FullTimeEmployee — has a fixed salary
                ●ContractEmployee — salary = hourly rate × number of hours
                ●Intern — salary is a scholarship (a fixed payment amount)
        
                Test the implementation by creating an array or list of employees working under different forms of employment.
        """);

        Employee[] employeeList = new Employee[3];

        employeeList[0] = new FullTimeEmployee("Tom", "Tom's Address");
        employeeList[1] = new Intern("John", "John's Address");
        employeeList[2] = new ContractEmployee("Jane", "Jane's Address", 160);

        for( Employee employee : employeeList ){
            System.out.println(employee.getInfo());
        }
    }

}
