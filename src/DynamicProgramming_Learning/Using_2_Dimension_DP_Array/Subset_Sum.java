package DynamicProgramming_Learning.Using_2_Dimension_DP_Array;

public class Subset_Sum {

    /**
     * subset sum using Bottom UP approach and 2Dimensional array
     */
    public static boolean isSubsetSum(int  set[], int n, int targetSum){
        //The value DP[i][j] will be true if there is  subset of set with sum equal to sum
        boolean[][] DP = new boolean[targetSum+1][n+1]; //By default there value initially is false as in java

        //Base cases :
        //if sum is not 0 and set is empty, then answer if false (first column)
        for(int i=0;i<=targetSum; i++){
            DP[i][0]=false;
        }

        //If sum is 0, then answer is true. (first row) : Important do row filling in second, as now it will be assigned true
        //else it would have assigned false in DP[0][0], as there it should be true only
        for(int i=0;i<=n;i++){
            DP[0][i]=true;
        }

        //Fill the DP table in bottom up manner
        for(int sum=1; sum<=targetSum; sum++){
            for(int j=1; j<=set.length; j++){
                DP[sum][j]= DP[sum][j-1]; //let's take it's previous value first

                //Pick only those values from subset which after being used don't give us negative.
                //Means the subset value should be less than currentSun sum
                if(sum >= set[j-1]){ //here j-1 in set because index starting from 0 in set, here j is starting from 1
                    //if less than only include or take that set value
                    DP[sum][j] = DP[sum][j] || DP[sum-set[j-1]][j-1]; //100*** : Here very important, here we have taken DP[][j-1]
                    //so that we make sure we don't use same set element taken just now in future, if you see this carefully
                    //in image shared here, and try to write code yourself by understanding you can come to this
                    //DP[sum-set[j-1][] => this just denotes, take help from previous sub-problem and if there is true then
                    //or with current DP value and just get the answer
                }
                else{
                    //if the subset sum is greater than our currentSum,, then just return what answer you've
                    //got till now in current DP[sum] in it's previous set until now,
                    DP[sum][j]= DP[sum][j-1]; //remember we aer taking in current DP[sum] only, and not previous sum.
                }

            }
        }

        //printing to test
//        for( int i=0;i<=targetSum;i++){
//            for(int j=0;j<=set.length;j++){
//                System.out.print(DP[i][j] + " ");
//            }
//            System.out.println();
//        }

        //at the end our answer is stored in DP[sum][n]
        return DP[targetSum][n];
    }

    public static void main(String[] args) {

        int[] set = {3,4,5,2};
        int targetSum=6;

        System.out.println(isSubsetSum(set, set.length, targetSum));

    }
}
