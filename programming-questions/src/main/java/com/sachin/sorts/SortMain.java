package com.sachin.sorts;

import java.util.Arrays;

/**
 * Created by sbhosale on 1/3/14.
 */
public class SortMain {


    public  static void main(String[] args){

        Integer[] intArr = new Integer[]{3,52,2,5,4,12,6,23};

        String[] strArr = new String[]{"sd", "ww", "ert", "rt", "abc"};

        //bubbleSort();
//        insertionSort(intArr,strArr);
    }


    private static void bubbleSort(Integer[] intArr, String[] strArr){
        System.out.println(Arrays.toString(BubbleSort.sort(intArr)));
        System.out.println(Arrays.toString(BubbleSort.sort(strArr)));
        System.out.println(Arrays.toString(BubbleSort.sort(new Integer[]{2, 4, 5, 6, 12, 23})));
    }

  
}
