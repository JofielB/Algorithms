public class MinimumSizeSubArraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        int min=0;
        int sum = 0;
        int count = 1;

        for (int i = 0, j= 1; i <nums.length ; j++) {
            if(j>=nums.length && sum < s){
                return min;
            }
            if(nums[i]>=s){
                return 1;
            }else{
                sum += nums[j];
                count++;
                if(sum+nums[i]>=s){
                    min = min==0 ? count:Math.min(min,count);
                    count = 1;
                    i++;
                    j = i;
                    sum = 0;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int s1 = 7;
        int[] test1 = {2,3,1,2,4,3};
        int s2 = 15;
        int[] test2 = {1,2,3,4,5};
        System.out.println("Test 1: "+ minSubArrayLen(s1, test1)); //It should print 2
        System.out.println("Test 2: "+ minSubArrayLen(s2, test2)); //It should print 5
    }
}
