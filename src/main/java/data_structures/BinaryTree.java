package data_structures;

public class BinaryTree {
    
    private BinaryTreeNode root;
    
    public void insertValue(int value) {
        if (root == null) {
            root = new BinaryTreeNode(value);
            return;
        }
        recursiveInsert(value, root);
    }
    
    private void recursiveInsert(int value, BinaryTreeNode node) {
        if (value == node.getValue()) {
            System.err.println("Duplicate value insertion attempted with value: " + value);
            return;
        }

        if (value < node.getValue()) {
            if (node.getLeft() == null) {
                node.setLeft(new BinaryTreeNode(value));
                return;
            }

            recursiveInsert(value, node.getLeft());
            return;
        }

        if (node.getRight() == null) {
            node.setRight(new BinaryTreeNode(value));
            return;
        }

        recursiveInsert(value, node.getRight());
    }

    private class BinaryTreeNode {
        private BinaryTreeNode left;
        private BinaryTreeNode right;
        private final int value;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public BinaryTreeNode getLeft() {
            return left;
        }

        public BinaryTreeNode getRight() {
            return right;
        }

        public int getValue() {
            return value;
        }

        public void setLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public void setRight(BinaryTreeNode right) {
            this.right = right;
        }
    }

}
