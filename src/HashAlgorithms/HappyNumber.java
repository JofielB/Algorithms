package HashAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        if(n == 1) return true;
        Set<Integer> path = new HashSet<>();
        return exploreNumber(n, path);
    }

    private boolean exploreNumber(int number, Set<Integer> path){
        if(path.contains(number)) return  false;
        else path.add(number);

        String sNumber = number+"";
        int sum = 0;
        for (int i = 0; i <sNumber.length() ; i++) {
            int currentNUmber= Integer.parseInt(sNumber.substring(i, i+1));
            sum += (currentNUmber*currentNUmber);

        }

        if(sum == 1) return true;
        else return exploreNumber(sum, path);
    }

}
