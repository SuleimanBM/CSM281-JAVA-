import  java.io.*;
import java.util.Scanner;

public class ShopOwnerFile {
    static void account(int StreetBranch[][],int MallBranch[][]){
        String Month[][] = {{"JAN", "FEB", "MAR"}, {"APR","MAY", "JUN"}, {"JUL", "AUG", "SEP"},{"OCT", "NOV","DEC"}};
        int Monthly [][] = new int[4][3];
        int quarterly [] = new int[4];
        int annualStreet = 0,annualMall = 0, grandtotal = 0;
        for(int i =0; i <= 3;i++){
            for(int j = 0; j < 3; j++){
                Monthly[i][j] = StreetBranch[i][j] + MallBranch[i][j];
                quarterly [i] += Monthly[i][j];
                annualStreet += StreetBranch[i][j];
                annualMall += MallBranch[i][j];
            }
        }
        grandtotal += (annualMall + annualStreet);
        for(int i = 0 ; i < Month.length; i++){
            for(int j = 0; j < Month[i].length; j++){
                System.out.println("Combined sales for "+ Month[i][j] + " is "+ Monthly[i][j]);
            }
        }
        for(int i = 1; i <=4;i++){
            System.out.println("The combined sales for Quarter "+i+" is "+quarterly[i-1]);
        }
        System.out.println("StreetBranch annual total = "+annualStreet);
        System.out.println("MallBranch annual total = "+annualMall);
        System.out.println("GrandTotal = "+grandtotal);
    }
    public static void main(String[] args){
        File sales = new File("sales.txt");
        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter("sales.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        String[] malls = {"Street Branch","Mall Branch"};
        int StreetBranch[][] = {{42000,48000,50000},{52000,58000,60000},{46000,49000,58000},{50000,51000,61000}};
        int MallBranch[][] = {{57000,63000,60000},{70000,67000,73000},{67000,65000,62000},{72000,69000,75000}};
        for(int h = 0; h <= 1 ; h++){
            for(int i = 1;i<= 4;i++){
                for(int j = 1 ; j <= 3 ; j ++){
                    try{
                        
                        System.out.println("Enter the total sales of " +malls[h]+ " for Month "+ j + " of Quarter " + i );
                        String amount = input.nextLine();
                        buffer.write(amount);
                        buffer.close();
                    }catch(IOException ioe){
    
                    }
                   
    
                }
            }
        }
        account(StreetBranch,MallBranch);
    }
}
