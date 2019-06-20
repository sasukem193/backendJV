package array.exeption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input 3 lengths of Triangle");
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();
    try{
        System.out.println("3 canh cua tam giac:"+a+b+c);
    }
    catch (ArithmeticException e){
        System.out.println();
    }
    }
}
