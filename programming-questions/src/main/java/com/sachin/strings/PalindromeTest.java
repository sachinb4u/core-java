package com.sachin.strings;

/**
 * Created with IntelliJ IDEA.
 * User: Sachin Bhosale
 * Date: 30/11/13
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 *
 * Write a code to check if string is palindrome.
 *
 */
public class PalindromeTest {

    public static void main(String[] args){

        System.out.println(checkPalindromeWithCharArray("123521"));
    }

    public static boolean checkPalindromeWithStringBuilder(String str){
        String rev = new StringBuilder(str).reverse().toString();
        return rev.equals(str) ? true : false;
    }

    public static boolean checkPalindromeWithCharArray(String str){

        if (str == null || "".equals(str.trim()))
            return false;

        char[] chArr = str.toCharArray();

        int length = chArr.length;

        for (int i=0, j = length-1; i < Math.abs(length/2); i++, j--){
            char first = chArr[i];
            char last = chArr[j];
            System.out.println(" -> " + first + " vs " + last + " <- ");
            if(first != last){
               return false;
            }
        }

        return true;
    }
}
