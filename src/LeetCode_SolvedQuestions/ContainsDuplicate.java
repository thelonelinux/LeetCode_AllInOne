package LeetCode_SolvedQuestions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * My This Solution Beats 99.51%of users with Java
     * YOu can check in discussion/Submission section of this problem, of how it can be done without use of set
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){

            if(!set.add(nums[i])) {
                //ok, added as first new element
                return true;
//            }else{
//                //this element is already present
//
//            }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1};

        System.out.println(containsDuplicate(arr));

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
    }
}
