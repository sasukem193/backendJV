package ihenritance.poin2dand3d;
import java.util.Arrays;

public class Test3D {
    public static void main(String[] args) {
        Point2D point2D= new Point2D(2,5);
        System.out.println(point2D);
        float[] position2D= point2D.getXY();
        System.out.println(Arrays.toString(position2D));
    }
}
