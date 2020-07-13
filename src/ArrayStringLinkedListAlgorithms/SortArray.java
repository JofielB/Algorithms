public class SortArray {

    public static int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int inside = 0;
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2 == 0){
                B[inside] = A[i];
                inside++;
            }
        }
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2 > 0){
                B[inside] = A[i];
                inside++;
            }
        }

        return B;
    }

    public static void main(String[] args) {
        int[] test = {3,1,2,4};
        Tools.printArray(sortArrayByParity(test));
    }
}
