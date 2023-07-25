package UnSolvedInQuestions_DoneWithHelpOr_ToDoLater;

public class MajorityElement {

    /**
     * Follow-up: Could you solve the problem in linear time and in O(1) space?
     *
     * Moores Voting Alogrithm
     * https://www.youtube.com/watch?v=AoX3BPWNnoE&t=590s&ab_channel=takeUforward
     * Here in this video link, you can understand the concept and why this will work for all element
     * when majority means more than n/2
     *
     * Runtime
     * Details
     * 1ms
     * Beats 99.82%of users with Java
     * Memory
     * Details
     * 48.15mb
     * Beats 67.19%of users with Java
     */

    public static int majorityElement(int[] nums) {

        int count=0;
        int element=0;

        for(int num : nums){
            if (count==0){   element=num;            }

            if (num==element){  count+=1;   }
            else{  count-=1;  }
        }

        return element;
    }

    public static void main(String[] args) {


    }
}
