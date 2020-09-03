package HashAlgorithms;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        if(length == 1) return nums[0];
        Arrays.sort(nums);
        for (int i = 0, j = 1; i <nums.length ; i+=2, j+=2) {
            if(j >= nums.length || nums[i] != nums[j])return nums[i];
        }
        return nums[0];
    }
}
