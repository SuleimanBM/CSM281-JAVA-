import java.util.Scanner;

public class Ocurrence {
    
    static void position(int[] array, int number){
        int last = 0;
        System.out.println(array.length);
        for (int i = array.length; i > 0; i--){
            if(number == array[i-1]){
                last = i;
                break;
            }
            
        }
        System.out.println(last);
    }

    public static void main(String[] args){
        int[] myarray = {0,1,7,10,30,2,8,17,3,56,74,4,12,15,5,2,9,10,2,6,3,5,7,8,3,6,9,0,10,1,3,11,7,5,12,3,5,17};
        position(myarray,3);
    }
}
