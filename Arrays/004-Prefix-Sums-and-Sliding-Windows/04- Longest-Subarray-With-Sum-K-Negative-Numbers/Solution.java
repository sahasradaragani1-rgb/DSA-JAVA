/*
Longest Subarray With Sum K (Positive + Negative Numbers)

Approach:
Use prefix sum and store first occurrence of each sum.

If:
currentSum - k exists

then a subarray with sum k exists.

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


        System.out.print("Enter k: ");
        int k = in.nextInt();


        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;


        for(int i = 0; i < n; i++) {

            sum += arr[i];


            // subarray from 0 to i
            if(sum == k) {
                maxLen = i + 1;
            }


            // If previous prefix sum exists
            if(map.containsKey(sum - k)) {

                int length = i - map.get(sum - k);

                maxLen = Math.max(maxLen, length);
            }


            // Store first occurrence only
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }


        System.out.println("Longest length = " + maxLen);
    }
}
