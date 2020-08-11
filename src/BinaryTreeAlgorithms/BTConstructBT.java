package BinaryTreeAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BTConstructBT {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length <= 0 || postorder.length <= 0) return null;
        TreeNode tree = new TreeNode();
        createTree(tree, inorder, postorder);
        return tree;
    }

    private void createTree(TreeNode node, int[] inorder, int[] postorder){
        int head = postorder[postorder.length-1];

        //INORDER LISTS
        List<Integer> indIzq = new ArrayList<>();
        int indexHeadInd = 0;
        while (inorder[indexHeadInd] != head)
        {
            indIzq.add(inorder[indexHeadInd]);
            indexHeadInd++;
        }

        List<Integer> indDer = new ArrayList<>();
        for (int i = indexHeadInd+1; i <inorder.length ; i++) {
            indDer.add(inorder[i]);
        }

        //POST-ORDER LISTS
        List<Integer> posDer = new ArrayList<>();
        for (int i = 0, j = postorder.length-2; j >= 0 && i < indDer.size(); i++, j--)
        {
            posDer.add(0, postorder[j]);
        }

        List<Integer> posIzq = new ArrayList<>();
        int posIzSize =postorder.length - posDer.size() - 1;
        for (int i = 0; i<posIzSize ; i++){
            posIzq.add(postorder[i]);
        }

        //USE THE DATA
        node.val = head;
        if(indIzq.size() > 0){
            node.left = new TreeNode();
            int[] indLeft = listToArray(indIzq);
            int[] posLeft = listToArray(posIzq);
            createTree(node.left, indLeft, posLeft);
        }
        if(indDer.size() > 0)
        {
            node.right = new TreeNode();
            int[] indRight = listToArray(indDer);
            int[] posRight = listToArray(posDer);
            createTree(node.right, indRight, posRight);
        }
    }

    private int[] listToArray(List<Integer> list){
        int size = list.size();
        int[] array = new int[size];
        for (int i = 0; i<size; i++)
        {
            array[i] = list.get(i);
        }
        return array;
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

    public static void main(String[] args) {
        int[] ind = {9,3,15,20,7};
        int[] pos = {9,15,7,20,3};
        int head = pos[pos.length-1];

        //INORDER LISTS
        List<Integer> indIzq = new ArrayList<>();
        int indexHeadInd = 0;
        while (ind[indexHeadInd] != head)
        {
            indIzq.add(ind[indexHeadInd]);
            indexHeadInd++;
        }

        List<Integer> indDer = new ArrayList<>();
        for (int i = indexHeadInd+1; i <ind.length ; i++) {
            indDer.add(ind[i]);
        }

        System.out.println(indIzq);
        System.out.println(indDer);


        //POST-ORDER LISTS
        List<Integer> posDer = new ArrayList<>();
        for (int i = 0, j = pos.length-2; j >= 0 && i < indDer.size(); i++, j--)
        {
            posDer.add(pos[j]);
        }

        List<Integer> posIzq = new ArrayList<>();
        int posIzSize =pos.length - posDer.size() - 1;
        for (int i = 0; i<posIzSize ; i++){
            posIzq.add(pos[i]);
        }

        System.out.println(posIzq);
        System.out.println(posDer);
    }
}
