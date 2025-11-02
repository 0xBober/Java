package Inheritance_Shapes;

public class Circle extends Shape {

    private final double radius;

    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;

        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        this.area = (Math.PI * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        this.perimeter = (Math.PI * radius * radius);
    }

    public String getShapeDimensions(){
        return "Circle radius: " + radius;
    }
}
