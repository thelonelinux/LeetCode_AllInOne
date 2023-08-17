package DSA_Learning;

/**
 * In Binary Search Tree left of parent node should always be less and right should be greater.
 * We can max two child node of a parent node
 */

public class SimplyStaticBST {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(){
            this.data=0;
            this.left=null;
            this.right=null;
        }

        public Node(int data, Node right, Node left){
            this.data=data;
            this.right=right;
            this.left=left;
        }
    }

    /**     *  Method 1 : Insert new node in Binary Search Tree     */
    public  static Node insert(Node root, int data){

        if(root==null){
           return new Node(data, null, null );
        }

        if(data<root.data){
            root.left = insert(root.left , data);
        }
        else if (data > root.data){
            root.right=insert(root.right , data);
        }

        return root;

    }

    /**     * Method (Helper Method : Just to Create our Binary Search Tree when we pass an array of integer values     */
    public static Node constructBST(int[] keys){
        Node root = null;
        for(int key : keys){
            root=insert(root, key);
        }
        return root;
    }

    /**  * Method 2 : Traversals : InOrder Means (Parent or root on Pre side, before other),Hence [Left => Root =>  Right ] */
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    /** * Method 3 : Traversals : Preorder Means (Parent or root on Pre side, before other), Hence [Root => Left => Right] */
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /** Method 4 : Traversals : PostOrder Means (Parent or root on Pre side, before other) Hence [Left => Right => Root] */
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //Driver Code
    public static void main(String[] args) {
        int[] keys = {15,10,20,8,12,16,25}; //{5,3,4,2,1,9,10,7,6,8};
        Node root =  constructBST(keys);
        inOrder(root);
    }



}
