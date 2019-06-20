package ihenritance.poin2dand3d;
import java.util.Arrays;

public class Test2D3D {
    public static void main(String[] args) {
        Point2D point2D= new Point2D(2,5);
        System.out.println(point2D);

        Point2D setPoint2D= new Point2D();
        setPoint2D.setX(2);
        System.out.println(setPoint2D);

        Point3D point3D= new Point3D(3,4,5);
        System.out.println(point3D);
    }
}
