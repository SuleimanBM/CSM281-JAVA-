/*** 
import java.math.BigInteger;

public class Primenumber {
    
    static void prime(int number){
        
        BigInteger sumofprime = new BigInteger("123654789654123987");
        BigInteger i = new BigInteger("1478523698564")
        for(int i = 1; i <= number;i++){
            int factor = 1;
            for(int j = 1; j <= i/2;j++){
                
                if((i%j) == 0){
                    factor += 1;
                }
            }
            if(factor == 2){
               BigInteger c = sumofprime.add(i);
            }            
        }
        System.out.println(sumofprime);
    }
    public static void main(String[] args){
        prime(200);
    }
} ***/


public class Primenumber {
    
    static void prime(int number){
        
        int sumofprime = 0;
        for(int i = 1; i <= number;i++){
            int factor = 1;
            
            for(int j = 1; j * j <= i/2;j++){
                
                if((i % j) == 0){
                    factor += 1;
                }
            }
            if(factor == 2){
                sumofprime += i;
            }            
        }
        System.out.println(sumofprime);
    }
    public static void main(String[] args){
        prime(2000000);
    }
}
/* 

public class Primenumber{

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    static long sumOfPrimes(int limit) {
        long sum = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 2000000;
        long sum = sumOfPrimes(number);
        System.out.println("Sum of prime numbers up to " + number + ": " + sum);
    }
}
*/

/** 

public class Primenumber {
    
    static void prime(int number){
        
        if(number)
    }
    
    public static void main(String[] args){
        prime(2000000);
    }
}
**/





