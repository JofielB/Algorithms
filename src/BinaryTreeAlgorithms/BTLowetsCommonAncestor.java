package BinaryTreeAlgorithms;

public class BTLowetsCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        return findAncestor(root, p, q);
    }

    private TreeNode findAncestor(TreeNode node, TreeNode p, TreeNode q) {
        TreeNode left = null;
        TreeNode right = null;
        if(node.val == p.val || node.val == q.val) return node;
        if(findNode(node.left,p) && findNode(node.right, q)) return node;
        if(findNode(node.left,q) && findNode(node.right, p)) return node;
        if(node.left != null) left = findAncestor(node.left, p, q);
        if(node.right != null) right = findAncestor(node.right, p, q);
        return left == null ? right:left;
    }

    private boolean findNode(TreeNode head, TreeNode find)
    {
        boolean left = false;
        boolean right = false;
        if (head == null) return false;
        if(head.val == find.val) return true;
        if(head.left != null) left = findNode(head.left, find);
        if(head.right != null) right = findNode(head.right, find);
        return (left||right);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
