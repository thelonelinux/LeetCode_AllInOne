package DSA_Learning.DSA_101_Search_Sort_Stack_Queue_etc;

public class BinarySearch_Without_Recursion {


    //binary search algo without using recursion,
    //using while loop
    public static void binarySearch(int[] arr, int first, int last, int key){

        int mid =(first + last)/2;

        while(first <= last){

            if(arr[mid]<key){
                first = mid + 1;
            }
            else if(arr[mid] == key){
                System.out.println(key +" : Found at index => " + mid);
                break;
            }
            else{
                last = mid - 1;
            }

            mid = (first + last)/2;

            if(first > last){
                System.out.println("Key not found");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2,5,7,8,9,12,15,27}; //binary search always works on sorted array only
        int key=12;
        int n=arr.length;
        binarySearch(arr, 0, n-1, 15);
        binarySearch(arr, 0, n-1, 10);
    }
}
