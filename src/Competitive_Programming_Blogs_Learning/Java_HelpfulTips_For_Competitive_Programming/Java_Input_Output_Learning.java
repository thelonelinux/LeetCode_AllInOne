package Competitive_Programming_Blogs_Learning.Java_HelpfulTips_For_Competitive_Programming;

import java.util.Scanner;

public class Java_Input_Output_Learning {

    public static void main(String[] args) {
    /**
        /**
         * Scanner as input for different data types

        Scanner sc= new Scanner(System.in); //Got imported from Java.util.Scanner

        System.out.println("Enter the string value. If you enter via space in same line, it will take as one string only including" +
                "spaces");
        String name = sc.nextLine();
        System.out.println("name of the string you entered is => "+ name);

        System.out.println("Enter a single character value, will may deflect if you enter string, as it will pick first char");
        char gender = sc.next().charAt(0);
        System.out.println("Char you entered is => "+ gender);

        System.out.println("Enter a integer value");
        int i = sc.nextInt();
        System.out.println("Integer value you entered is => "+ i);

        System.out.println("Enter the double value");
        double d = sc.nextDouble();
        System.out.println("Double value you entered is => "+ d);

        **/


        System.out.println("Part 2 of using Scanner");
        /**
         * Here we will check if we are unaware of how much int or string value is going to pass to us.
         * But we want to continue if any integer value is passed then do something with it.
         * in that case we use hasNext() function of scanner for integer value check
         * and hasNextLine() function for string
         */

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count =0 ;

        //check if we are getting integer value and do something with that
        System.out.println("Enter some integer value, as long as you enter integer value it will keep on running");
        System.out.println("To break the process, just enter some non integer value like char, space won't work to break");
        while (sc.hasNextInt()){
            int num=sc.nextInt();
            sum+=num;
            count++;
        }
        System.out.println("Sum = "+ sum);
    }
}
