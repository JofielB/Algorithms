package HashAlgorithms;

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

}
