public class Student {
    public String name;
    private int age;
    protected double height;

    public Student(){
        System.out.println("Object created with class Student with no parameters");
    }

    public Student(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
        System.out.println("Object created with class Student with parameters");
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Age must be a positive integer");
        }
    }

    public int getAge(){
        return this.age;
    }

    public String toString() {
        return "Name: " + name + "\t\tAge: " + getAge() + "\t\tHeight: " + height;
    }
}
