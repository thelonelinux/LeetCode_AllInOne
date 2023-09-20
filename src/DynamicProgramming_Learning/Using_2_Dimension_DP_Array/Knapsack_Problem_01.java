package DynamicProgramming_Learning.Using_2_Dimension_DP_Array;

public class Knapsack_Problem_01 {

    //Solving 0/1 knapsack problem using 2 dimension DP array in bottom up manner,
    public static int knapSack(int[] itemWeight, int[] itemValue, int totalItems, int targetCapacity){

        int[][] DP = new int[targetCapacity+1][totalItems+1];

        // Base Case :
        //1. If Knapsack capacity (TargetCapacity) is 0, then we can't put any value in it. hence
        for(int takenItem=0; takenItem<=totalItems; takenItem++){
                DP[0][takenItem] = 0 ; //here DP[0][] => zero denotes knapsack of capacity = 0;
        }
        //2. If empty item set is given, then we will have no item to put in our knapsack, so max weight = 0 only.
        for(int currentCapacity = 0 ; currentCapacity <= targetCapacity; currentCapacity++){
            DP[currentCapacity][0] = 0 ; //here DP[][0] => zero denotes there are zero items we have
        }

        //Main Case : Let's start building our DP in bottom up manner, like first starting from smaller problem and going to targetProblem
        // We will take smaller currentTarget and taking items from item list one by one, or say jth item at a time and try to get
        //max possible value in our knapsack.
        //Also remember as Repetitions of items is not allowed, so once you pick the current item, don't just stay there but go one set item back
        //means like excluding currentItem, from previous sub-problem.
        for(int currentCapacity = 1 ; currentCapacity <= targetCapacity; currentCapacity++) {
            for (int takenItem = 1; takenItem <= totalItems; takenItem++) {
                //Now it is not possible to pick item whose weight at any time is greater than our knapsack weight capacity (currentCapacity)
                //Hence pick only those items whose weight is less than currentCapacity
                if (currentCapacity >= itemWeight[takenItem-1]) { //As since index starts from 0, so takenItem-1 is done to get that item
                    //Now check what was previous value sub-problem once this item is picked with its value added, also from
                    //previous capacity exclude this current item.
                    //other we will pick what was our value until now in this current capacity only just one item previously
                    //So we will pick this two item, and get max value, hence code as
                    DP[currentCapacity][takenItem] = Math.max(DP[currentCapacity - itemWeight[takenItem-1]][takenItem - 1] + itemValue[takenItem-1], DP[currentCapacity][takenItem - 1]);
                    //Here this depicts {DP[currentCapacity-itemWeight[takenItem]]<[takenItem - 1]>} : (DP[.][takenItem-1] => takenItem-1 depicts not to include this item again from previous sub-problems 100***)
                    //Here this <DP[currentCapacity][takenItem-1]> completely depicts, just put what was previous value for currentTarget when this takenItem was not considered. what if that is max, so this way we find max value
                } else {
                    //In else condition, mostly when weight to taken item is coming greater than knapsack currentCapacity weight,
                    //So in this case just store the previous value we have calculated till now for currentCapacity and exclude current takenItem
                    //hence code as
                    DP[currentCapacity][takenItem] = DP[currentCapacity][takenItem - 1]; //(takenItem-1) => depicts, don't take this current item and just store previous calculated value here.

                }
            }
        }

        //Answer stored in DP[targetCapacity][totalItems]
        return DP[targetCapacity][totalItems];
    }

    public static void main(String[] args) {

        int[] itemWeight = {1,2,3};
        int[] itemValue = {10,15,40};
        int totalItems = itemValue.length;
        int targetCapacity = 6;

        System.out.println(knapSack(itemWeight, itemValue, totalItems, targetCapacity));

    }
}
