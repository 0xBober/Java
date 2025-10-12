public class Employee
{
    public int id;
    private String name;
    private double salary;
    private String hireDate;
    private String homeAddress;

    public Employee(){
        System.out.println("Object created with class Employee with no parameters, setting default sallary to 1600");
        this.salary = 1600;
    }

    public Employee(int id, String name, double salary, String hireDate, String homeAddress){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.homeAddress = homeAddress;
        System.out.println("Object created with class Employee with parameters");
    }

    public String getInfo(){
        return "ID: " + id +"\tName: " + name + "\t Salary: " + String.format("%.2f", salary) + "\tHome Address: " + homeAddress + "\n";
    }

    public void setNewAddress(String newAddress){
        this.homeAddress = newAddress;
    }

    public void raiseSalary(double precentModifyer){
        if(precentModifyer < 1.0){
            System.out.println("Value lower then 100%, must be grater then 100%");
            return;
        }else{
            this.salary *= precentModifyer;
        }
    }
}
