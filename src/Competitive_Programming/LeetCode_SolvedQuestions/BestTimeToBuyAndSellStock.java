package LeetCode_SolvedQuestions;

public class BestTimeToBuyAndSellStock {

    /**
     * If you write this in notebook and think how to solve it, it can be easily solved
     * Example
     * 7            1                    5           3                           6                   4
     * minBuy      newMinBuy(Ok)     maxSell        maxSell(Not so ignore)      newMaxSell(Ok)      maxSell(No, so ignore)
     *
     * Other edge cases was when again at end we got minValue Possible then
     * 7    2   5   3   6   4   15  1
     *                              Here we are getting 1, but if we chose 1 as min then going forward we are out of values in array.
     *                              so we are storing our old profits, and hence we can return that only
     *                              even if we have say 17 after 1 then we can say maxSell=17 and hence return 16 as result.
     *                              if we have 3 then 2 will be profit, but we already have better profit so it would be ignored
     */

    public static int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }

        int minimumBuy=prices[0]; //Let's store the first value as minBuy
        int maxSell=Integer.MIN_VALUE; int newMaxSell=Integer.MIN_VALUE;

        int maxProfit=0; int profit=0;

        for(int i=1;i<prices.length;i++){

            if(prices[i]>minimumBuy){
                newMaxSell=prices[i];
                if(newMaxSell>maxSell){
                    maxSell=newMaxSell;
                    profit=maxSell-minimumBuy;  //let's store this profit and keep updating it regularly if we found some new max profit
                    if(profit>maxProfit){
                        maxProfit=profit;
                    }
                }
            } else if (prices[i] < minimumBuy) { //Keep on updating minimum if you get minimum number
                minimumBuy=prices[i];//Once you updated new minBuy then now you have to look for newMaxSell again after this buy only forware
                maxSell=Integer.MIN_VALUE;//Start checking for max  after this so now min buy value again assign
            }

        }

        if (minimumBuy>=maxSell && profit==0){
            return 0;
        }

        return maxProfit;

    }
    public static void main(String[] args) {

        int[] arr={2,4,1};

        System.out.println(maxProfit(arr));

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
