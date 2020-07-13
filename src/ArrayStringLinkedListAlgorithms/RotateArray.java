public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] array = new int[nums.length];
        int index;
        for (int i = 0; i <nums.length ; i++) {
            index = i+k<nums.length ? i+k:(i+k)-nums.length;
            while (index>=nums.length){
                index -= nums.length;
            }
            array[index] = nums[i];
        }

        for (int i = 0; i <array.length ; i++) {
            nums[i] = array[i];
        }
    }


    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        int num1 = 3;
        rotate(array1,num1);
        for (int i = 0; i <array1.length ; i++) {//It should print [5, 6, 7, 1, 2, 3, 4]
            System.out.print("["+array1[i]+"]");
        }
        System.out.println();
        int[] array2 = {-1,-100,3,99};
        int num2 = 2;
        rotate(array2,num2);
        for (int i = 0; i <array2.length ; i++) { //It should print [3, 99, -1, -100]
            System.out.print("["+array2[i]+"]");
        }

    }
}
