public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int max ;
        if(nums.length<3){
            max = nums[0];
            for (int i = 0; i <nums.length ; i++) {
                max = Math.max(max, nums[i]);
            }
            return max;
        }else {
            int first = nums[0];
            int min = nums[0];
            for (int a: nums) {
                first = Math.max(first, a);
                min = Math.min(min, a);
            }
            int second = min;
            for(int b: nums){
                if(b != first){
                    second = Math.max(b, second);
                }
            }
            int third = min;
            for(int c: nums){
                if(c != first && c != second){
                    third = Math.max(c,third);
                }
            }
            if(second == third || second == first){
                return first;
            }
            return third;
        }
    }

    public static void main(String[] args) {
        int[] test = {3,2,1};
        System.out.println(thirdMax(test));
        int[] test2 = {1,2};
        System.out.println(thirdMax(test2));
        int[] test3 = {2, 2, 3, 1};
        System.out.println(thirdMax(test3));
    }
}
