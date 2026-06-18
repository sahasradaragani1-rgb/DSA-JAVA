/*
Left Rotate Array by K Places

Approach:
Use Reversal Algorithm

1. Reverse first k elements
2. Reverse remaining n-k elements
3. Reverse entire array

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

        System.out.print("Enter k: ");
        int k = in.nextInt();

        if (n == 0) {
            return;
        }

        k = k % n;

        // Reverse first k elements
        int left = 0;
        int right = k - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Reverse remaining elements
        left = k;
        right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Reverse entire array
        left = 0;
        right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Array after left rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
