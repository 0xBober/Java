package Inheritance_Employee;

public class Intern extends Employee {

    private final static double pension = 1200.00;

    public Intern(String name ,String homeAddress){
        super(name, homeAddress);
        this.salary = CalculateSalary();
    }

    @Override
    public double CalculateSalary() {
        return pension;
    }
}
