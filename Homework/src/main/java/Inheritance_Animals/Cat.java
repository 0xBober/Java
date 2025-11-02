package Inheritance_Animals;

public class Cat extends Animals{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the cat is eating");
    }

    @Override
    public void voice(){
        System.out.println(this.name + " the cat goes *meow*🐈");
    }
}
