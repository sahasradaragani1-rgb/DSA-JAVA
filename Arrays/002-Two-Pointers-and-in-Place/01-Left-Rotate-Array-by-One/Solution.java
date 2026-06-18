/*
Left Rotate Array By One

Approach:
Store the first element.
Shift all remaining elements one position to the left.
Place the first element at the last position.

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

        int first = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = first;

        System.out.println("Array after left rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
