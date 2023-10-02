package DynamicProgramming_Learning.Using_1_Dimension_DP_Array;

import java.util.Scanner;

public class Fibonnaci_Series {

    //Top down approach
    public static int fib(int n){
        //this is our linear DP array which will store previous sub-problem answers, which can be used by larger problems
        //to find the answers
        int DP[]= new int[100001];  //they are automatically assigned value as 0 here

        //Base Case :
        //DP[0]=0 and DP[1]=1
        DP[1]=1;

        //Now let's find for larger sub-problems using this base case sub-problems, and keep storing answers in DP array
        for(int i=2; i<=n; i++){
            DP[i]=DP[i-1]+DP[i-2];
        }

        return DP[n];
    }



    //Also this we can do in top down approach but saving some space by not making DP[] array
    //Because somehow we see that we need last two updated values only as our sub-problem to just next problem
    //so we can do in this way, space optimized bottom-up approach
    public static int fib2(int n){
        //Base case : As we are not anymore storing our data in DP array, so just we can return this directly
        if(n==0 || n==1){
            return n;
        }

        int a=0; //here a and b will be our just previous sub-problem for larger problem c
        int b=1;
        int c = 0; //Just initializing, it's main value will be updated below in loop, also this is our main problem, larger
        //problem

        for(int i=2;i<=n;i++){
            //Update previous a and b after updating c.
            c=a+b;
            a=b;
            b=c;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
