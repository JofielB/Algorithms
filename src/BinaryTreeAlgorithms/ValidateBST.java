package BinaryTreeAlgorithms;

public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        return exploreTree(root, null, null);
    }

    private static boolean exploreTree(TreeNode node, Integer valueLeft, Integer valueRight){
        //Verify if the node its null and return true to stop the recursion
        if(node == null) return  true;

        //Get the value of the current node
        int value = node.val;

        //Check if its a left node or a right node and check if the value is accepted
        if(valueLeft != null && value <= valueLeft) return false;
        if(valueRight != null && value >= valueRight) return false;

        //Access to a lowe level
        if(! exploreTree(node.right, value, valueRight)) return false;
        if(! exploreTree(node.left, valueLeft, value)) return false;

        return  true;
    }

    public static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        System.out.println(isValidBST(root));
    }
}
