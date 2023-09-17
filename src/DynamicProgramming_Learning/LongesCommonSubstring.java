package DynamicProgramming_Learning;

public class LongesCommonSubstring {

    //Longest common substring using top down dp approach/ bit similar to longest common subsequence, but we want continous
    public static void LCSubStr(String str1, String str2, int m, int n){
        //Create 2 dimensional DP array to store the lengths of longest common suffixes of substrings.
        //Note : DP[i][j] contains length of longest common suffix of Str1(0 to i-1) and str2(0 to j-1).

        //the first row and first column entries in DP array have no logical meaning, they are use only for simplicity
        //Well they have meaning, it means taken other string as empty string, so the common substring length will always be 0
        int DP[][] = new int[m+1][n+1];

        //to store the lenght ofhte longest common substring lets create a variable, as we could remember the length, also we could remember the index
        int result = 0;
        int indexM=0;
        int indexN=0;

        //building our DP from bottom up, from smaller problems to larger problems
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){

                if(i ==0 || j==0){
                    DP[i][j]=0; //This is just the base case. we can add here also or separately in above somewhere, but adding here will save some space
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1)){
                    DP[i][j] = DP[i-1][j-1] + 1 ; //means we found next matching char, just increase from previous match if there was and add 1 to it
                    //and update in our DP

                    //Also lets update our result and index
                    if(result<DP[i][j]){
                        indexM = i;
                        indexN = j; //These indexes can be used later to get the substring// we need to update by checking if we got new longest value
                    }
                    result = Integer.max(result, DP[i][j]);



                }else{
                    //If char do not match
                    //we will come back to whole zero level, as it is not subsequence but substring, there should be continous match,
                    DP[i][j]=0; //unlike longest common subsequence
                }
            }
        }

        //return answer
        System.out.println("str1 : "+ str1 + "\nstr2 : "+ str2 + "\nLength of Longest Common Substring is : "+ result);


        //Printing the longest common subsequence
        int i=indexM;
        int j=indexN;
        String longestCommonSubstring = "";

        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                //If current character in s1 and s2 are same, then current character is part of LCS
                longestCommonSubstring+=str1.charAt(i-1) ;//put current character in result
                //reduce values of i, j, so that we would go diagonally above or previous substrings
                i--; j--;
            }
            else{ //if the characters are not same then, we come to end of our substring and just break the flow
                break;
            }
        }

        //Printing the longest common substring
        StringBuilder sb= new StringBuilder();
        sb.append(longestCommonSubstring);
        sb.reverse();
        System.out.println("Longest Common Substring is : "+ sb.toString());
        System.out.println();

    }

    public static void main(String[] args) {
        String str1 = "GeeksForGee";
        String str2 = "HGeeksQuiz";
        int m = str1.length();
        int n= str2.length();

        LCSubStr(str1, str2, m, n);
    }
}
