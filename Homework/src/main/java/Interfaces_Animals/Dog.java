package Interfaces_Animals;

public class Dog implements Animals {

    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the dog is eating");
    }

    @Override
    public void introduceYourself() {
        System.out.println(this.name + " the dog is " + this.age + " years old");
    }

    @Override
    public void voice(){
        System.out.println(this.name + " the dog goes *woof*🐕");
    }
}
