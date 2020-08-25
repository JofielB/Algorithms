package NaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class NaryTrePreorder {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        fillList(list, root);
        return list;
    }

    private void fillList(List<Integer> list, Node node) {
        list.add(node.val);
        List<Node> children = node.children;
        for (int i = 0; i <children.size() ; i++) {
            fillList(list, children.get(i));
        }
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
