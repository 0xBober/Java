package Inheritance_Employee;

public class ContractEmployee extends Employee {

    private static double hours;
    private final static double rate = 45.66;

    public ContractEmployee(String name ,String homeAddress, double hours){
        super(name, homeAddress);
        this.hours = hours;
        this.salary = CalculateSalary();
    }

    @Override
    public double CalculateSalary() {
        return hours * rate;
    }
}
