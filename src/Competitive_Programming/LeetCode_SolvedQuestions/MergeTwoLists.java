package LeetCode_SolvedQuestions;

import java.util.*;

/**
 * There is other approach also along with my approach which takes minimum time and made use of some initial value to head or newlist
 * so that it don't have to take care for when head is null
 */

public class MergeTwoLists {

    /**
     * This is my approach (Lengthy)
     * This take time 1 millisecond
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList= null;

        while(list1 !=null  && list2 !=null){
            if(list1.val > list2.val){
                //create a new node
                ListNode listNode = new ListNode(list2.val, null);

                //Add this new node to finalList
                if(finalList == null){ //if finalList is null
                    finalList=listNode;
                }else{
                    //If finalList is not null.
                    //Traverse the finalList and put the value in end.
                    ListNode finalListIterator=finalList;
                    while(finalListIterator.next != null){ //when it becomes null means we are at our last node which is null.
                        finalListIterator=finalListIterator.next;
                    }
                    //Coming out of the loop we are at our last node now, which is null
                    //hence put your node to final list now. So this will add node in your finalList traversed and updated by finalListIterator
                    finalListIterator.next=listNode;

                }
                list2=list2.next;//Move one step forward node in list2.
                //Also you need to continue, instead of checking below again// or put in else if part only

            }
            else if(list1.val < list2.val){
                //create a new node
                ListNode listNode = new ListNode(list1.val, null);

                //Add this new node to finalList
                if(finalList == null){ //if finalList is null
                    finalList=listNode;
                }else{
                    //If there value already in finalList.
                    //Traverse the finalList and put the value in end.
                    ListNode finalListIterator=finalList;
                    while(finalListIterator.next != null){
                        /**
                         * since you have to put value in the next of a node and not in node itself
                         * So always check the next because there only you need to add the newNode 5***
                         * */
                        finalListIterator=finalListIterator.next;
                    }
                    //Coming out of the loop we are at our last node now.
                    //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                    /**
                     * since you have to put value in the next of a node and not in node itself
                     * So always check the next because there only you need to add the newNode 5***
                     * */
                    finalListIterator.next=listNode; //since you have to put value in the next of a node and not in node itself

                }
                list1=list1.next;//Move one step forward node in list2.

            }
            else if(list1.val == list2.val){
                //create a new node
                ListNode listNode1 = new ListNode(list2.val, null);
                ListNode listNode2 = new ListNode(list1.val, null);

                //Add this new node to finalList
                if(finalList == null){ //if finalList is null
                    finalList=listNode1;
                    finalList.next=listNode2;
                }else{
                    //If there value already in finalList.
                    //Traverse the finalList and put the value in end.
                    ListNode finalListIterator=finalList;
                    while(finalListIterator.next != null){
                        finalListIterator=finalListIterator.next;
                    }
                    //Coming out of the loop we are at our last node now.
                    //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                    finalListIterator.next=listNode1;
                    finalListIterator.next.next=listNode2;

                }
                list2=list2.next;//Move one step forward node in list2.
                list1=list1.next;
            }
        }

        //Now out of the loop still in one of the list we have some nodes left.
        //then put that node in our finalList.
        if (list1 == null && list2 != null) {
            if(finalList == null){ //if finalList is null
                finalList=list2;
            }else{
                //If there value already in finalList.
                //Traverse the finalList and put the value in end.
                ListNode finalListIterator=finalList;
                while(finalListIterator.next != null){
                    finalListIterator=finalListIterator.next;
                }
                //Coming out of the loop we are at our last node now.
                //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                finalListIterator.next=list2;

            }

        }

        if (list1 != null && list2 == null) {
            if(finalList == null){ //if finalList is null
                finalList=list1;
            }else{
                //If there value already in finalList.
                //Traverse the finalList and put the value in end.
                ListNode finalListIterator=finalList;
                while(finalListIterator.next != null){
                    finalListIterator=finalListIterator.next;
                }
                //Coming out of the loop we are at our last node now.
                //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                finalListIterator.next=list1;

            }

        }

        return finalList;

    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, null);
        //list1.next= new ListNode(5,null);
        // list1.next.next=new ListNode(10,null);


        ListNode list2 = new ListNode(2, null);
        // list2.next=new ListNode(6, null);
        // list2.next.next  = new ListNode(7, null);

        ListNode tempIterator=list1;
        while (tempIterator!=null){
            System.out.print(tempIterator.val + " ");
            tempIterator=tempIterator.next;

        }
        System.out.println();
        tempIterator=list2;
        while (tempIterator!=null){
            System.out.print(tempIterator.val + " ");
            tempIterator=tempIterator.next;

        }
        System.out.println();

        ListNode finalAnswer=mergeTwoLists(list1,list2);

        while (finalAnswer!=null){
            System.out.print(finalAnswer.val + " ");
            finalAnswer=finalAnswer.next;
        }
    }

    /**
     * This is other approach where he has reduced the code to check newList for null by adding some initial node to head and
     * later only returning the head.next so it saves codes and space
     * This takme time 0 millisecond
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                ListNode a=new ListNode(temp1.val);
                temp.next=a;
                temp=a;
                temp1=temp1.next;

            }
            else{
                ListNode a=new ListNode(temp2.val);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
    }

    /**
     * Here is one more very most crisp solution,
     * Here it is only updated what is required. Very good solution
     * It saves little more space than others
     */
    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); //initially we put some node in head, so that we don't have to keep checking for null head
        ListNode cur = dummy;

        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
            {
                cur.next = l1; //Putting the whole list
                l1 = l1.next;
            } else
            {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;  //This one I like. Now we are putting the whole list from above, but again moving to next node and
            //updating there only for next node whichever is suitable accroding to comparison
            //Very professional solution
        }

        cur.next = l1 == null ? l2 : l1;
        return dummy.next; //See here also, to remove use of null we are sending from next of head only.
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}






