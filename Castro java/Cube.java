import java.util.Arrays;
import java.util.Scanner;

public class Cube {
    static void cube(double array[][]){
        double newArray[][] = new double[3][3];
        int leadDiagonal = 1;
        int trailDiagonal = 1;
        int sum = 0;
        double deviationSquared = 0;
        for(int i = 0 ;i < array.length;i++){
            for(int j = 0; j< array[i].length; j++){
                if( i == j){
                    leadDiagonal *= array[i][j];
                }
                if((i + j ) == array.length-1){
                    trailDiagonal *= array[i][j];
                }}}
        int difference = trailDiagonal - leadDiagonal;
        array [1][1] = difference;
        array [0][1] = leadDiagonal;
        array [2][1] = trailDiagonal;
        System.out.println("2D 3x3 array after finding the difference between"+
        "the product of the leading diagonal and the product of the trailing diagonal ");
        System.out.println(Arrays.deepToString(array)+"\n");
        for(int i = 0 ;i < array.length;i++){
            for(int j = 0; j< array[i].length; j++){
                sum += array[i][j];    
        }}
        double average = sum / 9;
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                double deviation = 0;
                    deviation = (array[i][j] - average);
                    deviationSquared += Math.pow(deviation,2);
            }}
        double variance = deviationSquared / 9;
        double standardDeviation = Math.sqrt(variance);
        array [1][0] = average;
        array [1][2] = standardDeviation;

        newArray = array;
        System.out.println("2D 3x3 array after finding Average and Standart Deviation");
        System.out.println(Arrays.deepToString(newArray)+"\n");
        for(int i =0; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                for(int k = 0; k < array.length; k++){
                    for(int l = 0; l < array[k].length; l++){
                        if(array[i][j]>array[k][l]){
                            double temp = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l] = temp; 
                        }}}}}
        System.out.println("2D 3x3 array after sorting in decending order");
        System.out.println(Arrays.deepToString(array));  
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double array[][] = new double[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Enter item " + (j+1) + " in row "+ (i+1));
                int number = input.nextInt();
                array[i][j] += number;
            }}  
        cube(array);
    }}