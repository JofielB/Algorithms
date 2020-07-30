package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BTPostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        createList(root, list);
        return list;
    }

    private void createList(TreeNode node, List<Integer> list){
        if(node.left != null) createList(node.left, list);
        if(node.right == null){
            list.add(node.val);
        }else{
            createList(node.right, list);
            list.add(node.val);
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
