package LeetCode_SolvedQuestions;

public class MergeSortedArray {

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
     * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     *
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     *
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
     * where the first m elements denote the elements that should be merged, and the last n elements are
     */

    /**
     * Here I did in O(m+n) Time and no extra space, constant space only.
     * So. Beats 100.00%of users with Java in Time Complexity
     */

    //nums1 has a length of m + n,

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //as they are in increasing order already in each of array;
        //so if you have m=nums1.length, then no need to do anything as we have only that array as output already in sorted order
        //n==0 means not include other array any element then just return.
        if(m==nums1.length || n==0){
            return;
        }

        if (m==0){
            //means you don't want to include any element of first array
            //then just add n element of other array in first array
            for (int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }

        //move 0 to first places of the first array
        for(int i=0;i<m;i++){
            nums1[m+n-1-i]=nums1[m-1-i];
            nums1[m-1-i]=0;
        }


        //now start comparing and put in array first
        int index=0;
        int i=nums1.length-m;
        int j=0;
        while (i<nums1.length && j<n){
            if(nums1[i]<=nums2[j]){
                nums1[index++]=nums1[i];
                i++;
            }else{
                nums1[index++]=nums2[j];
                j++;
            }
        }

        if(j==n){
            //means all second array is done
            return;
        }else{
            //if some second array is still left then we need to put in remaining index of arr1
            for(int x=index;x<nums1.length;x++){
                nums1[x]=nums2[j++];
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6}; int n = 3;
        merge(nums1,  m, nums2,  n);

        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i] +" ");
        }
    }
}
