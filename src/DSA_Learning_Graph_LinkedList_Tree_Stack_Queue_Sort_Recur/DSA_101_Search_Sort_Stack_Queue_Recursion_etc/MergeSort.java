package DSA_Learning_Graph_LinkedList_Tree_Stack_Queue_Sort_Recur.DSA_101_Search_Sort_Stack_Queue_Recursion_etc;

public class MergeSort {


    /**
     * In this algo, we are just doing following two things
     * 1. First divide the array to its fullest possible half of half until to goes down, There should be available two half until end. and then put in two separate arrays
     * 2. And then just merge this two half sub-arrays. Merge them in sorted order in main array (5**), so that's the whole approach here.
     */

    /**
     * So in our function mergeSort : we will try to divide our array (first half and last half recursively)
     * and then within this in same function we will call function Merge : which will merge this two divided sub-arrays in sorted order in main array.
     */


    //Function mergeSort
    public static void mergeSort(int[] arr, int lower, int upper){ //Here lower is 0 and upper is n-1 (n=arr.length)

        //we can only divide our array as long as lower is less than upper so
        if(lower < upper){

            //get the middle element
            int middle = lower + (upper-lower)/2;
            //this above is same as :: lower + (upper-lower)/2 = lower + upper/2 - lower/2 = lower/2 + upper/2 = (lower+upper)/2
            //we are doing in above way to eliminate or avoid overflow, just in case the value is large then addition of largest int value can go beyond the
            //max limit and hence give overflow error so.

            //Now divide the main array recursively, you can see from recursive approach, that we will be going in left side first
            //and first two sub arrays of min possible of left side we will get to merge

            mergeSort(arr, lower, middle);
            mergeSort(arr, middle + 1, upper);

            //Now once above are divided, then just merge this two above sub-arrays in sorted order and put in main array only.
            //use two arrays to store sub-arrays, but later put in main array in sorted order, taking care of boundary of indexes and starting point in main array
            merge(arr, lower, middle, upper); //middle is middle point of array in which it is to be divided, i.e. arr1[lower to middle] and arr2[middle+1 to upper]
        }
    }


    /**
     * Merges two sub-arrays of main arr
     * First sub-array is arr1[lower to middle]
     * Second sub-array is arr2[middle + 1 to upper]
     */
    public static void merge(int[] arr, int lower, int middle, int upper){



        /**first create the sub-arrays */
        //so there size will be like for 1st array : lower-middle, example : 4-lower(included) and 8-middle(included) and 12-upper(included)
        //so for arr1, middle - lower : 8-4 = 4, but including 4, there is total 5, so it will be => middle-upper+1;
        int n1=middle - lower + 1;
        int[] arr1 = new int[n1];  //right sub-array of divided main array

        //for arr2 simply we do : from 5 to 12, so that is (middle+1) to upper. as starting and ending index, so total count size array will be
        // n2 = upper - (middle + 1) + 1  => which is => upper - middle, so
        int n2 = upper-middle;
        int[] arr2 = new int[n2];  //left sub-array of divided main array


        /** Now once the array is created let's start putting values from main array to these sub-arrays */
        //first let's put in first array
        for(int i = 0 ; i < n1 ; i++){
            arr1[i]=arr[lower + i];
        }

        //and then populate the second array for second half
        for(int j=0; j<n2; j++){
            arr2[j] = arr[middle + 1 + j];
        }



        /** As now we have populated our sub-arrays, now use this array to add in our main array but this time in sorter order. */
        int indexOfFirstArray = 0;  //initialise the index of first array
        int indexOfSecondArray = 0; //initialise the index of second array
        int indexOfMainArray = lower; //As two sub-array which were divided first starts from lower index of main array so, so we have to put in main array form here only
        //from the two sub-array

        /** Now let's start putting from two sub-arrays to our main array in sorted manner */
        while (indexOfFirstArray < n1   &&   indexOfSecondArray < n2){

            //so until we have not totally exhaust any one of array, keep on checking each element in both and then whichever is smallest put that one in main array
            //and then increment the index of sub-arrays and main arrays accordingly
            if(arr1[indexOfFirstArray] <= arr2[indexOfSecondArray]){
                //as arr1's element is small so put that value in main array first
                arr[indexOfMainArray] = arr1[indexOfFirstArray];
                //after putting increment the index of first array, as first arrays data was taken and put in main array as it was small
                indexOfFirstArray++;
            }
            else{  //else put element of second array sub-array and increment its index
                arr[indexOfMainArray] = arr2[indexOfSecondArray];
                indexOfSecondArray++;
            }

            //After every iterations, either first or second's sub-array will get populated in main array so increment the index of main array
            indexOfMainArray++;
        }


        /** Now at some point it can be possible that one of the sub-arrays index reach end and others index or element is still left, so
         * int that case just iterate the other array completely and put in main array, they possibly will be sorted manner,
         * and if they are not in sorted manner, then they will be atleast more than the already putted value in main array
         * example like 1,2,3 and then 6,4,8, the remaining can may not be in sorted but the remaining ones are greater then putter on i.e. 1,2,3*/

        /** copy the remaining elements of arr1 to main array if there is any left */
        while(indexOfFirstArray < n1){
            arr[indexOfMainArray] = arr1[indexOfFirstArray];
            indexOfFirstArray++;
            indexOfMainArray++;
        }


        /** similary copy the remaining elements of arr2 to main array if there is any left */
        while(indexOfSecondArray < n2){
            arr[indexOfMainArray] = arr2[indexOfSecondArray];
            indexOfSecondArray++;
            indexOfMainArray++;
        }


        //Now we have completed merging the divided sub-arrays back to main array in sorted order. atleast for upto that index of other was not exhausted
        //so those reamining elements can be sorted in next sub-arrays population and at end we will get sorted main array.

    }
    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 1, 6, 8, 10};
        int lower = 0;
        int upper = arr.length - 1;

        System.out.print( "Unsorted list : ");
        for(int i =0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergeSort(arr, lower, upper );

        System.out.print( " Sorted list : ");
        for(int i =0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
