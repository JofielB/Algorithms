package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BTSerializeDeserialize {

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if(root == null) return null;
        StringBuilder sTree = new StringBuilder();
        buildStringTree(root, sTree);
        return sTree.toString();
    }

    private static void buildStringTree(TreeNode node, StringBuilder stringBuilder) {
        if(node == null) stringBuilder.append("@,");
        else{
            stringBuilder.append(node.val + ",");
            buildStringTree(node.left, stringBuilder);
            buildStringTree(node.right, stringBuilder);
        }
    }


    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(data == null||data.length()<1)return null;
        Queue<String> queueTree = new LinkedList<>();
        char[] cData = data.toCharArray();
        for (char a: cData) {
            queueTree.add(a+"");
        }
        TreeNode root = createTree(queueTree);
        return root;
    }

    //TODO Add "," at serialize the tree to know when the number ends
    private static TreeNode createTree(Queue<String> queue){
        if(queue.isEmpty()) return null;
        String current = getFullNumber(queue);
        if(current.equals("@")) return null;
        int val = Integer.parseInt(current);
        TreeNode node = new TreeNode(val);
        node.left = createTree(queue);
        node.right = createTree(queue);
        return node;
    }

    private static String getFullNumber(Queue<String> queue) {
        StringBuilder fullString = new StringBuilder();
        String current = queue.remove();
        while (!current.equals(",")){
            fullString.append(current);
            current = queue.remove();
        }
        return fullString.toString();
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
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(9);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(-28);
        node.left.right = new TreeNode(10);
        String s = serialize(node);
        System.out.println(s);
        System.out.println("New tree:");
        TreeNode test = deserialize(s);
        System.out.println(serialize(test));

    }
}
