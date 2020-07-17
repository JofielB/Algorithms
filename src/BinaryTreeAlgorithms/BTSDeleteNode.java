package BinaryTreeAlgorithms;

public class BTSDeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        return findNode(root, root, key);
    }

    private TreeNode findNode (TreeNode head, TreeNode node,int val){
        if(head.val == val){
            if(head.left != null){
                head.left.right = head.right;
                return head.left;
            }else if(head.right != null){
                return head.right;
            }else {return null;}
        }
        if(node == null) return head;
        if(node.left != null && node.left.val == val){
            TreeNode temp = node.left;
            if(temp.left != null){
                node.left = temp.left;
                node.left.right = temp.right;
            }else if(temp.right != null){
                node.left = temp.right;
            }else {node.left = null;}
        }
        else if(node.right != null && node.right.val == val){
            TreeNode temp = node.right;
            if(temp.left != null){
                node.right = temp.left;
                node.right.right = temp.right;
            }else if(temp.right != null){
                node.right = temp.right;
                node.right.left = null;
            }else{node.right = null;}
        }
        else if(val < node.val){
            findNode(head, node.left, val);
        }else if(val > node.val){
            findNode(head, node.right, val);
        }


        return head;
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
