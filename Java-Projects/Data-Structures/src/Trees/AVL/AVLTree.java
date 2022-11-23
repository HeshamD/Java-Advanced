package Trees.AVL;

public class AVLTree {
    private class AVLNode{
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;
        public AVLNode(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value= " +this.value;
        }
    }

    private AVLNode root;

    // 10
    ///
    private AVLNode insert(AVLNode root,int value){
        if(root == null) return new AVLNode(value);

       if(root.value > value){
          root.leftChild = insert(root.leftChild,value);
       }else{
          root.rightChild = insert(root.rightChild,value);
       }
        return root;
    }
}
