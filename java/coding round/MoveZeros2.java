public class MoveZeros2 {
    public static void main(String[] args) {
        int[] nums = { 1, 9, -8, 0, 4, 7, -7, 1 };
        int j = 0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[j] = nums[i];
                j++;
            }

        }
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] < 0) {
                ans[j] = nums[l];
                j++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0 && nums[k] > 0) {
                ans[j] = nums[k];
                j++;
            }
        }

        for (int k : ans) {
            System.out.print(k + " ");
        }
    }
}
