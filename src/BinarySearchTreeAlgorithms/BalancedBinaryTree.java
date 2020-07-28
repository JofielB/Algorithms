package BinarySearchTreeAlgorithms;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return balance(root);
    }

    private boolean balance(TreeNode node){
        if(node == null) return true;

        int heightLeft = height(node.left);
        int heightRight = height(node.right);

        return (Math.abs(heightLeft-heightRight) <= 1
                && balance(node.left)
                && balance(node.right));
    }

    private int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
