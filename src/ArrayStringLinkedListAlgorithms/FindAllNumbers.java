import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbers {
    //First approach
    /*public static List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length<1){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int current = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(current != nums[i]){
                while( current+1 < nums[i]){
                    list.add(current+1);
                    current++;
                }
                current = nums[i];
            }
        }
        if()
        return list;
    }*/

    //Second approach
    /*public static List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length<1){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int min = 1;
        int max = nums.length;
        for (int i = min; i <=max ; i++) {
            list.add(i);
        }

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < list.size() ; j++) {
                if(nums[i] == list.get(j)){
                    list.remove(j);
                    break;
                }
            }
        }
        return list;
    }*/
    //Third approach
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] newArray = new int[nums.length];
        for (int i = 0; i <newArray.length ; i++) {
            newArray[i] = i+1;
        }
        for (int i = 0; i <nums.length ; i++) {
            newArray[nums[i]-1] = -1;
        }
        List<Integer> list = new ArrayList<>();
        for (int a: newArray) {
            if(a>0){
                list.add(a);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] test = {4,3,2,7,8,2,3,1};
        List<Integer> test1 = findDisappearedNumbers(test);
        System.out.println(test1);
    }
}
