package DSA_Learning;

/**
 * Here we will see how to implement a linkedList
 */
public class MyLinkedList {

    /**
     * LinkedList as a Class should have Node Class data members in it. And also we want one Head Node to put our new node starting from head node
     * Remember Head Node is a node only. Inside we will attach more nodes just this.
     */

    public  Node head;  //Don't make this static, else it will become class property and will not be reinitialised when you create new linkedList
    //object. so.
    //This is starting node of our linkedList. It should be always pointing to first node address of our linkedList
    //So while traversing this head node, always use temporary node to traverse this linkedList

    public class Node{  //Node class will have two data members, namely Node and data, It's like node inside node.
        int data;
        Node next;
        public Node(){
            this.data=0;
            this.next=null;
        }

        public Node(int inputData, Node someNode){
            this.data=inputData;
            this.next=someNode;
        }
    }

    /**
     * Below are some methods in linked list
     */

    /**
     * Method 1 : Adding a new node in linkedList (of course we will add in the end only)
     */

    public  Node add(int data){
        //First create a Node while we will be adding in the head node
        Node newNode=new Node(data,null);

        //Now if head is null, means there is no Node in the linkedList yet. So in that case head is that node only, that node is only start
        //node and hence head node
        if(head==null){
            head=newNode;
        }
        else{
            /** Now if there is some node already in our head node then traverse our head node until the end and then add our new node there
                but use some other nodePointer to traverse our Head. And when our nodePointer reach at end, just add your new node to it.
                nodePointer will be actually pointing to that current node when traversing the head, so if we add new node, it will be adding new node
                to our head only ultimately
             */
            Node nodePointer = head;
            while (nodePointer.next!=null){
                nodePointer=nodePointer.next; //Let's go one node forward if we have not reached end of the linkedList/Head.
            }
            //Now when we come out of the above loop. Our nodePointer will be pointing to the last node (null) of our head/linkedList.
            //So there we will add our newNode
            nodePointer.next=newNode;

        }
        return head;

    }

    /**
     * Method 2 : Display our linkedList
     */
    public void show(){
        if(head==null){
            System.out.println("LinkedList/Head is empty");
        }else{
            Node nodePointer= head;
            while (nodePointer!=null){
                System.out.print(nodePointer.data +" => ");
                nodePointer=nodePointer.next; //let's move to next node now
            }
            System.out.println();
        }
    }


    /**
     * Main Method to test this customBuild Linked List
     */
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(); //This will initialize head node inside only
        linkedList.add(2); //this will add new node to our head node
        linkedList.add(4);
        linkedList.add(6);
        linkedList.show();


        MyLinkedList linkedList2=new MyLinkedList();
        linkedList2.add(8);
        linkedList2.add(10);
        linkedList2.add(12);
        linkedList2.show();
    }



}
