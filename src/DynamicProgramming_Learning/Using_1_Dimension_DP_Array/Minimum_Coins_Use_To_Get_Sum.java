package DynamicProgramming_Learning.Using_1_Dimension_DP_Array;

import java.util.Arrays;

public class Minimum_Coins_Use_To_Get_Sum {

    //Problem statement and initial approach is explained in DPReadme.md file check there first
    //We are going to use bottom up DP approach and Use 1-Dimensional DP Array only to store sub-problems answers which
    //will be later used to solve larger problems
    //Here we have taken that we have infinite number of coins of certain types.
    public static int minCoins(int[] coins, int targetSum){
        //first let's create 1-Dimensional DP array for storing sub-problems answers
        int DP[] = new int[100001]; //Value automatically assigned to 0 in java,


        //Let's initialize the DP array with Max Value as initially we are taking infinite ways to get sum, and later we will
        //minimize it
        Arrays.fill(DP, Integer.MAX_VALUE);

        //Base Case :
        DP[0]=0; //to get 0 rs, we need no coin, hence 0.


        //We will now find minimum coin required for each sum(i) or DP[i], if we somehow can't get coins to that sum,
        //then we will take it as infinite, as we have already initialized above (i.e. Integer.MAX_VALUE).
        for( int sum = 1; sum<=targetSum ; sum++){
            DP[sum]=Integer.MAX_VALUE; //No matter we can assign here also, just to be sure

            //Now let's get use each coins one by one from coins array, and if picking that coin, our sum is not going
            //negative then only we will pick that coin, we don't want larger coin then sum required,
            //example to get sum of 10 rs, we don't want to pick 20 rs coin to get sum.
            for(int c = 0; c<coins.length; c++){

                //Here we are checking we don't want coins that which we are going to pick to be greater than sum so
                if(sum-coins[c] >= 0){
                    int previousDPValueOrSubProblem = DP[sum-coins[c]];
                    //this is previous value which we have stored in our DP, so if we are using this coin then
                    //ask the previous sum (sum-coins[c]) ki what value you have, and are you small, if not then
                    //we will check next coin, but keep updating the value in DP[sum], until we check all coins list and
                    //at end we can use min one only updated
                    //so
                    DP[sum]=Math.min(DP[sum], previousDPValueOrSubProblem+1); //Here +1 only in previousDP value as 1 step to use this
                    //current coin.
                    //Rest DP[sum], is getting updated everytime we chose coin, and it is already being +1 with it, so don't have to
                    //add +1 to it again.
                }
            }
        }
        return DP[targetSum];
    }

    public static void main(String[] args) {

        int[] coins = {1,2,5,10,20,50,100};
        int targetSum=140;
        System.out.println(minCoins(coins, targetSum));

    }
}
