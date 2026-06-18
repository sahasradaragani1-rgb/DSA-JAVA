/*
Check if Array is Sorted (Non-decreasing order)

Approach:
Traverse the array and check if any element is greater than the next element.
If yes → array is not sorted.

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

        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        System.out.println(sorted);
    }
}
