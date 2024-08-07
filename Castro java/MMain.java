import java.util.Arrays;
import java.util.Scanner;

public class MMain {
    public static void main(String[] args){
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Enter the next even number: ");
            int evenNo = input.nextInt();
            array[i] = evenNo; 
        }
        input.close();
        System.out.println("The array of the even numbers are: "+Arrays.toString(array));  
        int mean = 0,counter = 0,sumofvalues = 0;
        double deviationSquared = 0;
        for(int i = 0; i < 10; i++){
            sumofvalues += array[i];
            counter += 1;
        }
          mean = sumofvalues / counter;
        for(int i = 0; i < 10; i++){
            int deviation = 0;
            deviation = (array[i] - mean);
           
            deviationSquared += Math.pow(deviation,2);
            
            
        }
        double variance = deviationSquared / counter;
        double standardDeviation = Math.sqrt(variance);
       
        System.out.println("The standart deviation is "+standardDeviation);
    }
    }
    

