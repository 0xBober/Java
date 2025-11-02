package Inheritance_Animals;

public class Dog extends Animals{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the dog is eating");
    }

    @Override
    public void voice(){
        System.out.println(this.name + " the dog goes *woof*🐕");
    }
}
