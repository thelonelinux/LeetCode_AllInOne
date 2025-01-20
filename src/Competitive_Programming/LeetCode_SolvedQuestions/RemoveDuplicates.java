package LeetCode_SolvedQuestions;

public class RemoveDuplicates {

    /**
     * My this solutions is best one and it Beats 99.25%of users with Java for time complexity
     * I did it in O(1) space and O(n) time complexity
     */
    public static int removeDuplicates(int[] nums) {

        //Update Nums[] array also
        //Along with return number of distinct elements
        //In O(n) time and O(1) space
        if(nums.length==1){
            return 1;
        }
        int prevNum=nums[0];

        int firstSafeIndexToStoreDistinct=1;
        int prevValue=nums[0];
        int distinctCount=1;

        for(int i=1;i<nums.length;i++){
            if(prevValue==nums[i]){

                continue;
            }
            else{
                //they are different values hence put in safe index
                prevValue=nums[i];
                distinctCount++;
                nums[firstSafeIndexToStoreDistinct]=nums[i];
                firstSafeIndexToStoreDistinct++;
            }
        }
        return distinctCount;

    }

    public static void main(String[] args) {

        int[] arr={0,1,1,2,2,3,4,4};
        System.out.println(removeDuplicates(arr));

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
