package BinarySearchTreeAlgorithms;

import java.util.*;

public class KthLargest {

    ArrayList<Integer> sortedList = new ArrayList<>();
    int index;

    public KthLargest(int k, int[] nums) {
        index = k;

        for (int current : nums) {
            sortedList.add(current);
        }

        Collections.sort(sortedList);
    }

    public int add(int val) { 
        int position = 0;
        int size = sortedList.size();
        while (position < size && val > sortedList.get(position)){
            position++;
        }
        sortedList.add(position, val);
        return sortedList.get(sortedList.size() - index);
    }

}
