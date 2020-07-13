public class Tools {

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(" " + array[i] +",");
        }
        System.out.print("]");
        System.out.println("");
    }

}
