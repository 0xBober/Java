package Inheritance_Shapes;

public class Square extends Shape {

    private final double side;

    public Square(String name, double side){
        super(name);
        this.side = side;

        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea(){
        this.area = side*side;
    }

    @Override
    public void calculatePerimeter(){
        this.perimeter = 4 * side;
    }

    @Override
    public String getShapeDimensions(){
        return "Sides length: " + side;
    }
}
