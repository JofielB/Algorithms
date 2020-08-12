package BinaryTreeAlgorithms;

import java.util.Arrays;

public class BTConstrucBT2 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length <= 0 || inorder.length <= 0) return null;
        TreeNode tree = new TreeNode();
        createTree(tree, preorder, inorder);
        return tree;
    }
    private void createTree(TreeNode node, int[] preorder, int[] inorder){
        int head = preorder[0];
        int leftSize = 0;
        while (inorder[leftSize] != head)
        {
            leftSize++;
        }
        int rightSize = preorder.length - leftSize - 1;

        //Set value
        node.val = head;

        //Recursion
        if(leftSize > 0)
        {
            node.left = new TreeNode();
            createTree(node.left ,
                    Arrays.copyOfRange(preorder, 1, leftSize+1),
                    Arrays.copyOfRange(inorder,0, leftSize));
        }
        if(rightSize > 0)
        {
            node.right = new TreeNode();
            createTree(node.right,
                    Arrays.copyOfRange(preorder, 1+leftSize, preorder.length),
                    Arrays.copyOfRange(inorder, leftSize+1, inorder.length));
        }
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
        int[] test = {1,2,3,4,5};
        int[] test1 = Arrays.copyOfRange(test, 0,3);
        System.out.println(Arrays.toString(test1));
    }

}
