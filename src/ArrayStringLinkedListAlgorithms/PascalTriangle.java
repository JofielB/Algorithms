import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j <i+1 ; j++) {
                if(j == 0 || j == i) {
                    list.get(i).add(1);
                }else{
                    List<Integer> listBefore = list.get(i-1);
                    int upLeft;
                    if(j-1>=0){
                        upLeft = listBefore.get(j-1);
                    }else{
                        upLeft = 0;
                    }
                    int upRight;
                    if(j<listBefore.size()){
                        upRight = listBefore.get(j);
                    }else{
                        upRight = 0;
                    }

                    list.get(i).add(upLeft+upRight);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> test = generate(10);
        for (int i = 0; i <test.size() ; i++) {
            for (int j = 0; j <test.get(i).size() ; j++) {
                System.out.print("["+ test.get(i).get(j) +"]");
            }
            System.out.println("");
        }
    }
}
