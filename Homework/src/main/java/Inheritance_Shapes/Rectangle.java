package Inheritance_Shapes;

public class Rectangle extends Shape {

    private final double sideA;
    private final double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;

        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea(){
        this.area = sideA*sideB;
    }

    @Override
    public void calculatePerimeter(){
        this.perimeter = 2 * sideA + 2 * sideB;
    }

    @Override
    public String getShapeDimensions(){
        return "Side lengths: Side A → " + sideA + " Side B → " + sideB;
    }
}
