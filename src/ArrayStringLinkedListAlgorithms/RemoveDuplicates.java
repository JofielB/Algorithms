public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        int lastEncounter = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(i == 0){
                lastEncounter++;
            }else if(nums[i-1] < nums[i]){
                nums[lastEncounter] = nums[i];
                lastEncounter++;
            }

        }
        return lastEncounter;
    }

    public static void main(String[] args) {
        int[] test1 = {1,1,2};
        System.out.println(removeDuplicates(test1));
        printArray(test1);

        int[] test2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(test2));
        printArray(test2);
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
