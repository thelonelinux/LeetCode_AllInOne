package DSA_Learning.DSA_101_Search_Sort_Stack_Queue_Recursion_etc;

public class QuickSort {


    /**
     * the Main Function in which we will call partition recursively and divide our main array using the pivot's sorted position
     * which we get from partition method, and then recursively call Main function (QuickSort) on these divided sub-arrays of main array again and so on
     */

    public static   void quickSort(int[] arr, int low, int high){
        //low and high are included index only, like low = 0 (starting index ;and high= N-1 (ending index)
        //we will do recursive call until l<R, as we know this from merge sort only

        if(low < high){

            //this pivot index is like middle element as we do in merge sort, but it totally depends on whether it is actually middle element or not
            //that depends on the pivot we chose, as this pi is pivot index after we place it in it's sorted position, smaller at left sub-array
            // larger elements at right sub-array,

            int pivotIndex = partition(arr, low, high);

            //now using this pivotIndex, we do same partition recursive call in it's left and right sub-array of main array
            quickSort(arr, low, pivotIndex-1); //on left sub-array of main array
            quickSort(arr, pivotIndex + 1, high); // on right sub-array of main array

        }

    }

    /**
     * Now let's implement partition method
     * this method will take pivot and try to put smaller elements at left and larger elements at right hand side of main array
     * at end we will put our pivot to it's sorted position and return the pivotIndex
     *
     * Partition : this function takes last element as pivot, placed the pivot element at its correct position in sorter array, and places all smaller
     * (smaller than pivot) to left of pivot and all greater elements to right of pivot)
     */

    public static int partition(int[] arr, int low, int high){
        //we chose pivot as last element, and hope it is some array which approximately try to dived the sub-array in two equal halves
        int pivot = arr[high];

        int i = low-1; //let's take -1 as index of smaller element, and then increase to 0 later in loop to replace or swap with max element of arr[j] with arr[i]
        //i will store the smaller element and j will store the larger element than pivot

        for(int j=low ; j<=high-1; j++){ //iteration upto high-1 and so as high index is we have taken as pivot
            //if current element is smaller than or equal to pivot, put it in left hand side by swapping
            //here we are trying to bring smaller elements at initial or left hand side
            if(arr[j] <= pivot){
                i++ ; //increment the index of smaller element
               // swap(arr[i], arr[j]);
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //At the end swap the pivot to its right position. and so on return it's index to be later recursive call on it's right and left sub-array
        //i+1 is just next larger element then left sub-array, so we can swap our pivot element, as it will be sorter position for our index. so
        //swap(arr[i+1], arr[high]); //swap function won't work as we have to also pass array to update the array to be swapped so
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return (i+1);
    }

    public static void swap(int i, int j){
        int temp=i;
        i=j;
        j=temp;
    }



    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 10, 6, 8, 7};
        int lower = 0;
        int upper = arr.length - 1;

        System.out.print( "Unsorted list : ");
        for(int i =0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort(arr, lower, upper );

        System.out.print( " Sorted list : ");
        for(int i =0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
