package interfaceabstract.colorable;

import ihenritance.lab.Shape;

public class Circle extends Shape implements Colorable {
    private double radius= 4.0;

    public Circle(){
    }
    public Circle(String color, Boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius= "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
