package ObjAndClassPK;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private double salary;
    private LocalDate hireDate;
    private HomeAddress homeAddress;

    public Employee(){
        this.name = "Blank";
        this.salary = 0;
        this.hireDate = null;
        this.homeAddress = new HomeAddress();
    }

    public Employee(String name, double salary, HomeAddress homeAddress){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.now();
        this.homeAddress = homeAddress;
    }

    public String getInfo(){
        return "Name: " + this.name + "\t\tSalary: " + this.salary + "\t\tHire Date: " + this.hireDate + "\t\tAddress Details: " + this.homeAddress;
    }

    public void setNewAddress(HomeAddress newAddress){
        this.homeAddress = newAddress;
    }

    public void raiseSalary(double percent){
        if(percent < 0){
            System.out.println("Salary cannot be negative");
        } else if (percent < 1) {
            System.out.println("The function is called RaiseSalary not LowerSalary!! Number must be grater then 1 = 100%");
        }else{
            this.salary *= percent;
        }
    }
}
