/*
Largest Subarray With Sum 0

Approach:
Use Prefix Sum + HashMap.

If the same prefix sum occurs again,
the subarray between those indices has sum 0.

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

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++) {

            sum += arr[i];

            if(sum == 0) {
                maxLen = i + 1;
            }

            if(map.containsKey(sum)) {

                int len = i - map.get(sum);

                maxLen = Math.max(maxLen, len);
            }
            else {

                map.put(sum, i);
            }
        }

        System.out.println("Largest Length = " + maxLen);
    }
}
