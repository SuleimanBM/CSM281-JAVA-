import java.util.Scanner;
public class Jadagwa{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int oddNumbers[][] = new int[3][3];
      System.out.println("Enter the first 9 odd numbers: "); 

      for(int i = 0; i < oddNumbers.length; i++){
        for(int j = 0; j < oddNumbers[i].length; j++){
          oddNumbers[i][j] = input.nextInt();
        }
      }
      
          input.close(); 
          int leadingDProduct = oddNumbers[0][0]*oddNumbers[1][1]*oddNumbers[2][2];
          int trailingDProduct = oddNumbers[0][2]*oddNumbers[1][1]*oddNumbers[2][0];
          int difference = trailingDProduct - leadingDProduct;
          System.out.println("dd" + difference); 
    
}
}