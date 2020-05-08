import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPartitionI {

    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i+=2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int test1[] ={1,4,3,2};
        int test2[] ={1,1};
        //System.out.println(arrayPairSum(test1)+""); //It should return 4
        System.out.println(arrayPairSum(test2)+""); //It should return 1
    }
}
