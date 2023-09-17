package DynamicProgramming_Learning;

public class LongestCommonSubsequence {

    /**
     * Solving Longest common subsequence DP problem using 2D DP array in bottom up manner
     * bottom Up Manner Means - Start building answers from below and store in DP and then come to the final answers using this sub-problems
     * or by taking help from smaller ones which answers we have already calculated and stored in DP array.
     */
    public static void lcs(String s1, String s2, int m, int n){
        //This is bottom up manner, which we understand better

        //first make the 2D DP Array
        int DP[][] = new int[m+1][n+1];

        /**
         * Following steps build DP[m+1][n+1] in bottom up manner, means starting from taking 1 string or 0 string at a time and getting answers.
         * Note : DP[i][j] contains length of LCS of String taken of size string1(0 to i-1 length) and string2(0 to j-1 length)
         */

        //BASE Case
        //This means when one of the string is empty string
        for(int i=0; i<=m ; i++){
            DP[i][0]=0;
        }
        for(int j=0; j<=n ; j++){
            DP[0][j]=0;
        }

        //Now let's start building our DP in bottom up manner taken that specific string at a time
        //S1 is in row wise in ith and s2 is in column wise in jth
        for(int i=1;i<=m;i++){
            for(int j=1; j<=n;j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    //if the current char match, then in current DP just get the answer from previous substring excluding both these current char and add 1 to it
                    //It's like getting from diagonally  previous value and adding 1 to it. if we take non diagonal previous value then we may also include duplicates char in our LCS.
                    //A best example is given in the string we have taken here, see in notes
                    DP[i][j]= DP[i-1][j-1] + 1;
                }
                else{
                    //if the string didn't match, then just take previous answers only from either row or column previous to it, whichever is maximum,
                    //As that will be our LCS for current strings taken
                    DP[i][j] = Math.max( DP[i-1][j] , DP[i][j-1]);
                }
            }
        }
        //whatever is last populated in our DP[m+1][n+1] is our final length of LCS
        //return DP[m][n];

        //----------- Printing the LCS String --------
        //Now we want to print this LCS
        // So we do in following way
        int index=DP[m][n];
        //Let's store our LCS string in char array
        char[] lcs = new char[index + 1];
        lcs[index] = '\u0000'; //set the terminating character (however in java language we don't need anything like terminating the char, usually used in c/c++

        //Now start iterating the DP array from the right-most-bottom-most corner (end of DP arrau) and
        //one by one store character in lcs array

        int i=m;
        int j=n;

        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                //If current character in s1 and s2 are same, then current character is part of LCS
                lcs[index - 1] = s1.charAt(i-1); //put current character in result

                //reduce values of i, j, so that we would go diagonally above or previous substrings
                i--;
                j--;

                //also reduce the index,
                index-- ; // as we have populated for the current index.
            }
            //if the characters are not same then find the larger of two and go in the direction of larger value
            //because ultimately we want larger LCS and not smaller LCS
            else if(DP[i-1][j] > DP[i][j-1]){
                i--;
            }
            else{ // when < less than here. equal to is taken care here only.//Need to do analysis when they are some in up and left side and how we
                //choose to do j-- only, and how it can be helpful
                j--;
            }
        }

        //Printing the sub-sequences
        //whatever is last populated in our DP[m+1][n+1] is our final length of LCS
        int lengthOfLCS = DP[m][n];
        System.out.print("S1 : " + s1 + "\nS2 : " + s2 + "\nLCS length is : "+ DP[m][n] + "\nLCS string is : ");
        for (int k=0;k<lengthOfLCS; k++){
            System.out.print(lcs[k]);
        }
        System.out.println();
    }




    public static void main(String[] args) {
        String s1="BCDAACD";
        String s2="ACDBAC";

        int m=s1.length();
        int n=s2.length();

        lcs(s1, s2, m, n);


        /**
         * Output
         * S1 : BCDAACD
         * S2 : ACDBAC
         * LCS length is : 4
         * LCS string is : CDAC
         */



    }


    public static int lcsTopDown(String s1, String s2, int m, int n, int[][] DP){
        //This is TopDown approach we are adding this just for you to look how it is done,
        //Not following this approach for now and we will check it out later
        //hence it is without comments

        if(m == 0 || n == 0){
            return 0;
        }
        if(DP[m][n] != 1){
            return DP[m][n];
        }

        if(s1.charAt(m-1)  == s2.charAt(n-1)){
            DP[m][n]=1+lcsTopDown(s1, s2, m-1, n-1, DP);
            return DP[m][n];
        }

        DP[m][n]=Math.max(lcsTopDown(s1, s2, m, n-1, DP), lcsTopDown(s1, s2, m-1, n, DP));
        return DP[m][n];
    }
}
