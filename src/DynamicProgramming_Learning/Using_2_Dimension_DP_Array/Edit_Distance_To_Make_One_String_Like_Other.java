package DynamicProgramming_Learning.Using_2_Dimension_DP_Array;

public class Edit_Distance_To_Make_One_String_Like_Other {

    /**
     * Finding min edit by using bottom-up 2DP array to store sub-problem
     */
    public static int editDistance(String str1, String str2, int m, int n){

        //Create a 2-Dimensional array to store results of sub-problem
        int[][] DP = new int[m+1][n+1];

        //Base case :
        for(int i =0;i<=m ; i++){
            //in each row of first column (or say first column) if other string is empty i.e. str2="" (empty string)
            //then we need to do that much edit of delete only so
            DP[i][0]=i; //If second string is empty, only option is to remove all characters of second string
        }

        for(int j=0;j<=m;j++){
            //in each column of first row (or say first row), if other str1 is empty string
            //then we need to do that much edit of add only so
            DP[0][j]=j; //If first string is empty, only option is to insert all characters of second string
        }

        //Fill DP in bottom-up manner.
        for(int i = 1; i<=m; i++){//taken str1 at row and str2 at column
            for(int j = 1; j<=n; j++){

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    //If the current characters are same, ignoer this current character and just update previous diagonal value
                    //it's like we are ignoring current same character string, as here we need no edits
                    DP[i][j] = DP[i-1][j-1];
                }
                else{
                    //if the current character is different, conisider all possibilites and find the minimum,(min step to 1)
                    DP[i][j] = Math.min(DP[i][j-1], Math.min(DP[i-1][j], DP[i-1][j-1]) ) + 1;
                    //where DP[i][j-1] denotes Insertion in str1
                    //DP[i-1[j] denotes Removing of element from str2
                    //DP[i-1][j-1] denotes Replacing of element
                    //Rest you can see in readme or image to understand more betterly
                }
            }

        }

        //our answer is now stored in last row column of DP[][]
        return DP[m][n];
    }


    public static void main(String[] args) {
        String str1="sunday";
        String str2="saturday";

        System.out.println(editDistance(str1, str2, str1.length(), str2.length()));
    }
}
