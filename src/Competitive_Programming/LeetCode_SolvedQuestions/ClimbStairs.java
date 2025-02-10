package LeetCode_SolvedQuestions;

public class ClimbStairs {
    /**
     * Accepted
     * Editorial
     * Solution
     * Runtime
     * Details
     * -ms
     * Beats 100.00%of users with Java
     * Memory
     * Details
     * 39.20mb
     * Beats 67.43%of users with Java
     */

    public static int climbStairs(int n) {

        int secondLast=1;
        int last=2;
        int current=0;

        // if(n==0){ return 0;}
        if(n==1){return 1;}
        if (n==2){return 2;}

        for(int i=3;i<=n;i++){
            current=last+secondLast;
            secondLast=last;
            last=current;
        }

        return  last;
    }

    public static void main(String[] args) {

        System.out.println(climbStairs(4));

    }
}
