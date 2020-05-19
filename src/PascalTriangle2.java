import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <=rowIndex ; i++) {
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
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        List<Integer> list = getRow(3);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
        System.out.println("");
    }

}
