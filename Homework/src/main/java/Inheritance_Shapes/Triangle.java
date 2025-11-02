package Inheritance_Shapes;

public class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC){
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        calculatePerimeter();
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double p = this.perimeter / 2; //half of the triangles perimeter
        this.area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public void calculatePerimeter() {
        this.perimeter = sideA + sideB + sideC;
    }

    @Override
    public String getShapeDimensions() {
        return "Side lengths: A → " + sideA + " B → " + sideB + " C → " + sideC;
    }
}