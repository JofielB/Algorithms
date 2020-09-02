package HashAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int current: nums) {
            if(hashSet.contains(current)) return true;
            hashSet.add(current);
        }
        return false;
    }
}
