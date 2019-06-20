package rectangle;

public class Rectangle {

 double width;
 double height;

 public Rectangle(double width, double height){
     this.width= width;
     this.height= height;
 }

    public double getArea() {
        return this.width*this.height;
    }
    public double getPrimetric(){
        return  (this.width+this.height)*2;
    }

    public String display(){
     return "rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
