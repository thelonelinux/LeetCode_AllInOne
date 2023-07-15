import java.util.*;

public class Main {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList= null;

        while(list1 !=null  && list2!=null){
            if(list1.val > list2.val){
                //create a new node
                ListNode listNode = new ListNode(list2.val, null);

                //Add this new node to finalList
                if(finalList == null){ //if finalList is null
                    finalList=listNode;
                }else{
                    //If there value already in finalList.
                    //Traverse the finalList and put the value in end.
                    ListNode finalListIterator=finalList;
                    while(finalListIterator != null){
                        finalListIterator=finalListIterator.next;
                    }
                    //Coming out of the loop we are at our last node now.
                    //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                    finalListIterator=listNode;

                }
                list2=list2.next;//Move one step forward node in list2.
            }

            if(list1.val < list2.val){
                //create a new node
                ListNode listNode = new ListNode(list1.val, null);

                //Add this new node to finalList
                if(finalList == null){ //if finalList is null
                    finalList=listNode;
                }else{
                    //If there value already in finalList.
                    //Traverse the finalList and put the value in end.
                    ListNode finalListIterator=finalList;
                    while(finalListIterator != null){
                        finalListIterator=finalListIterator.next;
                    }
                    //Coming out of the loop we are at our last node now.
                    //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                    finalListIterator=listNode;

                }
                list1=list1.next;//Move one step forward node in list2.
            }

            if(list1.val == list2.val){
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
                    while(finalListIterator != null){
                        finalListIterator=finalListIterator.next;
                    }
                    //Coming out of the loop we are at our last node now.
                    //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                    finalListIterator=listNode1;
                    finalListIterator.next=listNode2;

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
                while(finalListIterator != null){
                    finalListIterator=finalListIterator.next;
                }
                //Coming out of the loop we are at our last node now.
                //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                finalListIterator=list2;

            }

        }

        if (list1 != null && list2 == null) {
            if(finalList == null){ //if finalList is null
                finalList=list1;
            }else{
                //If there value already in finalList.
                //Traverse the finalList and put the value in end.
                ListNode finalListIterator=finalList;
                while(finalListIterator != null){
                    finalListIterator=finalListIterator.next;
                }
                //Coming out of the loop we are at our last node now.
                //hence put your node to final list now. So this will add node i your finalList traversed and updated by finalListIterator
                finalListIterator=list1;

            }

        }

        return finalList;

    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, null);
        list1.next= new ListNode(5,null);
        list1.next.next=new ListNode(10,null);


        ListNode list2 = new ListNode(1, null);
        list2.next=new ListNode(6, null);
        list2.next.next  = new ListNode(7, null);

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
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



