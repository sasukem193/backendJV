package rectangle;
import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Input width of rectangle");
        double width= scanner.nextDouble();
        System.out.println("Input width of rectangle");
        double height= scanner.nextDouble();

        Rectangle rectangle= new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("The area of rectangle is: "+rectangle.getArea());
        System.out.println("The primetric of rectangle is: "+ rectangle.getPrimetric());
    }
}
