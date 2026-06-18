/*
LeetCode 349: Intersection of Two Arrays

Approach:
Store elements of the first array in a HashSet.
Traverse the second array and check if elements exist in the set.
Use another HashSet to store unique common elements.

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = in.nextInt();

        int[] nums1 = new int[n];

        System.out.println("Enter first array elements:");

        for (int i = 0; i < n; i++) {
            nums1[i] = in.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = in.nextInt();

        int[] nums2 = new int[m];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < m; i++) {
            nums2[i] = in.nextInt();
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        System.out.println("Intersection Elements:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
