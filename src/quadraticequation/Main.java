package quadraticequation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a,b,c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Root1= " + quadraticEquation.getRoot1());
            System.out.println("Root2= " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Root= " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}