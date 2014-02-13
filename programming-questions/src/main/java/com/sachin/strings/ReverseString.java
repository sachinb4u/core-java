package com.sachin.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 * 18) Write a program in Java to reverse any String without using StringBuffer?
 * 
 * @author sbhosale
 *
 */
public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseString("HelloWorld"));
		System.out.println(reverseStringWithoutNewArray("AbCdEfGh"));
	}

	
	private static String reverseString(String str){
		char[] charArr = str.toCharArray();
		
		char[] reverseArray = new char[charArr.length];
		
		for(int i = charArr.length -1, j = 0 ; i >= 0 ; i--, j++){
			reverseArray[j] = charArr[i];
		}
		
		return String.copyValueOf(reverseArray);
	}
	
	/**
	 * Reverse the string array without creating new array .
	 * 
	 * @param str
	 * @return
	 */
	public static String reverseStringWithoutNewArray(String str){
		char[] sourceArr = str.toCharArray();
		
		int mid = sourceArr.length / 2;
		
		for(int i=0, revCount = sourceArr.length-1; i< mid ; i++, revCount--){
			char tmp = sourceArr[i];
			sourceArr[i] = sourceArr[revCount];
			sourceArr[revCount] = tmp;
		}
		
		return String.copyValueOf(sourceArr);
	}
	
	public static class ReverseStringTest{
		
		@Test
		 public void testReverseStringWithoutNewArray(){
			String result1 = ReverseString.reverseStringWithoutNewArray("");
			Assert.assertEquals(result1, "");
			
			String result2 = ReverseString.reverseStringWithoutNewArray("sachin");
			Assert.assertEquals(result2, "nihcas1");
			
			String result3 = ReverseString.reverseStringWithoutNewArray("heLlo");
			Assert.assertEquals(result3, "olLeh");
		}
		
	}
}


