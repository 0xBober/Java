package ObjAndClassPK;

public class Student
{
    private final int age;
    private final String name;
    private final double height;

    public Student(){
        this.age = 0;
        this.name = "";
        this.height = 0.0;
    }

    public Student(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String toString(){
        return "Age: " + age + "\tName: " + name + "\tHeight: " + height;
    }
}
