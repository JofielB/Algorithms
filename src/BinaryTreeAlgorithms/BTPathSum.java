package BinaryTreeAlgorithms;

public class BTPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return pathSum(root, sum, 0);
    }

    private boolean pathSum(TreeNode node, int goal, int currentSum)
    {
        boolean left = false;
        boolean right = false;
        if( node.val + currentSum != goal
                && node.left == null
                && node.right == null) return false;
        if(currentSum + node.val == goal
                && node.left == null
                && node.right == null) return true;
        if(node.left != null)  left =  pathSum(node.left, goal, currentSum + node.val);
        if(node.right != null) right =  pathSum(node.right, goal, currentSum + node.val);
        return left || right;
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
