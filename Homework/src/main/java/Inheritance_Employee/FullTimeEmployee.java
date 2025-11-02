package Inheritance_Employee;

public class FullTimeEmployee extends Employee {

    private final static double pension = 4600.00;

    public FullTimeEmployee(String name ,String homeAddress){
        super(name, homeAddress);
        this.salary = CalculateSalary();
    }

    @Override
    public double CalculateSalary() {
        return pension;
    }
}
