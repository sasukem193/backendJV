package counttime;

public class CountTime {
    public static void main(String[] args) {
        StopTime stopTime= new StopTime();
        stopTime.getStartTime();

     double[] myArray= new double[50];
     for (int i=0; i<myArray.length;i++){
         myArray[i]= Math.floor(Math.random()*100);
     }

     double term;
     for(int i=0; i<myArray.length-1;i++){
         for(int j=0; j<myArray.length-i-1;j++){
            if(myArray[j]>myArray[j+1]){
                term= myArray[j];
                myArray[j]= myArray[j+1];
                myArray[i+1]= term;
            }
         }
     }

     for(int i=0; i<myArray.length; i++){
         System.out.print(myArray[i]+ " ");
     }

     stopTime.getEndTime();
     long count= stopTime.getElapsedTime();
        System.out.println("\n Time of turn is: "+count+" miliseconds");
    }
}
