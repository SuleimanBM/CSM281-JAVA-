import java.util.Scanner;


public class Methodoverloading {
    
    static void nameage(String name, int age){
        System.out.println("I'm " + name + " and a " + age +" year old");
    }
    public void nameage(String name, String age){
        System.out.println("I'm " + name + " and a "+ age +" year old");
    }

    public static void main(String args[]){
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        int user = myinput.nextInt();
        Factorial.factorial(user);
        //System.out.println("please enter your name: ");
        //String name = myinput.nextLine();
        //System.out.println("please enter your age: ");
        //int age = myinput.nextInt();
        myinput.close();
       //nameage(name, age);
       
    }
}