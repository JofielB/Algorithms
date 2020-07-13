import java.lang.reflect.Array;
import java.util.Arrays;

public class Squares {
    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i <A.length ; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] test1 = {-4,-1,0,3,10};
        printArray(sortedSquares(test1)); //It should print  [0,1,9,16,100]
        int[] test2 = {-7,-3,2,3,11};
        printArray(sortedSquares(test2)); //It should print [4,9,9,49,121]
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int a:array) {
            System.out.print(a+", ");
        }
        System.out.println("]"+"\n");
    }
}
