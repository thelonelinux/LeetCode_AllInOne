package Competitive_Programming_Blogs_Learning.Java_HelpfulTips_For_Competitive_Programming;


/**
 * This below imports are always must  when you are writing CP code
 * As this will import almost all required tools, functions, class, collections, etc.
 */

import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;

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


        /**
         * ArrayList Simple Working
         */
        List<Integer> list = new ArrayList<>();
        list.add(5); //Add 5 to the 0 index of list
        list.add(6); //Add 6 to the 1 index of list
        list.add(0,4); //add 4 to the 0 index of list, 5 will now become index 1 and 6 as index 2
        list.get(1); // return the value present at index 1
        list.set(1,100);// replace value 100 to index 1, it will replace old value
        list.remove(2); //it will delete value present at index 2
        list.size(); // it will return the number of values in arraylist


        /**
         * Playing with strings
         */
        String s1="hello"; //In a stringPool "hello" is created
        String s2="hello"; //When we assign same value in s2, then first it will check in string pool if we have such string
        //already present there or not, and hence if it is present there then it will point our heap string address to that
        //string pool location

        boolean b1=s1==s2;    //this checks the object, as hello is made in string pool hence both are pointing to that same string
        boolean b2=s1.equals(s2); //It checks the content
        System.out.println(b1);
        System.out.println(b2);

        String s3 = new String("hello"); //This will not be build in string pool, hence it is some new heap memory
        boolean b3 = s1==s3;  // Now since s1 is in string pool and s3 is not made in string pool, hence the object are not same
        boolean b4 = s1.equals(s3); //But the content of string is same, so this will be true
        System.out.println(b3);
        System.out.println(b4);

        //Also as string is immutable so better use stringBuilder to concat the string and later return as toString();\
        //If you want to concate string only then use + operator

        //Converting string to array of characters
        String s = "HelloWorld";
        char[] chars = s.toCharArray();


        /**
         * Use of Lambda Expression to iterate the collections
         */
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);
        list2.add(3);
        list2.forEach(i -> System.out.println(i)); //this is lambda expression to return the string
        list2.forEach(System.out::println); //this is also another form of Lambda expression


        /**
         * How to truncate float or double to some decimal value point
         */
        //import java.text.DecimalFormat
        double num = Math.sqrt(2); //1.4142135623730951 this will return upto 16 decimal places
        double num2 = Math.floor(num*100)/100; //for upto two decimal places// as it has two times 00, i.e, 100 divided so
        String stringPattern= new DecimalFormat("#.###").format(num); //this has 3 hatch so goes upto 3 decimal point
        System.out.println(num);// 1.4142135623730951
        System.out.println(num2); //1.41
        System.out.println(stringPattern); //1.414


        double d1=5;
        double d2= 6;
        System.out.printf("%.6f %n", d1/d2); //gives float value upto 6 decimal places //0.833333
        System.out.printf("%.10f %n", d1/d2); //gives float value upto 10 decimal places //0.8333333333


        /**
         * Building a staggered array, 2D array, but size of each array is not same
         */
        int[][] arr3 = new int[5][];
        for (int x=0; x<arr3.length;x++){
            arr3[x]=new int[x+1]; //size of first arr will be 1, size of second array will be 2 and so on upto 5
        }

        /** Arrays.Stream for fast printing the array. instead of using for loops etc */
        int[] arr4= {1,2,3,4,5,6,7,8,9};
        Arrays.stream(arr4).forEach(System.out::println); //but this will print in different line only, don't know how to do in one line


    }



}
