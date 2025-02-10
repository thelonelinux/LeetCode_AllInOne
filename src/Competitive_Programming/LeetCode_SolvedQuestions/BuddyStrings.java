package LeetCode_SolvedQuestions;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {

    /**
     * Runtime => 3ms
     * Beats 66.31%of users with Java
     * Still checking on my own if we can optimize it more-better, and then check in submissions to see what and how it was supposed to be
     * optimized
     */

    /**
     *  for (char c : s.toCharArray()) {
     * May be use of this way of traversing and reduce the time complexity, checking on it
     */

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()){ return false;}
        if(s.length()==0){ return true;}

        int delta=0; boolean atleastOneDuplicatePresent=false;
        Set<Character> set = new HashSet<>();
        int index1=0; int index2=0;

        for(int i=0;i<s.length();i++){
            if (s.charAt(i) != goal.charAt(i)){
                delta++;
                if (delta==1){ index1=i;}
                if (delta==2){index2=i;}
            }

            if(delta>2){return false;}
            if(atleastOneDuplicatePresent==false){//Just this one check can turn the code time optimization from 23% to 64% of java users
                //ofcourse it will save in going (logn) extra. Now it will never be O(nlogn), but only O(n) time complexity
                //Becasue once we found there is duplicate, no need to keep adding data in set. becuase if collision occurs in hashtable
                //then it will take O(logn) extra time.
                if(!set.add(s.charAt(i))){
                    atleastOneDuplicatePresent=true;
                }
            }

        }

        if (delta==1){ return false;}
        if (delta==0){
            if (atleastOneDuplicatePresent){return true;}
            else{return false;}
        }
        if(delta==2){
            if((s.charAt(index1)==goal.charAt(index2)) && (s.charAt(index2) == goal.charAt(index1))) {
                return true;
            }else{
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "aaaaaaabc", goal = "aaaaaaacb";
        System.out.println(buddyStrings(s,goal));

    }

    //Here it is more optimized code, learn from this
    public static boolean buddyStrings2(String s, String goal) {
        int n = s.length();
        if (n != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        }

        int first = -1;
        int second = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        return (second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first));
    }
}
