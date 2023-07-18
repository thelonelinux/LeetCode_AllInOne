package LeetCode_SolvedQuestions;

public class ValidPalindrome {

    /**
     *  Alphanumeric characters include letters and numbers.
     *  Runtime
     * 3ms
     * Beats 97.89%of users with Java
     */
    public static boolean isAlphaNumeric(char c){
        if(c>=97 && c<=122){
            return true;
        }
        if(c>=48 && c<=57){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {

        s=s.toLowerCase();

        //using two pointer from back and forward can optimize the code, as it can do in half of string length
        //a=>97 to z=>122
        //0=> 48 to 9=>57
        int i=0;
        int j=s.length()-1;
        while (i<j){

            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if (isAlphaNumeric(c1) && isAlphaNumeric(c2)) {
                //ok, you can compare it
                if (c1 != c2) {
                    return false;
                }
                i++;
                j--;
            }
            if (!isAlphaNumeric(c1)){
                i++;
            }

            if (!isAlphaNumeric(c2)) {
                j--;
            }


        }


        return true;

    }

    public static void main(String[] args) {

        //Input
        String s = "0P";
        //Output: true
        //Explanation: "amanaplanacanalpanama" is a palindrome.
        System.out.println(isPalindrome(s));

    }
}
