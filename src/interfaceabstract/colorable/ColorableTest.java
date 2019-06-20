package interfaceabstract.colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Circle[] circle= new Circle[2];
        circle[0]= new Circle();
        circle[0].howToColor();

        circle[1]= new Circle( "red", false,20);

        for(Circle circle1s:circle){
            System.out.println(circle1s);
        }
    }
}
