package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTPopulatingNext {

    public Node connect(Node root) {
        if(root == null) return root;
        List<Node> levelList = new ArrayList<>();
        levelList.add(root);
        int size = 1;
        while (!levelList.isEmpty()){
            //Get all the nodes of the level
            for (int i = 0; i <size; i++) {
                Node current = levelList.get(0);;
                levelList.remove(0);
                if(current.left != null) levelList.add(current.left);
                if(current.right != null) levelList.add(current.right);

            }
            size = levelList.size();
            //Make the connections
            for (int i = 0; i <size ; i++) {
                Node current = levelList.get(i);
                current.next = i+1 >= size ? null:levelList.get(i+1);
            }
        }
        return root;
    }


    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

}
