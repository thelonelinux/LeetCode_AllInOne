import java.util.*;


public class Main {

    public static int strStr(String haystack, String needle) {

        if(haystack.equals(needle)){
            return 0;
        }
        int index=-1;

        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                int j=i+1;
                index=i;
                for(int a=1 ; a<needle.length();a++){
                    if(haystack.charAt(j++)==needle.charAt(a)){
                        if(a==needle.length()-1){
                            index=i;
                            return index;

                        }
                    }
                }
            }
        }
        return index;

    }

    public static void main(String[] args) {

        String haystack = "abc";
        String needle = "c";

        System.out.println(strStr(haystack, needle));

    }

}





