package NaryTreeAlgorithms;

import java.util.List;

public class MaxDepth {

    public int maxDepth(Node root) {
        if(root == null) return 0;
        return findDepth(root, 1);
    }

    private int findDepth(Node node, int depth){
        if(node == null ||
        node.children.isEmpty()) return depth;

        List<Node> currentChildren = node.children;

        int max = depth;

        for (int i = 0; i <currentChildren.size(); i++) {
            int currentDepth = findDepth(currentChildren.get(i), depth + 1 );
            if(currentDepth > max) max = currentDepth;
        }

        return max;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

}
