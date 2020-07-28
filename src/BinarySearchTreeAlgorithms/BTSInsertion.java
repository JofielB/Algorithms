package BinarySearchTreeAlgorithms;

public class BTSInsertion {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        insertNode(root, val);
        return root;
    }

    private void insertNode(TreeNode node, int val){
        if(val < node.val && node.left == null){
            node.left = new TreeNode(val);
            return;
        }
        else if(val > node.val && node.right == null)
        {
            node.right = new TreeNode(val);
            return;
        }
        if(val < node.val) insertNode(node.left, val);
        else if(val > node.val) insertNode(node.right, val);
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
