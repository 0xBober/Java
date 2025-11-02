package Inheritance_Shapes;

public abstract class Shape {
    private final String name;
    double area;
    double perimeter;

    public Shape(String name) {
        this.name = name;
        this.area = 0;
        this.perimeter = 0;
    }

    public abstract void calculateArea(); //to be overwritten

    public abstract void calculatePerimeter(); //to be overwritten

    public abstract String getShapeDimensions(); //Return Inheritance_Shapes.Shape dimensions eg Side lengths or circumference

    public String showInfo(){
        return String.format(
                "Name: %-10s Area: %8.2f  Perimeter: %8.2f  %s",
                this.name, this.area, this.perimeter, getShapeDimensions()
        );
    }
}