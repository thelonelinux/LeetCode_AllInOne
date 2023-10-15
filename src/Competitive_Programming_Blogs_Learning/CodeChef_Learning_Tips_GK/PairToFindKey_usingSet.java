package Competitive_Programming_Blogs_Learning.CodeChef_Learning_Tips_GK;

import java.util.HashSet;
import java.util.Set;

public class PairToFindKey_usingSet {

    public static void main(String[] args) {
           int[] arr = {10,15,23,14,2,15} ; //Pairs are (23,10) (2, 15) and (15,2)
           int k=13;  //key

             Set<Integer> set = new HashSet<>();
             int count =0;
             for(int i = 0; i<arr.length; i++){
               if(set.contains(arr[i]+k)) {
                   count++;
               }
               else if (set.contains(arr[i]-k)){
                 count++;
               }
               set.add((arr[i]));
             }
             System.out.println(count);
    }
}
