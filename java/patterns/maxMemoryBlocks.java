import java.util.*;
public class maxMemoryBlocks {

    public static int maxMemoryBlocks(int length, int A, int B, int C) {
       
        int[] lengths = { A, B, C };
        Arrays.sort(lengths);
        A = lengths[2];
        B = lengths[1];
        C = lengths[0];

       
        int maxBlocks = 0;
        int aBlocks = length / A;

       
        for (int i = 0; i <= aBlocks; i++) {
            int bLength = (length - i * A) / B;
            for (int j = 0; j <= bLength; j++) {
                int cLength = (length - i * A - j * B) / C;
                maxBlocks = Math.max(maxBlocks, i + j + cLength);
            }
        }

        return maxBlocks;
    }

    public static void main(String[] args) {
        int length = 9;
        int A = 8;
        int B = 3;
        int C = 2;

        // Calculate and print the maximum number of memory blocks
        int result = maxMemoryBlocks(length, A, B, C);
        System.out.println(result); // Output: 2
    }
}
