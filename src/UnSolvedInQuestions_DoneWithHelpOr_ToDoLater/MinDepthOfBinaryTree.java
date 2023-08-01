package UnSolvedInQuestions_DoneWithHelpOr_ToDoLater;

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
    //*/

    public int minDepth(TreeNode root) {

        if(root==null){
            return 0;
        }else{
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        }



    }


    public static void main(String[] args) {

    }
}
