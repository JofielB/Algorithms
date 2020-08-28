package RandomProblems;

public class MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        return  mergeTree(t1, t2);
    }

    private TreeNode mergeTree(TreeNode node1, TreeNode node2){
        TreeNode node;
        if(node1 == null && node2 == null) return null;
        else if(node1 == null) {
            node = new TreeNode(node2.val);
            node.left = mergeTree(null, node2.left);
            node.right = mergeTree(null, node2.right);
        }
        else if(node2 == null){
            node = new TreeNode(node1.val);
            node.left = mergeTree(node1.left, null);
            node.right = mergeTree(node1.right, null);
        }
        else {
            node = new TreeNode(node1.val + node2.val);
            node.left = mergeTree(node1.left, node2.left);
            node.right = mergeTree(node1.right, node2.right);
        }
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
