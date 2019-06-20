package ihenritance.circletocylinder;
import ihenritance.lab.Circle;
import ihenritance.lab.Shape;

public class Cylinder extends Circle {
    private double  height;

    public Cylinder(String color, Boolean filled, double radius, double height){
        super(color, filled, radius);
        this.height = height;
    }

    public double getArea(){
        return super.getArea()*2 + super.getPerimeter()*this.height;
    }
    public double getVolume(){
        return getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius= "
                + getRadius()
                + " with Area is: "
                + this.getArea()
                + ", which is a subclass of Circle "
                + "with Area is: "
                + super.getArea();
    }

}
