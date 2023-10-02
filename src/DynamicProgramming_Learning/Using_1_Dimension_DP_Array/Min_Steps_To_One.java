package DynamicProgramming_Learning.Using_1_Dimension_DP_Array;

import java.util.Scanner;

public class Min_Steps_To_One {

    //DP bottom-up approach using 1-Dimension DP array to store sub-problem to help to find larger problem
    //Problem statement check in DPReadme.md file only
    public static int minSteps(int n){

        //Create DP[] Array
        int DP[] = new int[100001]; //Initial all the values are assigned to 0 only, size you can check in
        //problem limits of competitive programming and add size here.

        //Base Case :
        DP[1] = 0 ; //Initial case, as we need to 0 steps to reach 1. as our destination is 1, and we are already there

        for(int i =2; i<=n; i++){
            int op1, op2, op3;
            op1 = op2 = op3 = Integer.MAX_VALUE; //As we want min value to reach 1, so initializing them to global max initially

            //One of the way to reach 1. We can go by dividing the current number i by 3, if it is divisible by 3
            if(i%3==0){
                op1=DP[i/3]; //store is previous answer, to ask him if you can provide us min steps
            }

            //Other way to reach 1. We can go by dividing the current number i by 2, if it is divisible by 2
            if(i%2==0){
                op2=DP[i/2]; //Store its previous answer, to ask him if you can provide us min steps
            }

            //Third way is by subtracting 1 from current number (i). so after subtracting ask this number from DP what was answer
            //so this is inside DP array as there index, as we are storing previous values there only.
            op3=DP[i-1];

            //Now check which among this three operation, if we proceeds is going to give us min steps, for that we have
            //stored the previous solved value of DP[i/3], DP[i/2] and DP[i-1], and among this 3 whichever is min is our answer
            DP[i] = Math.min(op1, Math.min(op2, op3)) + 1 ; //We are adding plus 1, because current step plus previous sub-problem steps total

        }

//        for (int i=0;i<20;i++){ //This was just for testing, to see if DP was populated properly
//            System.out.print(i + "=>"+DP[i] + " | ");
//        }


        return DP[n]; //so this is our larger problem, just return the value
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(minSteps(n));

    }
}
