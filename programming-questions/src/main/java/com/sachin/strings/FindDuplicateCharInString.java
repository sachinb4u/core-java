/**
 * 
 */
package com.sachin.strings;

import java.util.Arrays;

/**
 * Design an algorithm and write code to remove the duplicate characters in a
 * string without using any additional buffer. NOTE: One or two additional
 * variables are fine. An extra copy of the array is not. FOLLOW UP Write the
 * test cases for this method.
 * 
 * @author sbhosale
 * 
 */
public class FindDuplicateCharInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abcd" + " After function() " + Arrays.toString(removeDuplicates("abcd".toCharArray())));
		System.out.println("aaaa" + " After function() " + Arrays.toString(removeDuplicates("aaaa".toCharArray())));
		System.out.println("aaabbb" + " After function() " + Arrays.toString(removeDuplicates("aaabbb".toCharArray())));
	}

	void findDuplicateInString(char[] str) {

	}

	public static char[] removeDuplicates(char[] str) {
		if (str == null)
			return str;
		int len = str.length;
		if (len < 2)
			return str;

		int tail = 0;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
		return str;
	}

}
