/*
LeetCode 1: Two Sum

Approach:
Use a HashMap to store numbers and their indices.
For each element, check if its complement exists in the map.

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

        System.out.print("Enter target: ");
        int target = in.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0; i < n; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        System.out.println("Indices:");

        System.out.println(result[0] + " " + result[1]);
    }
}
