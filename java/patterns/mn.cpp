#include <iostream>
#include <vector>
using namespace std;

int maxMemoryBlocks(int length, int A, int B, int C) {
    vector<int> dp(length + 1, 0);

    for (int i = 1; i <= length; i++) {
        if (i >= A) dp[i] = max(dp[i], dp[i - A] + 1);
        if (i >= B) dp[i] = max(dp[i], dp[i - B] + 1);
        if (i >= C) dp[i] = max(dp[i], dp[i - C] + 1);
    }

    return dp[length];
}

int main() {
    int length = 5;
    int A = 5;
    int B = 3;
    int C = 2;

    // Calculate and print the maximum number of memory blocks
    int result = maxMemoryBlocks(length, A, B, C);
    cout << result << endl; // Output: 2

    return 0;
}
