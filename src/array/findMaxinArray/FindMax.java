package array.findMaxinArray;

public class FindMax {
    public static void main(String[] args) {
        double[][] myArray= new double[10][10];

        for(int i=0; i<myArray.length;i++){
            for(int j=0; j<myArray[0].length; j++){
                myArray[i][j]= Math.floor(Math.random()*100);
                System.out.print(myArray[i][j]+" ");
            }   System.out.print("\n");
        }

        double max= myArray[0][0];
        for(int i=0; i<myArray.length;i++){
            for(int j=0; j<myArray[0].length; j++){
                if(max< myArray[i][j]){
                max= myArray[i][j];
                }
            }
        }
        System.out.println("Max is: "+max);
        }
    }

