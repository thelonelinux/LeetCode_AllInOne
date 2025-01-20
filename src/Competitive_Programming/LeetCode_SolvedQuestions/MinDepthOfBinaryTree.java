package LeetCode_SolvedQuestions;

public class MinDepthOfBinaryTree {

    //* Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Runtime     * Details     * -ms
     * Beats 100.00%of users with Java
     * Memory     * Details     * 41.54mb
     * Beats 57.37%of users with Java
     */

    public int maxDepth(TreeNode root) {

        if(root == null ){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }


    public static void main(String[] args) {
        //to check this working you need to create binary tree. insert methods etc.
        //that you can check in DSALearning folder here, there it is implemented and tested
    }
}
