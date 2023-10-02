package DynamicProgramming_Learning.Using_2_Dimension_DP_Array;

public class LongestIncreasingSubsequence {

    //Bottom up approach only using 1-Dimensional DP array to store the sub-problems answers and later will solve larger sub-problem
    public static void LIS(int[] arr, int n){

        int DP[] = new int[n];
        int max =0;

        //Initialize DP values for all indexes. Base CAse as  each number in array is 1 subsequence so
        for(int i =0;i<n;i++){
            DP[i]=1;
        }

        //Compute optimized DP values in bottom up manner
        for( int i = 1; i<n;i++){
            for( int j=0;j<i;j++){
                if(arr[i]>arr[j] && DP[i] < DP[j]+1){ //Brief explanation in readme.md file check there. no images required here, all understood here
                    DP[i] = DP[j] + 1;
                }
                /**
                 * Other way it could be like
                 * if(arr[i]>arr[j]){
                 *     DP[i] = Math.max(DP[i], DP[j] + 1);
                 *  }
                 */
            }
        }

        //Now once the DP is created and updated
        //Lets get the maximum value from DP
        //pick max value of all DP values
        for(int i=0 ;i<n;i++){
            if(max < DP [i]){
                max=DP[i];
            }
        }

        System.out.println("the length of longest increasing subsequence is "+ max);

        //to get that subsequence also we will implement this LIS using LCS approach and get it from there.

    }

    public static void main(String[] args) {

        int[] arr = {3, 10 , 2 , 1 ,20}; // here also we feel like taking all the PnC to get the answers so we went to DP and try to identify pattern for sub-problem
        int n = arr.length;
        LIS(arr, n);

    }
}
