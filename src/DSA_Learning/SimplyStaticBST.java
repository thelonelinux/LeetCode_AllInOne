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

    /**  * Method 2 : Traversals : InOrder Means  [Left => Root =>  Right ] */
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    /** * Method 3 : Traversals : Preorder Means  [Root => Left => Right] */
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /** Method 4 : Traversals : PostOrder Means  [Left => Right => Root] */
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    /** Method 5 : Delete a node from Tree
     * Three cases=> 1. when node has no child, 2. when the node has one child, 3. when node has two child      */
    public static Node delete(Node root, int val){
        if(val > root.data){
           root.right=delete(root.right, val);
        }
        else if(val < root.data){
            root.left=delete(root.left, val);
        }
        else{
            if(root.left == null || root.right == null){
                Node temp = null;
                temp = root.left == null ? root.right: root.left;
                if(temp == null){
                    return null;
                }
                else{
                    return temp;
                }
            }
            else{
                Node successor = getSuccessor(root);
                root.data=successor.data;
                root.right=delete(root.right, successor.data);
                return root;
            }
        }
        return root;
    }

    //getSuccessor method     //Get the least from right sub tree of node that we are going to delete
    public static Node getSuccessor(Node root){
        if(root == null){
            return null;
        }
        //Let's check on right subtree and get the min value
        Node temp=root.right;
        while(temp.left != null){
            //Go in left of left until a null value is found, and get that node, as that will be our successor
            temp=temp.left;
        }
        return temp;
    }

    //Driver Code
    public static void main(String[] args) {
        int[] keys = {15,10,20,8,12,16,25}; //{5,3,4,2,1,9,10,7,6,8};
        Node root =  constructBST(keys);
        inOrder(root);
        delete(root, 12);
        System.out.println();
        inOrder(root);
    }



}
