/*
Longest Subarray With Sum K (Positive Numbers)

Approach:
Use Sliding Window (Two Pointers).

If sum < k:
    Expand window

If sum > k:
    Shrink window

If sum == k:
    Update maximum length

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter K: ");
        int k = in.nextInt();

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println("Longest Length = " + maxLen);
    }
}
