package NaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrder {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelsList = new ArrayList<>();
        if(root == null) return levelsList;

        Queue<Node> queueLevel = new LinkedList<>();
        queueLevel.add(root);
        List<Integer> currentLevelNumber = new ArrayList<>();
        while (!queueLevel.isEmpty()){

            int levelSize = queueLevel.size();
            for (int i = 0; i <levelSize ; i++) {

                Node currentNode = queueLevel.remove();
                List<Node> currentChildren = currentNode.children;
                currentLevelNumber.add(currentNode.val);

                queueLevel.addAll(currentChildren);

            }

            levelsList.add(currentLevelNumber);
            currentLevelNumber = new ArrayList<>();

        }

        return levelsList;
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
