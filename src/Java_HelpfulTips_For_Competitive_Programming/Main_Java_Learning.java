package Java_HelpfulTips_For_Competitive_Programming;


/**
 * This below imports are always must  when you are writing CP code
 * As this will import almost all required tools, functions, class, collections, etc.
 */

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main_Java_Learning {

    public static void main(String[] args) {

        /**
         * Learning about Arrays.
         * Some Fast Easy Come Tools or ReadyMade functins useful diving problem solving in Competitive Programming
         */

        /** 1. Sorting an array of Integers (This internally used QuickSort, But in interview you will be ask to build quicksort Algo */
        int[] arr= {5,7,8,2,1,3};
        Arrays.sort(arr);

        /** 2. This is built in binary search for sorted arrays. This will work only when array is sorted */
        int[] arr2 = {3,4,5,6,7,8,9};
        Arrays.binarySearch(arr2, 5); //this will return the index of key, if not found then it will return -1;

    }



}
