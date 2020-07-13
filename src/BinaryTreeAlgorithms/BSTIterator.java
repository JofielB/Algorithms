package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.List;


public class BSTIterator {

    List<TreeNode> list = new ArrayList<>();

    public BSTIterator(TreeNode root) {
        if(root != null){
            createList(root);
        }
    }

    private void createList(TreeNode node){
        //First step search to the left
        if(node.left != null){
            createList(node.left);
        }
        //Second step add the value
        list.add(node);

        //Third step search to the right
        if(node.right != null){
            createList(node.right);
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        if(list.get(0) != null){
            int val = list.get(0).val;

            list.remove(0);

            return val;
        }
        return 0;

    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !list.isEmpty();
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
