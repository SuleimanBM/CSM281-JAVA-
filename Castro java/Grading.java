import java.util.Scanner;


    public class Grading {
        static boolean grade(int examscore, int assessmentscore){
            int total_score = examscore + assessmentscore;
            if((examscore >= 25 && assessmentscore >= 15) && total_score >= 40){
                return true;
            }else{
                return false;
            }
        }
        static boolean fees(int feespercentage){
            if(feespercentage >= 100){
                return true;
            }else{
                return false;
            }
        }
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Exams score:");
            int examscore = input.nextInt();
            System.out.println("Enter your Assessment score:");
            int assessmentscore = input.nextInt();
            System.out.println("Enter the amount of fees paid in percentage(exclude the '%' sign):");
            int feespaid = input.nextInt();
            input.close();
            if(grade(examscore, assessmentscore) && fees(feespaid)){
                System.out.println("Congratulations! You qualify to earn a certificate");
            }else {
                if(grade(examscore, assessmentscore)){
                    System.out.println("Congratulations! You passed the course \nBut you can't be offered a certificate since you haven't payed your fees in full");
                }else{
                    if(examscore <= 25 && assessmentscore >= 15 ){
                        System.out.println("Sorry you failed the exams with score("+examscore+") but passed the assessment with score("+assessmentscore+")");
                    }else if( examscore >= 25 && assessmentscore < 15){
                        System.out.println("Sorry you failed the assessment with score("+assessmentscore+") but passed the exams with score("+examscore+")");
                    }else{
                        System.out.println("Sorry you failed both the assessment and the exams ");
                    }
                }
            }
    
            }
    
        }
       
    
   

