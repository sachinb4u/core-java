package com.sachin.numbers;

/**
 * Created by sbhosale on 1/2/14.
 */
public class Fibonacci {

    public static void main (String[] args){
        for(int i = 1; i<= 10; i++){
            System.out.println(fibonacci(i));
        }
    }

    private static int fibonacci(int num){
       if(num == 1 || num == 0){
           return   num;
       }

       return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
