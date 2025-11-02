package Inheritance_Animals;

public class Animals {

    public String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public void voice() {
        System.out.println("The animal uses its Voice");
    }

    public void eat() {
        System.out.println("The animal is Eating");
    }
}
