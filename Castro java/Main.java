import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int noStudent = 20;
        int response [] = new int[20];
        Scanner myinput = new Scanner(System.in);
        for(int i = 1; i <= noStudent;i++){
            System.out.println("Next Student should enter rating: ");
            int myrating = myinput.nextInt();
             response[i-1] = myrating;
        }
        
        for(int i = 0;i <= response.length-1;i++){

            if(response[i] == 1){
                one += 1;
            }else if (response[i] == 2){
                two += 1;
            }else if (response[i] == 3){
                three += 1;
            }else if (response[i] == 4){
                four += 1;
            }else{
                five += 1;
            }
        }
        System.out.println("The frequency of the ratings are as follows \nOne(1) : " + one +"\nTwo(2) : "+
         two +"\nThree(3) : "+ three +"\nFour(4) : "+ four +"\nFive(5) : "+ five );
    }
}
