package ihenritance.lab;

public class Rectangle extends Shape {
    private double width=1;
    private double length=1;

    public Rectangle(){};

    public Rectangle( String color, Boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length= length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width*this.length;
    }
    public double getPrimetric(){
        return (this.width+this.length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
