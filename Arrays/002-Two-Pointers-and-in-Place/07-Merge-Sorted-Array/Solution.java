/*
LeetCode 88: Merge Sorted Array

Approach:
Merge from the end using three pointers.
Avoid overwriting values in nums1.

Time Complexity: O(m+n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int m = in.nextInt();

        System.out.print("Enter size of nums2: ");
        int n = in.nextInt();


        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];


        System.out.println("Enter nums1 elements:");

        for(int i = 0; i < m; i++) {
            nums1[i] = in.nextInt();
        }


        System.out.println("Enter nums2 elements:");

        for(int i = 0; i < n; i++) {
            nums2[i] = in.nextInt();
        }


        int i = m - 1;       // last element of nums1
        int j = n - 1;       // last element of nums2
        int k = m + n - 1;   // position to fill


        while(i >= 0 && j >= 0) {

            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } 
            else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }


        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }


        System.out.println("Merged Array:");

        for(int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
