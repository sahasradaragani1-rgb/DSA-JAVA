/*
LeetCode 350: Intersection of Two Arrays II

Approach:
Store frequencies of elements from first array.
Traverse second array and collect common elements.

Time Complexity: O(n + m)
Space Complexity: O(min(n, m))
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

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {

                result.add(num);

                map.put(num, map.get(num) - 1);
            }
        }

        System.out.println("Intersection:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
