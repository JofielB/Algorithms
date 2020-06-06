import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int checks = 0;
        int[] sortedArray = new int[heights.length];
        for (int i = 0; i <heights.length ; i++) {
            sortedArray[i] = heights[i];
        }
        Arrays.sort(sortedArray);
        for (int i = 0; i <sortedArray.length ; i++) {
            if(sortedArray[i] != heights[i]) checks++;
        }
        return  checks;
    }

    public static void main(String[] args) {
        int[] test = {1,1,4,2,1,3};
        System.out.println(heightChecker(test));//It should print 3
    }
}
