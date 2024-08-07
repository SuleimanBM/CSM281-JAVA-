//import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;
//import java.lang.Exception;
public class Holiday {
    static void Logic(String Students[],int phoneNumbers[],int ratings[]){
        int one =0, two=0, three=0, four=0, five=0, six=0, seven = 0;
        for(int i = 0 ;i < Students.length; i++){
            switch (ratings[i]) {
                case 1:
                    one++;
                    break;case 2:two++;break;case 3:three++;break;case 4:four++;break;case 5:five++;break;case 6:six++;break;default:seven++;break;
            }
        }
        int array[] = {one, two, three, four,five,six, seven};
        System.out.println("Number of students whose names and phone numbers were entered: " + Students.length);
        System.out.println("-------Ratings in NO order------");
        for(int j = 0;j < array.length  ; j++){
            System.out.println("Ratings " + array[j] );
        }
        
        Arrays.sort(array);
        
        System.out.println("-------Ratings in descending order------");
        for(int j = array.length-1 ;j >= 0 ; j--){
            System.out.println("Ratings " + array[j] );
        }
    }
    static void Query(String name,String Student[],int phoneNumbers[],int ratings[]){
        for(int a = 0; a < Student.length; a++){
            if(name.equals(Student[a])){
                System.out.println(Student[a] + "   "+ phoneNumbers[a]+"   "+ratings[a]);
            }
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of students participating: ");
         int noStudent = input.nextInt();
         String Students[] = new String[noStudent];
         int phoneNumbers[] = new int[noStudent];
         int ratings[] = new int[noStudent];
        for(int i = 0 ; i < noStudent; i++){
            System.out.println("Enter name of student: ");
            String nameStud = input.next();
            Students[i] = nameStud;
            
            System.out.println("Enter phone number: ");
            int phoneStud = input.nextInt();
            phoneNumbers[i] = phoneStud;
            System.out.println("Enter Rating for favourite holiday destination(1-7):");
            int ratingStud = input.nextInt();
            ratings[i] = ratingStud;
        }
        Logic(Students,phoneNumbers,ratings);
            String ans = "Y";
            
            System.out.println("Enter student name to query info");
            String Qname = input.next();
    
            while (ans.equals("Y")) {
                try {
                    Query(Qname, Students, phoneNumbers, ratings);
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                    // Handle other actions or logging
                }
                System.out.println("Do you want to query another student's info? (Y/N)");
                ans = input.next();
                if (ans.equals("Y")) {
                    System.out.println("Enter student name to query info");
                    Qname = input.next();
                }  
    }}
}
