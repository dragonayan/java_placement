public class MoveZeros2 {
    public static void main(String[] args) {
        int[] nums = { 1,9,8,0,4};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }else{
                i++;
            }

        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
        for(int k:nums){
            System.out.println(k);
        }
    }
}
