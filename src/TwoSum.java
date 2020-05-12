public class TwoSum {
    private static int[] getIndex(int[] numbers, int target){
        int[] index = {0,0};
        int i = 0;
        int j = 1;

        while(j<numbers.length){
            if(numbers[i] + numbers[j] == target){
                index[0] = i+1;
                index[1] = j+1;
                return index;
            }else if(j == numbers.length-1){
                i++;
                j = i + 1;
            }else{
                j++;
            }

        }

        return index;

    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = getIndex(numbers, target);
        System.out.println("["+ result[0] + "," + result[1]  +"]");
    }
}
