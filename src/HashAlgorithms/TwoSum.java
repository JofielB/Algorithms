package HashAlgorithms;

import java.util.HashMap;

public class TwoSum {
    //Brute force
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] numbers = new int[2];
        for (int i = 0; i < size ; i++) {
            int a = nums[i];
            for (int j = i+1; j <size ; j++) {
                int b = nums[j];
                if(a+b == target) {
                    numbers[0] = i;
                    numbers[1] = j;
                }
            }
        }

        return numbers;
    }

    //A better approach
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer>  valuesMap = new HashMap<>();
        int size = nums.length;

        for (int i = 0; i <size ; i++) {
            valuesMap.put(nums[i], i);
        }

        for (int i = 0; i <size ; i++) {
            int remaining = target - nums[i];
            if(valuesMap.containsKey(remaining) && valuesMap.get(remaining) != i){
                return new int[] {i, valuesMap.get(remaining)};
            }
        }

        throw new IllegalArgumentException("No solution");
    }
    
}
