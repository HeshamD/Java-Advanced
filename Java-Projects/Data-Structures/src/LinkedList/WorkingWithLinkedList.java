package LinkedList;

import java.io.FileReader;
import java.util.LinkedList;

public class WorkingWithLinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    private int count;
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);
        if(first == null){
            first = last = node;
        }else {
            last.next = node; // i am pointing last node to points to towards the newNode
            last = node; // setting the last node is this node
        }
        count++;
    }
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty()){
            first=last=node;
        }else {
            node.next = first;
            first = node;
        }
    }
    private boolean isEmpty(){
        if (first==null) return true;
        return false;
    }

    public int indexOf(int item){
        // we need to traverse this list starting from the beginning
        // to the end
        int index=0;
        var current = first;
        while (current!=null){
            if(current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        if(indexOf(item) != -1) return true;
        return false;
    }

    public void removeFirst(){
        if(first == last){ // this means that if we have only one node in the last. i will set both equal to null
            first = last = null;
            return;
        }
        // the first node going to be equal to null.
        var tempNode = first.next;
        first.next = null;
        first = tempNode;
    }

    public void removeLast(){
        // [10 -> 20 -> 30]
        // we need to set the last item to null
        // but we need to make sure the connection of the prev node is set it to the new last node
        // so we need to traverse through the array

        var prev = getPrevious(last);
        last = prev;
        last.next = null;
    }

    public Node getPrevious(Node node){
        var current = first;
        while (current!=null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int sumValues(){
        // create a sum value
        // loop through the linked list
        // add the value of the link list to the sum till the end
        // return the sumValue variable

        int totalSum = 0;
        if(isEmpty()) return 0;
        var cur =first;
        while (cur!=null){

            totalSum += cur.value;
            cur = cur.next;
        }
        return totalSum;
    }

    public boolean findNodeValue(int value){
        // if empty
        // check if the first node is the value O(1)
        // check if last node is the value O(1)
        if(isEmpty()) return false;
        if(first.value == value) return true;
        if(last.value == value) return true;

        while (first!=null){
            if(first.value == value) return true;
            first = first.next;
        }
        return false;
    }

    public int getNodeValue(int index){
        //check if it's empty
        //loop through the linklist
        //create variable = 0
        // increment in the loop
        // when this var == index
        // return the node Value

        if(isEmpty()) return -1; //is not Valid
        int count =0;
        while (first != null){ // T.C = O(N)
            if(count == index){
                return first.value;
            }
            first = first.next;
        }

        return -1;
    }
    public WorkingWithLinkedList.Node reversedList(){
        // two pointers
        // track the cur
        // track the prev
        // create a variable called next -> going to make it equal to the second node in the list
        // make the current.next pointing to prev
        // make current.next = to the prev  and then shift
        // T.C -> O(N)

        WorkingWithLinkedList.Node prev = null;
        var curr = first;

        while(curr != null){
            var nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }

    public WorkingWithLinkedList.Node zipperList(WorkingWithLinkedList l2){
        //given one list to
        // zip the this list with the other one
        // mirgaing both linkedlist together to form one LinkedList
        // two pointers
        // one for l1
        // other for l2
        //  while both not == null
        // edge case that might one of them might be longer than the other

        WorkingWithLinkedList.Node tail = this.first;
        WorkingWithLinkedList.Node p1 = this.first.next;
        WorkingWithLinkedList.Node p2 = l2.first;
        int count = 0;

        while (p1!=null && p2!=null){ // as soon as one of my list hits null the loop going to stop

            if (count%2==0){
                tail.next = p2;
                p2 = p2.next;
            }else {
                tail.next = p1;
                p1 = p1.next;
            }
            //increament the tail
            tail = tail.next;

            count++;
        }


        if(p1 != null) tail.next = p1;
        if(p2 != null) tail.next = p2;

        return this.first;
    }

    public boolean isPalindrome(ListNode head) {

        ///  palondrom meaning the last node should be equal to the first and so on

        // O(N) T.C

        ListNode sP = head;
        ListNode fP = head;
        ListNode l1_head = head;
        ListNode lastNode_l1 = sP;

        while(fP!=null && fP.next != null){
            sP = sP.next;
            fP = fP.next.next;
        }

        lastNode_l1.next = null;

        // sP is the beginning of the second list
        // l1 is the head of the first node and lastNode_l1 -> null

        // now i have the two lists are split into halfs

        //compare the two lists

        while(sP != null){
            if(sP.val != l1_head.val){
                return false;
            }
            sP = sP.next;
            l1_head = l1_head.next;
        }

        return true;

    }

}
