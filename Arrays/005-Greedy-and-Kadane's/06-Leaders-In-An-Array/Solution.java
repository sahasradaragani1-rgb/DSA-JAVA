/*
Leaders in an Array

Approach:
Traverse from right side.
Keep track of maximum element seen so far.

If current element >= maximum,
it is a leader.

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


        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;


        for(int i = n - 1; i >= 0; i--) {

            if(arr[i] >= maxRight) {

                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }


        Collections.reverse(leaders);


        System.out.println("Leaders:");

        for(int x : leaders) {
            System.out.print(x + " ");
        }
    }
}
