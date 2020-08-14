package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BTPopulatingNextRight {

    public Node connect(Node root) {
        if(root == null) return root;
        List<Node> currentList = new ArrayList<>();
        currentList.add(root);
        int size = 1;

        while (!currentList.isEmpty()){

            for (int i = 0; i <size ; i++) {
                Node current = currentList.get(0);
                if(i + 1 < size) current.next = currentList.get(1);
                currentList.remove(0);
                if(current.left != null) currentList.add(current.left);
                if(current.right != null) currentList.add(current.right);
            }
            size = currentList.size();

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
