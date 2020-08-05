package BinaryTreeAlgorithms;

public class BTMaxDepth {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root, 1);
    }

    private int depth(TreeNode node, int level)
    {
        int left = level;
        int right = level;
        if(node.left != null) left = depth(node.left, level +1);
        if(node.right != null) right = depth(node.right, level +1);
        return Math.max(left, right);
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
