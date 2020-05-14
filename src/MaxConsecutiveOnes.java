public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxL = 0;
        int countL = 0;

        int maxR = 0;
        int countR = 0;

        int j=0;
        int k= nums.length-1;
        while (j<=k){
            if(nums[j]==1){
                countL++;
                maxL = Math.max(countL,maxL);
            }else{
                maxL = Math.max(countL,maxL);
                countL = 0;
            }

            if(nums[k]==1){
                countR++;
                maxR = Math.max(countR,maxR);
            }else{
                maxR = Math.max(countR,maxR);
                countR = 0;
            }
            j++;
            k--;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(countL>0 && countR>0){
            return Math.max(maxL,Math.max(maxR,countL+countR));
        }
        return Math.max(maxL, maxR);
    }

    public static void main(String[] args) {
        int test[] = {1,1,0,1,1,1};
        System.out.println("Max consecutive one: " + findMaxConsecutiveOnes(test));
    }
}
