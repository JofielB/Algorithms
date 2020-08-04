package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLevelOrder {

    // USING QUEUE
    public List<List<Integer>> levelOrderQueue(TreeNode root) {
        List <List<Integer>> list = new ArrayList<>();
        if(root == null)  return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
         int size = queue.size();
         List<Integer> currentList = new ArrayList<>();
         for (int i = 0; i < size; i++)
         {
             TreeNode currentNode = queue.remove();
             currentList.add(currentNode.val);
             if(currentNode.left != null) queue.add(currentNode.left);
             if(currentNode.right != null) queue.add(currentNode.right);
         }
         list.add(currentList);
        }

        return list;
    }

    // WORKS BUT DO NOT USE A QUEUE
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> list = new ArrayList<>();

        if(root == null)  return list;

        createList(root, list);

        return list;
    }

    private void createList(TreeNode node, List<List<Integer>> list){

        int last = lastLevel(node,0);

        for (int i = 0; i <=last ; i++) {
            List<Integer> levlList = new ArrayList<>();
            levelList(node, levlList, i, 0);
            list.add(levlList);
        }
    }

    private void levelList(TreeNode node, List<Integer> list,int level, int currentLevel){
        if(level == currentLevel){
            list.add(node.val);
        }else {
            int nextLevel = currentLevel + 1;
            if(node.left != null) levelList(node.left, list, level, nextLevel);
            if(node.right != null) levelList(node.right, list, level, nextLevel);
        }
    }

    private int lastLevel(TreeNode node, int level){
        int left = level;
        int right = level;
        if(node.left !=null) left = lastLevel(node.left, level + 1 );
        if(node.right !=null)right = lastLevel(node.right, right + 1);
        return Math.max(left, right);
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



