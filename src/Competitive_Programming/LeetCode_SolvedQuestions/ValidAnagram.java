package LeetCode_SolvedQuestions;

public class ValidAnagram {

    /**
     * This my solution is better than 96% of all users in time saving
     *
     */
    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        int[] arr= new int[28];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index=c-96;
            arr[index]++;
        }
/**
 * Using this way of loop can reduce time by 2 ms, initially it was 4 ms
 *         for(char c : s.toCharArray()) {
 *             alphabet[c - 'a']++;
 *         }
 */


        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            int index=c-96;
            if(arr[index]>0){
                arr[index]--;
            }else{
                return false;
            }
        }

        for(int i=1;i<arr.length;i++){
            if (arr[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cat", t = "rat";
        System.out.println(isAnagram(s,t));
    }
}
