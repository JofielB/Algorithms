import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j= 0; i <m+n ; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] test1 = {1,2,3,0,0,0};
        int m = 3;
        int[] test11 = {2,5,6};
        int n = 3;
        merge(test1,m,test11,n);
        Tools.printArray(test1);
    }
}
