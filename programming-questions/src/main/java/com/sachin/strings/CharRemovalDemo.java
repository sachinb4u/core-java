package com.sachin.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sachin Bhosale
 * Date: 30/11/13
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 *
 * 2) Write a method which will remove any given character from a String?
 *
 */
public class CharRemovalDemo {

    public static void main(String[] args) {

       String removed = removeChar("absfgfd", 'f');

       System.out.println(removed);

    }

    private static String removeChar(String source, char ch){

        char[] strArr = source.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char aStrArr : strArr) {
            if (ch != aStrArr) {
                builder.append(aStrArr);
            }
        }

       return builder.toString();
    }
}
