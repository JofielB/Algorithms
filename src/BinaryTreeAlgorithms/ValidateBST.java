package BinaryTreeAlgorithms;

public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        return exploreTree(root, root, -1);
    }

    private static boolean exploreTree(TreeNode node, TreeNode root,int direction){
        boolean stateLeft = true;
        boolean stateRight = true;
        boolean statement = true;
        if(direction==0){
            statement = root.val > node.val;
        }else if(direction == 1){
            statement = root.val < node.val;
        }
        if(node.left != null){
            int dir = direction == -1 ? 0:direction;
            stateLeft =  node.val > node.left.val;
            if(stateLeft) {
                stateLeft = exploreTree(node.left, root,dir);
            }
        }
        if(node.right != null){
            int dir = direction == -1 ? 1:direction;
            stateRight = node.val < node.right.val;
            if (stateRight) {
                stateRight = exploreTree(node.right, root,dir) ;
            }
        }

        if(stateLeft && stateRight && statement) {
            return true;
        }else {
            return false;
        }
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
