/*
LeetCode 560: Subarray Sum Equals K

Approach:
Use Prefix Sum + HashMap.

If:
currentSum - k exists

then a subarray with sum k exists.

Store frequency of prefix sums.

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

        System.out.print("Enter k: ");
        int k = in.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Count = " + count);
    }
}
