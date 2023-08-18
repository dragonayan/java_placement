import java.util.*;

public class LongestXorSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Close the scanner
        scanner.close();

        // Initialize a variable to keep track of the maximum length
        int maxLength = 0;
        
        // Loop through each starting index of the subarray
        for (int i = 0; i < N; i++) {
            int xorSum = 0;
            int sum = 0;
            
            // Loop through each ending index of the subarray
            for (int j = i; j < N; j++) {
                xorSum ^= arr[j];
                sum += arr[j];
                
                // Check if the XOR sum of the subarray equals its sum
                if (xorSum == sum) {
                    // Update the maximum length if the current subarray length is larger
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        // Print the maximum length of the subarray
        System.out.println(maxLength);
    }
}
