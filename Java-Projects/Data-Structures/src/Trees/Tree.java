package Trees;

import java.util.List;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    // for insert and find we need to lookup the value and we have to start from the root
    // while node

    public void insert(int value) {
        // lookup for the desired position and then insert
        // start from the node if the root node is null that means the tree is empty so insert this value
        // otherwise, if the value is bigger than the root that means i should put it in the right
        // if the value is smaller than the root then i should go left

       if(this.root == null) {
           root = new Node(value);
           return;
       }

       var current = root;
       while(true){
           if(value > current.value){
               if(current.rightChild == null){
                   current.rightChild = new Node(value);
                   break;
               }
               // go right
               current = current.rightChild;
           }else {
               if(current.leftChild == null){
                   current.leftChild = new Node(value);
                   break;
               }
               current = current.leftChild;
           }
       }

    }

    // 7 8 9
    public boolean find(int value) { //8
        var current = root;

        while (current!=null){
            if(current.value < value) // going left
            {
                current = current.rightChild;
            } else if (current.value > value) {
                current = current.leftChild;
            }else {
                return true;
            }
        }
        return false;
    }
    public void traversePreOrder(){
        traversePreOrder(root);
    }
    private void traversePreOrder(Node node){
        // root (print)
        // left // recursive calling
        // right // recursive callling
        if (this.root == null){
            return;
        }
        System.out.println(this.root.value);
        traversePreOrder(this.root.leftChild);
        traversePreOrder(this.root.rightChild);
    }

    public void traverseInOrder(){
        traversePreOrder(root);
    }
    private void traverseInOrder(Node node){
        if (root == null){
            return;
        }
        traversePreOrder(root.leftChild);
        System.out.println(root.value);
        traversePreOrder(root.rightChild);
    }

    public void traversePostOrder(){
        traversePreOrder(root);
    }
    private void traversePostOrder(Node node){
        if (root == null){
            return;
        }
        traversePreOrder(root.leftChild);
        System.out.println(root.value);
        traversePreOrder(root.rightChild);
    }

    public int height(){
        return height(this.root);
    }

    private int height(Node root){
        if(root == null) return -1;
        if(root.leftChild == null && root.rightChild==null) return 0;
        return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }

    public int minimumValue(){
        return minimumValue(this.root);
    }
    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }
    private int minimumValue(Node root){

        if(isLeaf(root)) return root.value;

        var left = minimumValue(root.leftChild);
        var right = minimumValue(root.rightChild);

        return Math.min( Math.min(left,right), root.value);
    }

    //O(log(N))
    public int min(){
        if (root == null) throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null){
            last = current;
            current = current.leftChild; // so we keep going to the left
        }
        return last.value;
    }

    public boolean equals(Tree other) {
        if (other == null) return false;
        return equals(root, other.root);
    }
    private boolean equals(Node first, Node second){
        //both are null
        if(first == null && second == null) return true;

        if(first != null && second != null){
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        return false;

    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean isBinarySearchTree(Node root,int min,int max){
        if(root == null) return true;
        //validate the root value
        if(root.value < min || root.value > max) return false;

       return isBinarySearchTree(root.leftChild,min,root.value-1)
                && isBinarySearchTree(root.rightChild,root.value+1,max);
    }

    public void printNodesAtDistance(int distance){
        printNodesAtDistance(this.root,distance);
    }
    private void printNodesAtDistance(Node root,int distance){
        if(root == null) return;

        if(distance == 0){
            System.out.println(root.value);
            return;
        }
        printNodesAtDistance(root.leftChild,distance-1);
        printNodesAtDistance(root.rightChild,distance-1);
    }

}
