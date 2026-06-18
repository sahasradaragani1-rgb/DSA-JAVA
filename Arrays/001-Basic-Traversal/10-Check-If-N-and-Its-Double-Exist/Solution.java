/*
LeetCode 1346: Check If N and Its Double Exist

Approach:
Store elements in a HashSet.

For every number:
Check if its double exists.
Also check if it is double of another number.

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

        HashSet<Integer> set = new HashSet<>();

        boolean found = false;

        for (int num : arr) {

            if (set.contains(2 * num) ||
               (num % 2 == 0 && set.contains(num / 2))) {

                found = true;
                break;
            }

            set.add(num);
        }

        System.out.println(found);
    }
}
