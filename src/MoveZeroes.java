import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int lastIndex = 0;
        int temp;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                temp = nums[lastIndex];
                nums[lastIndex] = nums[i];
                nums[i] = temp;
                lastIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] test1 = {0,1,0,3,12};
        moveZeroes(test1);
        printArray(test1);
    }


    private static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(" " + array[i] +",");
        }
        System.out.print("]");
        System.out.println("");
    }
}
