public class ValidMountain {

    public static boolean validMountainArray(int[] A) {
        if(A.length<3){
            return false;
        }
        if(A[0]>A[1]){
            return false;
        }
        boolean up = true;
        for (int i = 1; i <A.length ; i++) {
            if(A[i-1]>A[i])return false;
            if(up){
                if(A[i] == A[i-1]){
                    return false;
                }else if(A[i]<A[i-1]){
                    up = false;
                }
            }else{
                if(A[i] == A[i-1] || A[i]>A[i-1]){
                    return false;
                }
            }
        }
        return !up;
    }

    public static void main(String[] args) {
        int[] test1 = {2,1};
        System.out.println(validMountainArray(test1));//It should print false
        int[] test2 = {3,5,5};
        System.out.println(validMountainArray(test2));//It should print false
        int[] test3 = {0,3,2,1};
        System.out.println(validMountainArray(test3));//It should print true
    }

}
