public class RemoveElement {
    public static int removeElements(int[] nums, int val){
        int c = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] != val){
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int test[] = {3,2,2,3};
        int val = 3;
        System.out.println("Elements: "+ removeElements(test,val)); // It should return a 2
        for (int i = 0; i <test.length ; i++) { //It should print [2,2,2,3]
            System.out.print("["+ test[i] +"]");
        }

    }
}
