public class Prime {
    static boolean isprime(int number){
        boolean isprime = false;
        
            if(number == 2){
                isprime = true;
            }
            else if(number == 3){
                isprime = true;
            }else if(number == 5){
                isprime = true;
            }
            else if(((number % 5) == 0) || ((number % 3) == 0) || ((number % 2) == 0)){
                isprime = false;
            }else{
                int factor = 0;
                for(int i = 1; i <= number/2;i++){
                    if((number % i) == 0){
                        factor += 1;
                    }
                }
                if(factor == 2){
                    isprime = true;
                }
            }


        
        return isprime;
    }
    static void pt(int number){
        int sumofprime = 0;
        for(int i = 1; i <= number; i+=2){
            if((isprime(i))){
                sumofprime += i;
            }
        }
        System.out.println(sumofprime);
    }
    public static void main(String[] args){
        pt(2000000);
    }
}
