package LinkedList;

public class ListNode<T>{
    private class Node<T>{
        private T data;
        private Node next;
        public Node(T data){
            this.data = data;
        }
    }

    private Node first;
    private Node last;
    private int count;

    public void addLast(T data){
        Node node = new Node(data);
        if(isEmpty()){
            first=last=node;
        } else {
            last.next = node;
            last = node;
        }
        count++;
    }
    
    public void addFirst(T data){
        Node node = new Node(data);
        if(isEmpty()){
            first = last =node;
        }else {
            node.next = first;
            first = node;
        }
    }
    public boolean isEmpty(){
        if(first == null) return true;
        return false;
    }

}
