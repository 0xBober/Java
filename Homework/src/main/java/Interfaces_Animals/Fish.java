package Interfaces_Animals;

public class Fish implements Animals {

    public String name;
    public int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the fish is eating");
    }

    @Override
    public void introduceYourself() {
        System.out.println(this.name + " the fish is " + this.age + " years old");
    }

    @Override
    public void voice(){
        System.out.println(this.name + " the fish is silent🐟");
    }
}
