package HashAlgorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> intersections = new HashSet<>();
        for (int a: nums1) {
            hashSet.add(a);
        }
        for (int b : nums2) {
            if(hashSet.contains(b)) intersections.add(b);
        }
        int size = intersections.size();

        Integer[] objResult = new Integer[size];
        intersections.toArray(objResult);

        int[] result = new int[size];
        for (int i = 0; i <size ; i++) {
            result[i] = objResult[i];
        }
        return result;
    }

}
