package BinaryTreeAlgorithms;

import java.sql.Array;
import java.util.Arrays;

public class ArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length <= 0) return null;
        return createBTS(nums);
    }

    private TreeNode createBTS(int[] arr){
        if(arr.length > 0) {
            int middle = arr.length / 2;
            int[] leftArray = Arrays.copyOf(arr, middle);
            int[] rightArray = Arrays.copyOfRange(arr, middle + 1, arr.length);

            TreeNode node = new TreeNode(arr[middle]);
            node.left = createBTS(leftArray);
            node.right = createBTS(rightArray);

            return node;
        }else {
            return null;
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
        int[] test1 = {1};
        int middle = test1.length/2;

        int[] test2 = Arrays.copyOf(test1, middle);
        int[] test3 = Arrays.copyOfRange(test1, middle+1, test1.length);

        System.out.println(middle);
        printArray(test1);
        printArray(test2);
        printArray(test3);

        System.out.println(test1.length);
    }

    private static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
}
