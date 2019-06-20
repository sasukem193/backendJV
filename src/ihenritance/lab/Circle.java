package ihenritance.lab;

public class Circle extends Shape {
    private double radius= 1.0;

    public  Circle(){
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

//    public static void main(String[] args) {
//            Circle circle = new Circle("red", false, 1.2);
//            System.out.println(circle);
//    }

}
