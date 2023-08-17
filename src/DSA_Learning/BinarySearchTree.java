package DSA_Learning;

/**
 * In Binary Search Tree left of parent node should always be less and right should be greater.
 * We can max two child node of a parent node
 */

public class BinarySearchTree {

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
        //Node newNode=new Node(data, null, null );

        if(root==null){
            //Means we don't have any node ready as root, as it is null, so lets put this new node only as our root
            return new Node(data, null, null );
            //root=newNode;
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
     * Method (Helper Method : Just to Create our Binary Search Tree when we pass an array of integer values
     */
    public Node constructBST(int[] keys){
        Node root = null;
        for(int key : keys){
            root=insert(root, key);
        }
        return root;
    }


    /**
     * Method 2 : Traversals : InOrder Means (Parent or root on Pre side, before other)
     * Hence [Left => Root =>  Right ] (Left => Right this order remains constant in all traversal, it's just root gets located A/to Pre/Post)
     */
    public void inOrder(Node root){
        if(root == null){
            return;//This works for two condition, first when root is null, next when we are going traversing say
            //in left and left node of inner recursion, whenever we reach at the node whose root.left is null
            //or whose parent has no left leaf then this gets return and go back to next step of Syso and print that
            //so you can see below this is how it keeps on going in. So this concept of return you understand now
            //5*** Understanding (Plus also you see that image in the notebook, of how you have explained yourself)
            //So for now this much only understand, rest deep diving recursion is required totally
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    /**
     * Method 3 : Traversals : Preorder Means (Parent or root on Pre side, before other)
     * Hence [Root => Left => Right] (Left => Right this order remains constant in all traversal, it's just root gets located A/to Pre/Post)
     */
    public void preOrder(Node root){
        if(root == null){
            return; //This works for two condition, first when root is null, next when we are going traversing say
            //in left and left node of inner recursion, whenever we reach at the node whose root.left is null
            //or whose parent has no left leaf then this gets return and go back
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    /**
     * Method 4 : Traversals : PostOrder Means (Parent or root on Pre side, before other)
     * Hence [Left => Right => Root] (Left => Right this order remains constant in all traversal, it's just root gets located A/to Pre/Post)
     */
    public void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    /**
     * Method 5 : Delete a node from Tree
     * Three cases=> 1. when node has no child, 2. when the node has one child, 3. when node has two child
     */
    public Node delete(Node  root, int val){
        //val is node you are going to delete
        //first let's search that val in our tree root. (we are not considering the case when that val is not present in our tree
        if(val > root.data){
            //go in right subtree and ask it to check in yourself recursively and get the result
            root.right=delete(root.right, val);
        }
        else if(val < root.data){
            //go in left subtree and ask it to check in yourself recursively and get the result
            root.left=delete(root.left, val);
        }
        else{ //Case when we found that val i.e. (if(val==root.data))

            //Case when the node has either zero or one node
            if(root.left == null || root.right == null){
                //create a temp node to be used for this case

                //initially put null value
                Node temp = null;
                //assign root's left or root's right to this temp node in case that node we are going to delete has one child
                temp = root.left == null ? root.right: root.left;
                //this is ternary operator, saying if left is null then put right or vice versa

                if(temp == null){ //means the child we are goign to delete has no child in it, so it is null
                    //and can't be assigned in above ternary operator and only has null value.
                    //so to delete this node, just return null instead of that node, then that node gets automatically deleted
                    return null;
                }
                else{
                    //case we have one child, then that child can be replaced for that deleted node at end
                    //hence just return the temp node where we have stored that child
                    return temp;
                }
            }
            //Case when the node has two child
            else{
                //Case when the node we are going to delete has two child in it
                //we can resolve this in two ways
                //1. Replace that node with max value of left sub tree or (Just go in right of right end to get that)
                //2. Replace that node with min value of right sub tree (Just go in left of left only to get that)
                //But also before replacing we need to store that left or right sub tree parent

                //So to do this task, better we create a new method separately
                //Step 1 : getSuccessor method =>  Get the min val node from right sub-tree of node that we are going to delete
                Node successor = getSuccessor(root);

                //Step 2 :
                //So now we got our successor node which will replace our node which we are going to delete
                //So this just means that why not we just change the value of node which we are going to delete with the
                //successor node's value, Hence
                root.data=successor.data; //So new value is assigned to our supposed to be deleted node and hence it is deleted
                //or seems to be deleted as we have changed it's value

                //Step 3:
                //So now we have updated our node, then we might want to delete that value present in right subtree of our node
                //that successors node value, as we have used in assigning to our suppose to be deleted node
                //so
                root.right=delete(root.right, successor.data); //so go in right sub tree and just delete it
                //when deleting this successor from right sub-tree then it will only have either one or no child, but never two child

                //Step 4:
                //Now just return the root, as we have updated everything, everywhere in right sub-tree also and in it's node also
                return root;

            }

        }
        return root;
    }

    //getSuccessor method
    //Get the least from right sub tree of node that we are going to delete
    public Node getSuccessor(Node root){
        if(root == null){
            return null; //this is very much not possible to get null in that root node for which we are tyring to get min
            //as we are here only because our node has two child and we want to get successor to replace our node
        }
        //Let's check on right subtree and get the min value
        Node temp=root.right;

        while(temp.left != null){
            //Go in left of left until a null value is found, and get that node, as that will be our successor
            temp=temp.left;
        }
        return temp;
    }


    /**
     * Method 6 : Height of a tree
     * This method will work for both Binary Tree and Binary Search Tree ( As it is irrespective of value stored in nodes)
     */
    public int findHeight(Node root){
        if(root == null){
            return 0; //Doing in a same recursion ways as you can see in inOrder Traversal
        }

        //Just go recursively inside of that left and right child and ask them to give there height + 1.
        //plus 1 gets accumulated and at end we will get overall height
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }

    /**
     * Method 7 : Depth of a tree (Same as height, but here you can also pass any random node instead of root node also
     * This method will work for both Binary Tree and Binary Search Tree ( As it is irrespective of value stored in nodes)
     */
    public int maxDepth(Node root){
        if(root == null){
            return 0; //Doing in a same recursion ways as you can see in inOrder Traversal
        }
        else{
            //Output the depth of each subtree separately recursively as you know from inorder Traversal how it works
            int leftDepth=maxDepth(root.left);
            int rightDepth=maxDepth(root.right);

            //Use the larger one of the above returned height value
            if(leftDepth > rightDepth){
                return (leftDepth+1);
            }else{
                return (rightDepth+1);
            }

        }


    }



    //Driver Code
    public static void main(String[] args) {
        //So you can do this in two ways to check root and etc, one is jsut create root node and use the methods
        BinarySearchTree bst = new BinarySearchTree();
        int[] keys = {15,10,20,8,12,16,25}; //{5,3,4,2,1,9,10,7,6,8};
        Node rootStandAlone =  bst.constructBST(keys);
        bst.inOrder(rootStandAlone);
        bst.delete(rootStandAlone, 12);
        System.out.println();
        bst.inOrder(rootStandAlone);
        System.out.println();
        System.out.println("Height of tree is => " + bst.findHeight(rootStandAlone));
        System.out.println("Depth of tree is => " + bst.maxDepth(rootStandAlone));

        //Other way is create the class object and use its root and methods and nodes.
        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.root=bst2.insert(bst2.root, 8);
        bst2.root=bst2.insert(bst2.root, 3);
        bst2.root=bst2.insert(bst2.root, 1);
        bst2.root=bst2.insert(bst2.root, 6);
        bst2.root=bst2.insert(bst2.root, 4);
        bst2.root=bst2.insert(bst2.root, 7);
        bst2.root=bst2.insert(bst2.root, 10);
        bst2.root=bst2.insert(bst2.root, 14);
        bst2.root=bst2.insert(bst2.root, 13);
        System.out.println();
        bst2.inOrder(bst2.root);
    }



}
