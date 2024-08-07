import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment {
    
    public void Student_grading(String name, int index_num,double score){
        
        char grade;
        if(score >= 70){
            grade = 'A';
        }else if (score >= 60){
            grade = 'B';
        }else if (score >= 50){
            grade = 'C';
        }else if (score >= 40){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println(name + " with index number " + index_num + " got " + grade);
}
   
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String name;int index_num = 0;double score = 0.00;
        System.out.println("Enter your name: ");
        name = input.nextLine();
        while(name.isEmpty() || name.matches("-?\\d+(\\.\\d+)?")){
            System.out.println("Please enter a valid name:");
            name = input.nextLine();
        }

        boolean validIndex = false;
while(!validIndex) {
    System.out.println("Enter your index number: ");
    try {
        index_num = input.nextInt();
        validIndex = true;
    } catch (InputMismatchException e) {
        System.out.println("The index number you entered is invalid!");
        input.nextLine(); // discard the invalid input
    }
}
    boolean validscore = false;
    while(!validscore){
    System.out.println("Enter your Maths score: ");
    try {
        score = input.nextDouble();
        validscore = true;
    } catch (InputMismatchException e) {
        System.out.println("The score you entered is invalid!");
        input.nextLine(); // discard the invalid input
    }
    }
    input.close();
    Assignment myobj = new Assignment();
    myobj.Student_grading(name, index_num, score);
}
}
