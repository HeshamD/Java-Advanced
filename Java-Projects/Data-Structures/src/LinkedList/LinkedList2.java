package LinkedList;

import java.rmi.NotBoundException;

public class LinkedList2 {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node firstNode;
    private Node lastNode;
    private int count;

    public void addLast(int value){
        Node node = new Node(value);
        if (isEmpty()){
            firstNode = lastNode = node;
            count++;
            return;
        }
        lastNode.next = node;
        lastNode = node;
        count++;
    }
    public void addFirst(int value){
        Node node = new Node(value);
        if (isEmpty()){
            firstNode = lastNode = node;
            count++;
            return;
        }
        node.next = firstNode;
        firstNode = node;
        count++;
    }
    public boolean isEmpty(){
        if (firstNode == null)return true;
        return false;
    }

    public int indexOf(int value){
        var current = firstNode;
        int count =0;
        while (current != null){
            if(current.value == value){
                return count;
            }
            current = current.next;
            count++;
        }
        return -1;
    }

    public boolean contains(int value){
        if(indexOf(value) == -1) return false;
        return true;
    }

    public void removeFirst(){
        if (isEmpty())throw new IllegalStateException(); // unchecked exception
        var second = firstNode.next;
        firstNode.next = null; // to remove the link between the first node and the second node
        //update firstNode and making referecing to the second node
        firstNode = second;
        count--;
    }

    public void print(){
        var cur = firstNode;
        while (cur!=null){
            System.out.println(cur.value);
            cur = cur.next;
        }
    }

    public int size(){
        return count;
    }

    public void removeLast(){
        // 3 -> 4 -> 5 -> null

        if(isEmpty())throw new IllegalStateException();
        var prev = getPrevious(lastNode);
        if (prev == null) throw new IllegalStateException();

        lastNode = prev; //shrink the list
        lastNode.next = null; //removing the link
    }

    private Node getPrevious(Node node){
        var cur = firstNode;
        while (cur!=null){
            if (cur.next == node) return cur;
            cur = cur.next;
        }
        return null;
    }

    public void reverseLinkedList(){

        // 1 -> 2 -> 3 -> 4 -> 5
        // |    |
        Node prev = null;
        var curr = firstNode;
        while (curr!=null){
            var nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
    }

}
