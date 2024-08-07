import java.util.Scanner;

public class Factorial{
    static  void factorial(int mynum){
        int results = 1;
        if (mynum == 0){
            System.out.println("The factorial of " + mynum + " is " + 0);
        }else{
            for(int i = 1;i <= mynum ; i++){
                results = results* i;
            }
           System.out.println("The factorial of " + mynum + " is " + results);
        }

    }
    public static void main(String args[]){
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter an integer to find it's factorial: ");
        int num = myinput.nextInt();
        myinput.close();
        Factorial obj = new Factorial();
        obj.factorial(num);
    }
}