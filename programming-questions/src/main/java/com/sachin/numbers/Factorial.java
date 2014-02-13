package com.sachin.numbers;

/**
 * Created by sbhosale on 1/7/14.
 */
public class Factorial {

    public static void main(String[] args){

        for(int i=0 ; i < 20 ; i++){
             System.out.println("Factorial of " + i + " = " + factorial(i)) ;
        }
    }

    private static int factorial(int num){
        if(num == 0 || num ==1){
            return 1;
        }

        return num * factorial(num-1);
    }
}
