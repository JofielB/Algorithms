package BinarySearchTreeAlgorithms;

public class BTSSearch {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = find(root, val);
        return node;
    }

    private TreeNode find(TreeNode node, int val){
        if(node == null) return null;
        if(node.val == val) return node;
        if(node.val > val) return find(node.left, val);
        if(node.val < val) return find(node.right, val);
        return node;
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
