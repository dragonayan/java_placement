import java.util.*;

public class Move_zeros {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 8, 7, 0, 4, 0, 4, 5, 63 };
        int m = 0;
        int j = nums.length - 1;

        for (int i = 0; i <= j; i++) {
            if (nums[i] != 0) {
                swap(nums, i, m);
                m++;
            }

        }
        int count = 0;
        for (int k : nums) {
            if (k == 0) {
                count++;
            }
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < count - 1; i++) {
            arr[i] = 0;
        }
        int o = 0;
        for (int k = 0; k < arr.length - count; k++) {
            arr[m] = nums[k];
            o++;
        }
        for (int l : arr) {
            System.out.print(l + " ");
        }

    }
}
