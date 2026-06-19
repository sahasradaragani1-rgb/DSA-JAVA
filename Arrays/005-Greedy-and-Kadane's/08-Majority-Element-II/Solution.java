/*
Majority Element II

Find all elements appearing more than n/3 times.

Approach:
Extended Boyer Moore Voting Algorithm.

At most 2 elements can have frequency > n/3.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        int candidate1 = 0;
        int candidate2 = 1;

        int count1 = 0;
        int count2 = 0;


        // Find possible candidates
        for(int num : nums) {

            if(num == candidate1) {
                count1++;
            }

            else if(num == candidate2) {
                count2++;
            }

            else if(count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }

            else if(count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }

            else {
                count1--;
                count2--;
            }
        }


        // Verify candidates
        count1 = 0;
        count2 = 0;

        for(int num : nums) {

            if(num == candidate1)
                count1++;

            if(num == candidate2)
                count2++;
        }


        if(count1 > n/3)
            System.out.print(candidate1 + " ");

        if(candidate2 != candidate1 && count2 > n/3)
            System.out.print(candidate2);
    }
}
