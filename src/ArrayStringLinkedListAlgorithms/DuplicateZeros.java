public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == 0){

                for (int j = arr.length-1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] test1 = {1,0,2,3,0,4,5,0};
        duplicateZeros(test1);
        Tools.printArray(test1);

        int[] test2 = {1,2,3};
        duplicateZeros(test2);
        Tools.printArray(test2);
    }
}
