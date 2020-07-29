package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BTInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null) return list;
        createList(root, list);
        return list;
    }

    private void createList(TreeNode node, List<Integer> list){
        if(node.left != null) {
            createList(node.left, list);
        }

        list.add(node.val);

        if(node.right != null) {
            createList(node.right, list);
        }

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
