/*
LeetCode 217: Contains Duplicate

Approach:
Use a HashSet to store elements.
If an element already exists in the set, a duplicate is found.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int num : nums) {

            if (set.contains(num)) {
                duplicate = true;
                break;
            }

            set.add(num);
        }

        System.out.println(duplicate);
    }
}
