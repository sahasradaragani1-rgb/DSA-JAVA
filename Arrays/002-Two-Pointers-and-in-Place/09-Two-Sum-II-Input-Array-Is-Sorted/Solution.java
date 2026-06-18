/*
LeetCode 167: Two Sum II - Input Array Is Sorted

Approach:
Use two pointers because array is sorted.

left  -> start
right -> end

If sum is too small:
move left forward

If sum is too large:
move right backward

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }


        System.out.print("Enter target: ");
        int target = in.nextInt();


        int left = 0;
        int right = n - 1;


        while(left < right) {

            int sum = numbers[left] + numbers[right];


            if(sum == target) {

                // LeetCode uses 1-based indexing
                System.out.println("Indices: " 
                    + (left + 1) + " " + (right + 1));

                return;
            }


            else if(sum < target) {
                left++;
            }


            else {
                right--;
            }
        }


        System.out.println("No pair found");
    }
}
