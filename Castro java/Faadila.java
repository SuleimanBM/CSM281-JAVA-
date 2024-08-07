import java.util.Scanner;

public class Faadila {
    
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int high_Street_Branch[][] = {{42000, 48000, 50000}, {52000, 58000, 60000}, {46000, 49000, 58000}, {5000, 51000, 61000}};
        int mall_Branch[][] = {{57000, 63000, 60000}, {70000, 67000, 73000}, {67000, 65000, 62000}, {72000, 69000,75000}};
        int i=0;
        int j=0;
        //System.out.println(high_Street_Branch[1][2]);
        int monthlyCombined_JAN = high_Street_Branch[0][0] + mall_Branch[0][0];
        int monthlyCombined_FEB = high_Street_Branch[0][1] + mall_Branch[0][1];
        int monthlyCombined_MAR = high_Street_Branch[0][2] + mall_Branch[0][2];
        int monthlyCombined_APR = high_Street_Branch[1][0] + mall_Branch[1][0];
        int monthlyCombined_MAY = high_Street_Branch[1][1] + mall_Branch[1][1];
        int monthlyCombined_JUNE = high_Street_Branch[1][2] + mall_Branch[1][2];
        int monthlyCombined_JULY = high_Street_Branch[2][0] + mall_Branch[2][0];
        int monthlyCombined_AUG = high_Street_Branch[2][1] + mall_Branch[2][1];
        int monthlyCombined_SEP = high_Street_Branch[2][2] + mall_Branch[2][2];
        int monthlyCombined_OCT = high_Street_Branch[3][0] + mall_Branch[3][0];
        int monthlyCombined_NOV = high_Street_Branch[3][1] + mall_Branch[3][1];
        int monthlyCombined_DEC = high_Street_Branch[3][2] +mall_Branch[3][2];


        System.out.println(monthlyCombined_JAN + " Ghana cedis is the monthly combined sales for January");
        System.out.println(monthlyCombined_FEB + " Ghana cedis is the monthly combined sales for February");
        System.out.println(monthlyCombined_MAR + " Ghana cedis is the monthly combined sales for March");
        System.out.println(monthlyCombined_APR + " Ghana cedis is the monthly combined sales for April");
        System.out.println(monthlyCombined_MAY + " Ghana cedis is the monthly combined sales for May");
        System.out.println(monthlyCombined_JUNE + " Ghana cedis is the monthly combined sales for June");
        System.out.println(monthlyCombined_JULY + " Ghana cedis is the monthly combined sales for July");
        System.out.println(monthlyCombined_AUG + " Ghana cedis is the monthly combined sales for August");
        System.out.println(monthlyCombined_SEP + " Ghana cedis is the monthly combined sales for September");
        System.out.println(monthlyCombined_OCT + " Ghana cedis is the monthly combined sales for October");
        System.out.println(monthlyCombined_NOV + " Ghana cedis is the monthly combined sales for November");
        

        int combinedQuarterly = 0;
        int totalA = 0;
        for ( i = 0; i <high_Street_Branch.length; i++)
        {
            for ( j = 0; j < high_Street_Branch[i].length; j++) 
            {
                System.out.print(high_Street_Branch[i][j]+" ");
                totalA += high_Street_Branch[i][j];
            }
            System.out.println();
        }



        //System.out.println(monthlyCombined);
    }
}

