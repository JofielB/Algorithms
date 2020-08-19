package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BTSerializeDeserialize {

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder sTree = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i <size ; i++) {
                TreeNode current = queue.remove();
                sTree.append(current.val+ "");
                if(current.left == null){
                    sTree.append("#");
                }else {
                    queue.add(current.left);
                }
                if(current.right == null){
                    sTree.append("#");
                }else {
                    queue.add(current.right);
                }

            }
        }
        return sTree.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data.length() < 1) return null;

        TreeNode tree = new TreeNode(Integer.parseInt(data.substring(0, 1)));
        for (int i = 1; i < data.length(); i++) {

            TreeNode current = tree;

            int nextNode = Integer.parseInt(data.substring(i, i + 1));
            boolean added = false;
            while (!added) {
                int currentVal = current.val;
                if (nextNode > currentVal) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new TreeNode(nextNode);
                        added = true;
                    }
                } else {
                    if (current.left != null) {
                        current = current.right;
                    } else {
                        current.left = new TreeNode(nextNode);
                        added = true;
                    }
                }
            }

        }
        return tree;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        String test = "1234";
        TreeNode tree = deserialize(test);
        System.out.println(serialize(tree));

    }
}
