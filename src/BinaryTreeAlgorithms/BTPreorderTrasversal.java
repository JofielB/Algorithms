package BinaryTreeAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BTPreorderTrasversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if(root == null) return list;

        addNumbers(root, list);

        return list;
    }

    private void addNumbers(TreeNode node, List<Integer> list){
        list.add(node.val);
        if(node.left != null) addNumbers(node.left, list);
        if(node.right != null) addNumbers(node.right, list);
    }

    public  class TreeNode {
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
