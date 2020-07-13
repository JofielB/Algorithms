public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] matrix) {

        boolean direction = false; //False = up  -  True =  Down
        int COLUMNS = matrix.length;
        int ROWS;
        if(matrix.length>0){
            ROWS = matrix[0].length;
        }else{
            ROWS = 0;
        }
        int newArray[] = new int[COLUMNS * ROWS];
        int currentC = 0;
        int currentR = 0;

        for (int i = 0; i < newArray.length; i++) {
            if(direction){//DOWN
                if(currentC+1 < COLUMNS && currentR-1<0){
                    newArray[i] = matrix[currentC][currentR];
                    currentC++;
                    direction = false;
                }else if(currentC+1>=COLUMNS && (currentR-1<0 || currentR-1>=0)){
                    newArray[i] = matrix[currentC][currentR];
                    currentR++;
                    direction = false;
                }else{
                    newArray[i] = matrix[currentC][currentR];
                    currentC++;
                    currentR--;
                }

            }else{//UP
                if(currentC-1<0 && currentR+1 <ROWS){
                    newArray[i] = matrix[currentC][currentR];
                    currentR++;
                    direction = true;
                }else if((currentC-1<0||currentC-1>=0)&& currentR+1>=ROWS){
                    newArray[i] = matrix[currentC][currentR];
                    currentC++;
                    direction = true;
                }else{
                    newArray[i] = matrix[currentC][currentR];
                    currentC--;
                    currentR++;
                }

            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int array[][] = {{2,3}};
        int test[] = findDiagonalOrder(array);
        for (int i = 0; i <test.length ; i++) {
            System.out.print("[ " + test[i] + " ]");
        }
    }

}
