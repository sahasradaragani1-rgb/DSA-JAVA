/*
Leaders in an Array

A leader is an element that is greater than
all elements to its right.

Approach:
Traverse from right to left while maintaining
the maximum element seen so far.

Time Complexity: O(n)
Space Complexity: O(n)
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

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = arr[n - 1];

        leaders.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }

        Collections.reverse(leaders);

        System.out.println("Leaders:");

        for (int num : leaders) {
            System.out.print(num + " ");
        }
    }
}
