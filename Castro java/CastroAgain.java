import java.text.DecimalFormat;
import java.util.Arrays;

public class CastroAgain {
    static void Marks(){
        int indexNo [] = {10021007,10021107,10021207,10021307,10021407,10021507,10021607,10021707
            ,10021807,10021907,10022007,10022107,10022207,10022307,10022407};
        double marks [][] = {{65,78},{48,54},{22,90},{32,32},{80,66},{12,60},{45,48},{25,65},{33,45}
            ,{67,56},{23,33},{45,45},{56,67},{34,90},{81,67}};
        double StMarks [][] = new double[15][15];
        double FinalScore [] = new double[15];
        char grade [] = new char[15];
        int A = 0,B = 0,C = 0,D = 0,F = 0;
        double sum = 0;
        double average = 0;
        double maxscore = 0;
        double minscore = 100;
        
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
        Marks();
    }
}
