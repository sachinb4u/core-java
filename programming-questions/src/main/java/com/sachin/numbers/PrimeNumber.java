package com.sachin.numbers;

/**
 * Created by sbhosale on 1/3/14.
 */
public class PrimeNumber {


    public static void main(String[] args){

        System.out.println(" is 111 prime? "  + isPrime(111));
        System.out.println(" is 17 prime? "  + isPrime(17));
        System.out.println(" is 23 prime? "  + isPrime(23));


        System.out.println("Prime numbers up to 100 ");

        generatePrimeNumbers(100);
    }


    private static boolean isPrime(int num){

        if(num < 3){
            return true;
        }

        int limit = ((int)Math.sqrt(num)) + 1;
//        System.out.println("Limit = " + limit + " for Num = " + num);
        for(int divider = 2; divider < limit ; divider++){
            if(num%divider == 0){
                return false;
            }
        }

        return true;
    }

    private static void generatePrimeNumbers(int limit){
        for(int i= 1; i< limit;i++){
           if(isPrime(i)) {
               System.out.print(i + ", ");
           }
        }
    }
}
