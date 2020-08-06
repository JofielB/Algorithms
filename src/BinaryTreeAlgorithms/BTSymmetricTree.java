package BinaryTreeAlgorithms;

import java.util.*;

public class BTSymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if((root.left == null && root.right != null)
        || root.left != null && root.right == null) return false;

        return comparePaths(root.left, root.right);
    }

    private  boolean comparePaths(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return  false;
        return (left.val == right.val
                && comparePaths(left.left, right.right)
                && comparePaths(left.right, right.left));
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
        Queue<TreeNode> ints = new ArrayDeque<>();
        ints.add(new TreeNode());
        ints.add(new TreeNode(2));
        ints.add(new TreeNode(5));
        ints.add(new TreeNode());
        System.out.println(ints.size());
        System.out.println(ints.remove().val);
    }
}
