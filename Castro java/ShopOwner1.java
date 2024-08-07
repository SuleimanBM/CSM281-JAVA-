import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class ShopOwner1 {
    static void account(int StreetBranch[][],int MallBranch[][], BufferedWriter bw) throws IOException{
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
                String output = "Combined sales for "+ Month[i][j] + " is "+ Monthly[i][j];
                System.out.println(output);
                bw.write(output);
                bw.newLine();
            }
        }
        for(int i = 1; i <=4;i++){
            String output = "The combined sales for Quarter "+i+" is "+quarterly[i-1];
            System.out.println(output);
            bw.write(output);
            bw.newLine();
        }
        String output = "StreetBranch annual total = "+annualStreet;
        System.out.println(output);
        bw.write(output);
        bw.newLine();
        output = "MallBranch annual total = "+annualMall;
        System.out.println(output);
        bw.write(output);
        bw.newLine();
        output = "GrandTotal = "+grandtotal;
        System.out.println(output);
        bw.write(output);
        bw.newLine();
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int StreetBranch[][] = new int[4][3];
        int MallBranch[][] = new int[4][3];
        System.out.println("Enter the values for StreetBranch and MallBranch:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Enter value for StreetBranch["+i+"]["+j+"]:");
                StreetBranch[i][j] = sc.nextInt();
                System.out.println("Enter value for MallBranch["+i+"]["+j+"]:");
                MallBranch[i][j] = sc.nextInt();
            }
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                bw.write("StreetBranch["+i+"]["+j+"] = "+StreetBranch[i][j]);
                bw.newLine();
                bw.write("MallBranch["+i+"]["+j+"] = "+MallBranch[i][j]);
                bw.newLine();
            }
        }
        account(StreetBranch,MallBranch, bw);
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}

