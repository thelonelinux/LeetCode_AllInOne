package DSA_Learning.DSA_101_Search_Sort_Stack_Queue_Recursion_etc;

public class HeapSort {


    /**
     * Before going for heapSort, first let's understand heapify a array,
     * here will be building max heap out of array, (We can also do min heap, but here we are doing max heap)
     * In max heap, our main purpose is to bring max element in root node, and child node should be less than parent's node
     */

    /**
     * Simply approach is we will be given array, it's size n, and index i which is index of sub-tree whose heapify we have to do
     * So this parent node (i = arr[i]) will have two child i.e. (2*i+1 and 2*i+2) which is index of child nodes.
     * Now from this three index we have to find the largest value, swap the largest value at parent node if it is find in child node.
     * and assign it's index as largest. so that this child can be send later to heapify again recursively, as this sub-tree is affected.
     * so in this way our max heap will be build for that sub-tree (i)
     *
     * to build heap for whole array, we have to iterate for whole arr from i=n/2-1 to 0, (because if array size is 10, then n/2-1=4, i.e. 4th index of child in it
     * rest of the above index array won't have child, so we start from bottom up manner.
     * and in any index if the child was swapped to parent or sub-tree node, then within it inner recursive heap is called because that sub-tree was affected.
     */


    /** Method to heapify a subtree rooted with node i which is an index in arr[], n is size of heap*/
    public static void heapify(int[] arr, int n, int i){
        // i => (IndexOfSubTree) it is the index of sub-tree given to us to heapify it

        int largest= i; //let's for now keep our parent node only as largest among the three (i.e. parent, left child and right child).
        //so let's store it's index as largest

        //Now check the child's value, first let's get there index
        int l = 2*i+1; //this is left child
        int r = 2*i+2; //this is right child

        //let's check if left child is largest //but also check if left child index is not going beyond the array size so
        if( l < n  &&  arr[l] > arr[largest]) {
            //if it is within the array size n and larger then previous selected largest index, i.e. parent node then
            //update the largest variable with l (left child index) //means left child is larger than atleast parent node, for right child we will check below
            //we are doing this comparison separately, because  we have to also check if the left, or right child index is not going beyond the arr size n
            largest = l;
        }

        //Also check if right child is largest than previous largest chosen index value // also check if right child index is not going beyond the array size
        if( r < n   &&  arr[r] > arr[largest]){
            //if it is within the array size n, and the right child is greater than previous largest stored index element then
            //update the largest index variable to r (right child index) // means right child is largest among three (left, right and parent
            largest = r;
        }


        //Now if root is not largest, i.e. is one of sub-child is the largest, then
        //then swap or put this child to parent node and parent node to child node,
        //so what happens by doing this, that child node's sub-tree is getting affected. so we have to do recursive heapify there also so
        if(largest != i){
            //swapping or putting the largest at parent node
            int temp = arr[i];
            arr[i]= arr[largest];
            arr[largest] = temp;

            //once the swapping is done, now we need to do recursive call of heapify in that affected child (child as subtree) or affected sub-tree
            heapify(arr, n , largest);
        }

    }


    /**
     * Main function for heap sort
     */
    public static void heapSort(int[] arr, int n){

        //Build heap array,
        //heap building is done from bottom up manner
        //also we have here chosen last element to be sent to be heapified as n/2-1, because if n=10 then chosen last element n/2-1 = 4, will be the last element
        //to have child node (at least one child node) so

        for( int i=n/2-1 ; i>=0 ; i--){
            heapify(arr, n, i); //so this will build max heap of our main array
        }


        //Now building max heap won't sort our main array, just max heap is build.
        //Now we want to store our max element in max heap such that our main array is sorted
        //So to do that we extract an element (root) from heap and then move that current root to end, and then call heapify from remaining array size of n-1
        //and so on everytime we extract an element and put in last we will reduce size of array by 1, so heapify will only happen in first n-i element,
        //and last i elements of main array we will be storing our array with larger element with each time reducing the size of array

        //One by one extracting an element from heap
        for(int i=n-1 ; i>=0; i--){

            // Move current root to end
            //swap(arr[0], arr[i])
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            //call max heapify on the reduced heap (reduced main array, as we have stored larger element in it's last indexes now to sort the array finally)
            heapify(arr, i, 0); //here you can see size is denoted by i, means size is being reduced after every iteration, as we are picking max and putting at end
            //and then reducing the size, and again getting the next larger element in reduced size array and then put it in last in reduced array and so on
            //in this way at end we will get sorted array
        }
    }


    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 1, 6, 8, 10};
        int lower = 0;
        int upper = arr.length - 1;
        int n = arr.length;

        System.out.print( "Unsorted list : ");
        for(int i =0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        heapSort(arr, n );

        System.out.print( "Sorted  list  : ");
        for(int i =0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
