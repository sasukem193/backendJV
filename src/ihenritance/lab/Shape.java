package ihenritance.lab;

public class Shape {
    private String color = "green";
    private  Boolean filled = true;

    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color= color;
        this.filled= filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public Boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor()
                +" and "
                + (isFilled() ? "filled":"not filled");
    }

//    public static void main(String[] args) {
//        Shape shape=new Shape();
//        shape.setColor("yellow");
//        System.out.println(shape);
//
//        shape= new Shape("red", false);
//        System.out.println(shape);
//    }
}
