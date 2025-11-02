package Interfaces_Animals;

public class Cat implements Animals {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the cat is eating");
    }

    @Override
    public void introduceYourself() {
        System.out.println(this.name + " the cat is " + this.age + " years old");
    }

    @Override
    public void voice(){
        System.out.println(this.name + " the cat goes *meow*🐈");
    }
}
