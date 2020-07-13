public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if(i == arr.length-1){
                arr[i] = -1;
            }else {
                int max = arr[i+1];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }
        return arr;
    }

    //Second approach
    public static int[] replaceElementsTwo(int[] arr) {
        int max = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = max;
            if(temp>max){
                max = temp;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }


    public static void main(String[] args) {
        int[] test = {17,18,5,4,6,1};
        replaceElementsTwo(test);
        Tools.printArray(test);
    }
}
