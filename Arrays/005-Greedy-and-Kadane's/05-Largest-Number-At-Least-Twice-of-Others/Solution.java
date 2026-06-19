/*
LeetCode 747: Largest Number At Least Twice of Others

Approach:
Find the largest and second largest elements.
If largest >= 2 * second largest,
return its index.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        int max = -1;
        int secondMax = -1;
        int index = -1;


        for(int i = 0; i < n; i++) {

            if(nums[i] > max) {

                secondMax = max;
                max = nums[i];
                index = i;
            }
            else if(nums[i] > secondMax) {

                secondMax = nums[i];
            }
        }


        if(max >= 2 * secondMax) {
            System.out.println("Index = " + index);
        }
        else {
            System.out.println("-1");
        }
    }
}
