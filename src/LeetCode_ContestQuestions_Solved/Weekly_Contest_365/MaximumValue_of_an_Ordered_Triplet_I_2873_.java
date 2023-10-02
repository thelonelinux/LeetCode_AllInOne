package LeetCode_ContestQuestions_Solved.Weekly_Contest_365;

public class MaximumValue_of_an_Ordered_Triplet_I_2873_ {

    public static long maximumTripletValue(int[] nums) {

        long currentMax=0;
        long globalMax=0;
        int n=nums.length;

        for(int i=0; i<n-2 ;i++){

            for(int j=i+1; j<n-1 ; j++){

                if(nums[i] > nums[j]){

                    for(int k=j+1; k<n; k++){
                      //  currentMax=(nums[i] - nums[j]) * nums[k]; //this was not working for below test case
                        //int[] arr2 = {1000000,1,1000000};

                        //however this code gave AC
                        currentMax=nums[i] - nums[j] ;
                        currentMax = currentMax * nums[k];

                        if(globalMax < currentMax){
                            globalMax = currentMax;
                        }
                    }
                }
            }
        }

        return globalMax;

    }

    //this one is part 2 of same contest, but constraints is now increased, array length can be upto 10^5, so we need to
    //either do in O(n^2) or O(nlogn) time complexity only
    //similar to rainwater trapping questions
    public static long maximumTripletValue2(int[] nums) {
        //we can build max array to reduce on loop less
        int[] maxArray= new int[nums.length];
        maxArray[0] = -1;
        maxArray[nums.length-1]= -1;
        int max = nums[nums.length-1];

        for(int i= nums.length-1 ; i>=1; i--){
            maxArray[i] = max;
            max = Math.max(max, nums[i]);
        }

        //we can also build max subtract array from starting
        int[] maxSubtractArray = new int[nums.length];
        maxSubtractArray[nums.length-1]= -1;
        int maxSubtract = nums[0];

        for(int i =0 ; i<nums.length-1 ; i++){
            maxSubtractArray[i]=maxSubtract;
            maxSubtract= Math.max(maxSubtract, nums[i+1]);
        }

        long currentMax=0;
        long globalMax=0;
        int n=nums.length;

        for(int i=1; i<n-1 ;i++){
            if(maxSubtractArray[i] > nums[i]){
                currentMax=maxSubtractArray[i] - nums[i] ;
                currentMax = currentMax * maxArray[i];
                if(globalMax < currentMax){
                    globalMax = currentMax;
                }
            }
        }

//        for(int i=0; i<n-2 ;i++){
//            for(int j=i+1; j<n-1 ; j++){
//                if(nums[i] > nums[j]){
//                    currentMax=nums[i] - nums[j] ;
//                    currentMax = currentMax * maxArray[j];
//                    if(globalMax < currentMax){
//                        globalMax = currentMax;
//                    }
//                }
//            }
//        }

        return globalMax;

    }

    public static void main(String[] args) {

        int[] arr = {12,6,1,2,7};
        int[] arr2 = {1000000,1,1000000};
        System.out.println(maximumTripletValue2(arr2));

    }
}
