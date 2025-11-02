package Inheritance_Employee;

public abstract class Employee {
    private final String name;
    double salary;
    private final String homeAddress;

    public Employee(){
        this.name = "Blank";
        this.salary = 0;
        this.homeAddress = "";
    }

    public Employee(String name, String homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public abstract double CalculateSalary();

    public String getInfo(){
        return String.format("Name: %-20s Salary: %-8.2f Address Details: %-30s Form of Employment: %-20s", this.name , this.salary, this.homeAddress, this.getClass().getSimpleName());
    }
}