package BinaryTreeAlgorithms;

public class BTSLowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        return findAncestor(root, p, q);
    }

    private TreeNode findAncestor(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return null;
        if((p.val < node.val &&  q.val > node.val)
                || (q.val < node.val &&  p.val > node.val)
        )return node;

        if(q.val == node.val || p.val == node.val) return node;

        if(q.val > node.val && p.val > node.val){
            return findAncestor(node.right, p, q);
        }else {
            return findAncestor(node.left, p, q);
        }
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
