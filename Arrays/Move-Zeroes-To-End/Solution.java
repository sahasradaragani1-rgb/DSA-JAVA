/*
Move Zeroes To End

Approach:
Use two pointers.
Place all non-zero elements at the beginning while maintaining their order.
Fill the remaining positions with zeroes.

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

        int k = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        while (k < n) {
            arr[k] = 0;
            k++;
        }

        System.out.println("Array after moving zeroes to end:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
