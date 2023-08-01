package DSA_Learning;

/**
 * In Binary Search Tree left of parent node should always be less and right should be greater.
 * We can max two child node of a parent node
 */

public class MyBasicBinarySearchTreeImplementation {

    //Some components of BinarySearchTree, we need this component to build BST
    //1. Node Class (Object), which we will add together to make Binary Search Tree
    public class Node{
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

    //2. Root Node where we will start putting our node
    Node root;


    /**
     *  Method 1 : Insert new node in Binary Search Tree
     */

    //Here we always have to pass the root in parameter, because in recursive
    //addition of newNode we are putting left or right node so
    public Node insert(Node root, int data){
        //Like linkedList we don't need here traversal, just pass the left or right, they will update
        //themselves in recursive call in deep down, whenever they find null.
        Node newNode=new Node(data, null, null );

        if(root==null){
            //Means we don't have any node ready as root, as it is null, so lets put this new node only as our root
            root=newNode;
        }

        //Now if root node is not null, then there is value there already so let's go deep down,
        //We can go in either left or right node.

        if(data<root.data){
            //Put new node in left side.
            //so if left node is null then it will add, else we  need to do recursive call
            root.left = insert(root.left , data); //What this is doing is, now our root is not null
            //so either we have to go to its left or right node depending upon val, if val is less than we want to go in left node
            //of root. so if in left root it is null, then in recursive deep call, it will check above in root(left)==null and there
            //it will assign the value newNode, but it is happening in left. so this way if it is not null then we go deep down recursively
            //and when node is null then add newNode there, that's all what this is about.
            //Also, whatever we have updated will be returned back and hence we are assigning to root.left and hence we got our left
            //populated
        }
        else if (data > root.data){
            root.right=insert(root.right , data); //It is like saying add new node in root.right and so on it goes recursively
        }

        return root;

    }

    /**
     * Method 2 : Traversals : Preorder Means (Parent or root on Pre side, before other)
     * Hence Root => Left => Right (Left => Right this order remains constant in all traversal, it's just root gets located A/to Pre/Post)
     */

    public void preOrder(Node root){
        //First print the root
        if(root!=null){
            System.out.println(root.data);
        }

        //Now go to left Node recursively
        preOrder(root.left); //If we are at end when


    }
}
