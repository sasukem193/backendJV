package array.insertValueinArray;
import java.util.Scanner;
public class MyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[10];
        double[] newArray = new double[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.floor(Math.random() * 20);
            newArray[i] = array[i];
            System.out.print(array[i] + " ");
        }

        System.out.println("\nInput a Value");
        int myValue = scanner.nextInt();
        System.out.println("Input your Index");
        int myIndex = scanner.nextInt();

        if (myIndex > 1 && myIndex < array.length - 1) {
            for (int i = myIndex; i < newArray.length-1; i++) {
                newArray[i+1] = array[i];
                newArray[myIndex] = myValue;
            }
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }

    }
}


