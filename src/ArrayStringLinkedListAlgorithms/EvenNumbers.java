public class EvenNumbers {

    public static int findNumbers(int[] nums) {
        int even = 0;
        int current;
        int count;
        for (int i = 0; i <nums.length ; i++) {
            current = nums[i];
            count = 0;
            while (current>0){
                current = current/10;
                count++;
            }
            even = count%2==0 ? even=even+1:even;
        }
        return even;
    }

    public static void main(String[] args) {
        int[] test1 = {12,345,2,6,7896};
        System.out.println(findNumbers(test1)); // It should print 2
        int[] test2 = {555,901,482,1771};
        System.out.println(findNumbers(test2)); // It should print 1

    }
}
