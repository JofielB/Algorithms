import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int COLUMNS = matrix.length;
        int ROWS;
        if(COLUMNS>0){
            ROWS = matrix[0].length;
        }else{
            ROWS = 0;
        }
        int LENGTH = COLUMNS * ROWS;
        int currentC = 0;
        int currentR = 0;
        int direction = 0;// 0 right / 1 down / 2 left / 3 Up

        ObjectArray objectArray[][] = generateObjectArray(matrix);

        for (int i = 0; i <LENGTH ; i++) {
            switch (direction){
                case 0:
                    if(currentR + 1 < ROWS && objectArray[currentC][currentR+1].isState()){
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentR++;
                    }else{
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentC++;
                        direction = 1;
                    }
                    break;
                case 1:
                    if(currentC + 1 < COLUMNS && objectArray[currentC+1][currentR].isState()){
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentC++;
                    }else{
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentR--;
                        direction = 2;
                    }
                    break;
                case 2:
                    if(currentR - 1 >= 0 && objectArray[currentC][currentR-1].isState()){
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentR--;
                    }else{
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentC--;
                        direction = 3;
                    }
                    break;
                case 3:
                    if(currentC - 1 >= 0 && objectArray[currentC-1][currentR].isState()){
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentC--;
                    }else{
                        list.add(objectArray[currentC][currentR].getNumber());
                        objectArray[currentC][currentR].setState(false);
                        currentR++;
                        direction = 0;
                    }
                    break;
            }
        }
        return list;
    }









    public static void main(String[] args) {
        int matrix[][] = {};
        List<Integer> test = spiralOrder(matrix);
        for (int i = 0; i < test.size(); i++) {
            System.out.print("[" + test.get(i) +"]");
        }
    }


    private static class ObjectArray{
        int number;
        boolean state; //true = can be tacked / false = can not be tacked

        public ObjectArray(int number, boolean state) {
            this.number = number;
            this.state = state;
        }

        public int getNumber() {
            return number;
        }

        public boolean isState() {
            return state;
        }

        public void setState(boolean state) {
            this.state = state;
        }
    }

    public static ObjectArray[][] generateObjectArray(int[][] matrix){
        int COLUMNS = matrix.length;
        int ROWS;
        if(COLUMNS>0){
            ROWS = matrix[0].length;
        }else{
            ROWS = 0;
        }

        ObjectArray newArray[][]= new ObjectArray[COLUMNS][ROWS];

        for (int i = 0; i <COLUMNS ; i++) {
            for (int j = 0; j <ROWS ; j++) {
                newArray[i][j] = new ObjectArray(matrix[i][j],true);
            }
        }
        return newArray;
    }
}
