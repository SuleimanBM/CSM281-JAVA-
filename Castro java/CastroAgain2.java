import java.util.Arrays;
import java.util.Scanner;

public class CastroAgain2 {
    static void Marks(int numofstudent,int indexNo[],double marks[][]){
        
        double StMarks [][] = new double[numofstudent][numofstudent];double FinalScore [] = new double[numofstudent];char grade [] = new char[numofstudent];
        int A = 0,B = 0,C = 0,D = 0,F = 0;double sum = 0;double average = 0;double maxscore = 0;double minscore = 100;
        for(int i = 0 ; i <= marks.length-1; i++){
            double midsem = (marks[i][0]) * 0.3;
            StMarks[i][0] += midsem;
            double exam = (marks[i][1]) * 0.7;
            StMarks[i][1] += exam;
            double total = StMarks[i][0] + StMarks[i][1];
            double dp = Math.round(total * 100)/100;
            FinalScore[i] += dp;
            sum += FinalScore[i];
            if(FinalScore[i] >= maxscore){
                maxscore = FinalScore[i];
            }
            if(FinalScore[i] <= minscore){
                minscore = FinalScore[i];
            }
        }
        average = sum / FinalScore.length;
        for(int i = 0; i <= FinalScore.length-1; i++){
            if(FinalScore[i] >= 70){
                A += 1;
                grade[i] += 'A';
            }else if(FinalScore[i] >= 60){
                B += 1;
                grade[i] += 'B';
            }else if(FinalScore[i] >= 50){
                C += 1;
                grade[i] += 'C';
            }else if(FinalScore[i] >= 40){
                D += 1;
                grade[i] += 'D';
            }else{
                F+=1;
                grade[i] += 'F';
            }
        }
        System.out.println("Index No   Score  Grade");
        for(int i = 0 ; i <= indexNo.length-1;i++){
            System.out.println(indexNo[i] +"   "+ FinalScore[i] +"   " +grade[i]);
        }
        System.out.println("\n");
        System.out.println("The frequency of grade A is "+A);
        System.out.println("The frequency of grade B is "+B);
        System.out.println("The frequency of grade C is "+C);
        System.out.println("The frequency of grade D is "+D);
        System.out.println("The frequency of grade F is "+F);
        System.out.println("\n");
        System.out.println("The maximum score is "+maxscore);
        System.out.println("The minimum score is "+minscore);
        System.out.println("The average of the marks is "+ average);
        System.out.println("\n");
   
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of Student who took the exams(midsem and Endofsem):");
        int numofstudent = input.nextInt();
        int indexNo [] = new int[numofstudent];
        double marks[][] = new double[numofstudent][numofstudent];
        for(int i = 1; i <= numofstudent; i++){
            System.out.println("Enter index number of Student "+ i +" :");
            int Stnumber = input.nextInt();
            System.out.println("Enter Midsem score of Student "+ i +" :");
            double midscore = input.nextDouble();
            System.out.println("Enter Exam score of Student "+ i +" :");
            double examscore = input.nextDouble();
            indexNo[i-1] += Stnumber;
            marks[i-1][0] += midscore;
            marks[i-1][1] += examscore;
        }
        Marks(numofstudent,indexNo,marks);
    }
}
