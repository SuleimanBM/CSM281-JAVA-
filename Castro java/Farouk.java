import java.util.Scanner;

public class Farouk {
    
    public static void main(String[]args){
        int sum =0;  
        int first_digit , second_digit , third_digit , fourth_digit;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kindly enter your first digit: ");
        first_digit = scanner.nextInt();

        System.out.println("Kindly enter your second digit: ");
        second_digit = scanner.nextInt();

        System.out.println("Kindly enter your third digit: ");
        third_digit = scanner.nextInt();

        System.out.println("Kindly enter your fourth digit: ");
        fourth_digit = scanner.nextInt();
        sum = first_digit + second_digit + third_digit + fourth_digit ;
        int average = sum / 4;

        scanner.close();
        System.out.println("The average of your inputs provided is: "+ average);
    }
}

