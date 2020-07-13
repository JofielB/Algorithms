import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresSorted {

    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i <A.length ; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] test = {-4,-1,0,3,10};
        Tools.printArray(sortedSquares(test));
    }

}
