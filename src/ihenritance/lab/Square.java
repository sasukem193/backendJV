package ihenritance.lab;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(String color, Boolean filled, double side){
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of Rectangle";
    }
}
