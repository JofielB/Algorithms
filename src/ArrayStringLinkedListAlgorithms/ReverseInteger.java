import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public int reverse(int x) {
        if(x==0)return x;

        int sign = x>0 ? 1:-1;
        x = x<0 ? x*-1: x;
        char[] number = (""+x).toCharArray();

        List<String> list = new ArrayList<>();

        for (int i = number.length-1; i >= 0 ; i--) {
            list.add(String.valueOf(number[i]));
        }
        int index = 0;
        boolean firstZeroes = list.get(index).equals("0");
        while (firstZeroes){
            list.remove(index);
            firstZeroes = list.get(index).equals("0");
        }
        StringBuilder sNumber = new StringBuilder();
        for (String current: list) {
            sNumber.append(current);
        }
        int lastNumber = 0;
        try {
            lastNumber = Integer.parseInt(sNumber.toString());
        }catch (Exception e){
            return 0;
        }

        return lastNumber*sign;
    }

    public static void main(String[] args) {
        int test = -200;
        System.out.println((""+test).toCharArray());
    }
}
