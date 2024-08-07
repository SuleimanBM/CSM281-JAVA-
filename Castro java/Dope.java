import java.util.Scanner;

public class Dope {


    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your exam score (out of 30): ");
        int exam = input.nextInt();
        
        System.out.print("Enter your assessment score (out of 20): ");
        int assessment = input.nextInt();
        
        System.out.print("Enter your fee paid (out of 100): ");
        int fee = input.nextInt();

   
        input.close();

      
        int total = exam + assessment;

       
        boolean pass = false;

       
        String feedback = "";

       
        if (exam >= 25 && assessment >= 15) {
           
           
            pass = true;
            feedback += "You passed the exam and the assessment.\n";
        } else if (total >= 39) {
          
          
            pass = true;
            feedback += "You are condoned with a total score of " + total + ".\n";
        } else {
          
          
            pass = false;
            feedback += "You failed the exam and/or the assessment.\n";
        }

       
       
        if (exam < 25) {
            feedback += "You failed the exam with a score of " + exam + ".\n";
        } else {
            feedback += "You passed the exam with a score of " + exam + ".\n";
        }

        if (assessment < 15) {
            feedback += "You failed the assessment with a score of " + assessment + ".\n";
        } else {
            feedback += "You passed the assessment with a score of " + assessment + ".\n";
        }

      
        if (fee < 100) {
           
           
            pass = false;
            feedback += "You have not paid your fee in full. You owe " + (100 - fee) + ".\n";
        } else {
          
          
            feedback += "You have paid your fee in full.\n";
        }

        
        if (pass) {
            
            
            feedback += "You have passed the course and are issued with a certificate.\n";
        } else {
         
         
            feedback += "You have failed the course and are required to repeat it.\n";
        }


        System.out.println(feedback);
    }
}
