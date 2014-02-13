package com.sachin.arrays;

/**
 * Created by sbhosale on 12/30/13.
 *
 * 5) In an array 1-100 numbers are stored, one number is missing how do you find it?
 *
 *  Ans: sum(1-100) - sum(array elements) = missing number
 *
 */
public class MissingNumInArray {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,9,8,7,0,10};

        int arr_sum = 0;
        int index = -1;
        for(int i=0; i< arr.length; i++){
           if(arr[i]==0){
               index = i;
           }
           arr_sum += arr[i];
        }

        int sum_of_nums = (arr.length + 1) * arr.length /2;

        System.out.println("Missing number is " + " = " + (sum_of_nums - arr_sum) + " @ index = " + index);
    }
}
