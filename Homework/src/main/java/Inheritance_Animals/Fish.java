package Inheritance_Animals;

public class Fish extends Animals{

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the fish is eating");
    }

    @Override
    public void voice(){
        System.out.println(this.name + " the fish is silent🐟");
    }
}
