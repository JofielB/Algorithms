package BinarySearchTreeAlgorithms;

public class ContainsDuplicate {

    public  boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        long[] arr = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        return containsNearbyAlmostDuplicateLong(arr, k, t);
    }

    public  boolean containsNearbyAlmostDuplicateLong(long[] nums, long k, long t) {
        if (nums.length < 2) return false;
        if (k == 0 && t != 0) return false;
        if (k == 0 && t == 0) return true;

        for (int i = 0, j = 1; i < nums.length - 1; j++) {
            if (j >= nums.length) return false;

            long val1 = nums[i] - nums[j] < 0 ? (nums[i] - nums[j]) * -1 : nums[i] - nums[j];

            if (val1 <= t) return true;

            long val2 = (i - j) * -1;

            if (val2 >= k || j + 1 >= nums.length) {
                i++;
                j = i;
            }
        }

        return false;
    }
}
