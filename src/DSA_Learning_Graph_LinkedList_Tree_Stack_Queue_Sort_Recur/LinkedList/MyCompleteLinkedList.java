package DSA_Learning_Graph_LinkedList_Tree_Stack_Queue_Sort_Recur.LinkedList;

/**
 * Here we will be adding all the methods usually possible in linkedList Custom Implementation
 * Method 1 : insert(int data)  //Insert new Node at the end of our linkedList
 * Method 2 : show()    //Print our linkedList
 * Method 3 : insertAtStart(int data)//Will insert new node at the start.
 *            Will replace head with this new node and head will become second node in linkedlist
 * Method 4 : insertAt(int index, int data)  //At any index it will insert new node in our linkedList
 * Method 5 : deleteAt(int index) //Delete node at given index
 */
public class MyCompleteLinkedList {

    public Node head;
    public  class Node{
        int data;
        Node next;
        public Node(){
            this.data=0;
            this.next=null;
        }

        public Node(int someData, Node someNode){
            this.data=someData;
            this.next=someNode;
        }
    }

    /**     * Method 1 : insert(int data)  //Insert new Node at the end of our linkedList     */
    public Node add(int data){
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

    /**     Method 2 : show()    //Print our linkedList     */
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


    /**     * Method 3 : insertAtStart(int data)//Will insert new node at the start.
     *      * Will replace head with this new node and head will become second node in linkedlist    */
    public Node insertAtStart(int data){
        Node newNode=new Node(data,null);//create the new node which you want to insert

        if(head==null){//New node will beceome head, so assign it to head and making new node as head node, as head node was null
            head=newNode;
        }else{
            newNode.next=head;//Second node of our new node will become or point to head.
            /// (so lets say initially head was 1=>2=>3. Now newNode will be like 0(newNode) =Next> (1)head=>2=>3
            //So newNode is pointing to begin of nodes linkedlist
            //so why not assign this pointer to head, so that our head will be pointing to begin, why not head only be our starting point
            //Just to make readable better. head should be pointing to begin of node, so we have assigned back to head below

            head=newNode;//Now here we are doing reassigning our newNode Linked List to head back.
            //so this means now head will look like 0(head)=>1=>2=>3
        }

        return head;
    }


    /**      *  Method 4 : insertAt(int index, int data)  //At any index it will insert new node in our linkedList
     *      * Assuming 0 index means head node
     * */

    public void insertAt(int index, int data){
        Node newNode= new Node(data,null); //Create the new node which you want to insert

        if(head==null){ //if head was null already so only one case of zero index is possible
            if(index!=0){
                System.out.println("Head/LinkedList is null, so can't put new node at any index other than 0");
                System.out.println("Hence adding new node as first node as head");
            }
            head=newNode;
        }

        if (index==0){
            insertAtStart(data);
        }
        else{
            //First we need to reach to that index where we are supposed to insert our new node
            //So we need temporary node traversal which will traverse our node upto that index and add new node to it
            //so to add at 5th position, we need to traverse 4 nodes, so 4thNode.next should be equal to new node.
            //and newNode.next should be equal to remaining nodes after 4th node.

            Node tempNodeTraversal=head; //Here it is already at pointing to first Node (Head) 0th index. so take index-1 from i=1
            for(int i=1;i<index-1;i++){//example if index is 5 then this will go 1,2,3,4
                if(tempNodeTraversal!=null){
                    tempNodeTraversal=tempNodeTraversal.next; //At i=1, this will be at second Node, 2,3rdNode, 3,4thNode,
                }
                else{
                    System.out.println("Reached end of the linkedList : Index value is more than length of linkedList");
                    break;
                }
            }

            //When we come out of the loop. tempNode will be pointing to 4th Node
            //First store to be separated node after 4th node in some temporary Node.
            Node pointerTo5thNode=null;
            if(tempNodeTraversal.next!=null){
                 pointerTo5thNode=tempNodeTraversal.next;
            }
            newNode.next=pointerTo5thNode; //add 5th node to new nodes next, so it will be newNode=>5thNode=>6thNode..
            tempNodeTraversal.next=newNode; //Now add newNode to our pointer which is at 4th node
            //so it will become 1=>2=>3=>4(tempNode)=next>NewNode=next>5thNode=>6thNod...
            //But our head is pointing in beginning as we have not moved our head pointer and still it is pointing to firstNode only
            //hence return head, or leave it be, as head inner changes has been made and it will be automatically reflected


            /**
             * This you can have done in other way also.
             * That is instead of going to 4th node, let's go to 5th node only
             * for(int i=0;i<index-1;i++){
             *  tempNodeTraversal=tempNodeTraversal.next;
             * }
             *
             * newNode.next=tempNodeTraversal.next;
             * tempNodeTraversal.next=node;
             */


        }

    }


    /**\Method 5 : deleteAt(int index) //Delete node at given index */
    public void  deleteAt(int index){
        if(index==0){
            //means you want to delete the first node of linkedlist/head
            //so why not move our head forward to second node and head starts from second node only
            head=head.next;
        }
        else {
            Node tempHeadTraversal = head;
            System.out.println(tempHeadTraversal.data);

            for(int i=0;i<index-1;i++){ //Example in 1=>2=>3=>4=>5 You want to delete index=2, i.e 3 from linkedlist
                //so this loop will travers only 0 (at second Node)  and 1 (at third Node)
                //so after we come out, we need to store this third node afterwards linkedlist in new node
                //and in our traversal's next node only add next of third node
                tempHeadTraversal=tempHeadTraversal.next;
                System.out.println(tempHeadTraversal.data);

            }

            Node storeIndexedNode=tempHeadTraversal.next; //Here this will store 4=>5
            int valueDeleted=tempHeadTraversal.next.data;
            //Now in our tempHeadTraversal's next put the next of sotreIndexedNode
            tempHeadTraversal.next=storeIndexedNode.next;

            System.out.println("Index taken from 0 : Deleted Node is "+"from index : "+index+" =>" + valueDeleted);


        }
    }

    public static void main(String[] args) {
        MyCompleteLinkedList linkedList = new MyCompleteLinkedList(); //This will initialize head node inside only
        linkedList.add(2); //this will add new node to our head node
        linkedList.add(4);linkedList.add(6);linkedList.add(8);linkedList.add(10);linkedList.add(12);
        linkedList.add(6); linkedList.show();
//        linkedList.insertAtStart(1); linkedList.show();
//        linkedList.insertAt(3,5); linkedList.show();
//        linkedList.insertAt(6,10);
        linkedList.deleteAt(3);

        linkedList.show();

    }

}
