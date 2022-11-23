package Trees;

public class Tree2 {
    private class Node{
        private int data;
        private Node leftChild;
        private Node rightChild;
        public Node(int value){
            this.data = value;
        }
    }

    private Node root;

    public void insert(Node node){
        if(root == null) root = node;
        var current = root;
        while (true){
            if(node.data > current.data){
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
            }else {
                if(current.rightChild == null){
                    current.rightChild = node;
                }
                break;
            }
            current = current.rightChild;
        }

    }
}
