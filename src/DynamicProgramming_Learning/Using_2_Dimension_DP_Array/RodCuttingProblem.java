package DynamicProgramming_Learning.Using_2_Dimension_DP_Array;

public class RodCuttingProblem {

    //Solving efficient rod cutting problem using 2 Dimensional DP array and top down approach
    public static int cutRod(int[] prices, int targetLength){
        int[][] DP = new int[targetLength+1][prices.length+1];

        //Base Case
        //1. when we have no cur value given (empty set of cut array) => then we don't know it's prices, hence we take as 0 cut
        //and 0 value
        for(int currentLength =0 ; currentLength<=targetLength; currentLength++){
            DP[currentLength][0]=0; //Here DP[.][0], zero depicts we have no cut and prices array given, just empty set, so taken 0.
        }

        //2. When we have no rod to cut, then we can have 0 earning from given prices of cut value, so put 0
        for(int currentCut = 0; currentCut<=prices.length; currentCut++){
            DP[0][currentCut]=0; //Here DP[0][.], 0 zero depicts we have no rod to cut
        }

        //Main case (like in bounded knapsack code only
        for(int currentLength=1; currentLength<=targetLength; currentLength++){
            for(int currentCut = 1; currentCut<=prices.length; currentCut++){
                //Here also we can't cut more than our currentLength of rod left, so if they are less then include it
                // and take there prices and add with our previous max sub-problem
                // so check
                if( currentLength >= currentCut){
                    //ask the previous leftover sub-problem to give the answer if they are max, and can include current cut again,
                    //or check if just previously in same currentLength we have max there already or not, just compare this two
                    //value and get maximum store in our current DP problem
                    DP[currentLength][currentCut] = Math.max(
                            DP[currentLength-currentCut][currentCut] + prices[currentCut-1], //here prices index start from 0,
                            // so taken cut-1, as cut of length depicts for index 0
                            DP[currentLength][currentCut-1]);
                }
                else{
                    //just store the previous value we have calculated till now in same row excluding this currentCut as it is larger
                    DP[currentLength][currentCut]=DP[currentLength][currentCut-1];
                }
            }
        }

        //checking our DP array
        for(int i=0;i<=targetLength;i++){
            for(int j=0; j<= prices.length; j++){
                System.out.print(DP[i][j] + " ");
            }
            System.out.println();
        }

        //finally the answer will get stored in DP[targetLength][totalCuts]
        return DP[targetLength][prices.length];
    }

    public static void main(String[] args) {
        int[] prices = {1,3,4,5,7,9,10,11}; // index 0 => means cut of length 1 cost, index 1 => means cut of length 2 cost 3
        int targetLength = 8;

        System.out.println("ans is =>" + cutRod(prices, targetLength));
    }
}
