/*
LeetCode 1089: Duplicate Zeros

Approach:
Count zeros first.
Use two pointers from the end and shift elements.

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

        int zeros = 0;

        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        int i = n - 1;
        int j = n + zeros - 1;

        while (i >= 0) {

            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {

                j--;

                if (j < n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }

        System.out.println("Array after duplicating zeros:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
