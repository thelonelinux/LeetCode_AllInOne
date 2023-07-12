public class LongestCommonPrefix {

    //There are however better solutions in Leetcode, check there and compare how that is optimized.
    //Use of stringBuilder is more space saving and good for appending rather than string concatenation
    public static  String longestCommonPrefix(String[] strs) {
        //Edge case 1 : when we have some empty string, then just return "";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0){
                return "";
            }
        }

        //Edge Case 2 : when we have single string only, then return that string only
        if(strs.length==1){
            return strs[0];
        }

        //Edge Case 3 : For all rest cases.
        //Step 1 : Find the string with min possible length.
        //Step 2 : With this string, check in all string one by one and then add if other all strings also contain the prefix char
        //If not then break the loop there and return the string

        int minLength=Integer.MAX_VALUE;
        int length=Integer.MAX_VALUE;
        String minLengthSubstring="";
        for(int i=0;i<strs.length;i++){
            length=strs[i].length();
            if(length<minLength){
                minLength=length;
                minLengthSubstring=strs[i];
            }
        }
        System.out.println(minLengthSubstring);

        //Now use this minLengthSubstring to check if present in other strings or not
        String ans="";
        for(int i=0;i<minLengthSubstring.length();i++){
            char c=minLengthSubstring.charAt(i);

            for (int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)==c){
                    //OK in this string
                    ans=minLengthSubstring.substring(0,i+1);
                }
                else {
                    return minLengthSubstring.substring(0,i);
                }

            }
        }

        return ans;


    }
    public static void main(String[] args) {
        //String[] strs= {"aa","aa"};
        // String[] strs={"c","acc","ccc"};
        String[] strs={"ab", "a"};

        System.out.println(longestCommonPrefix(strs));

    }
}
