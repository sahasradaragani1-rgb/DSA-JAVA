/*
LeetCode 493: Reverse Pairs

Reverse Pair:
i < j and nums[i] > 2 * nums[j]

Approach:
Modified Merge Sort.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {
    static long count = 0;

    static void mergeSort(int[] nums, int left, int right) {

        if(left >= right)
            return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        countPairs(nums, left, mid, right);
        merge(nums, left, mid, right);
    }

    static void countPairs(int[] nums, int left, int mid, int right) {

        int j = mid + 1;
        for(int i = left; i <= mid; i++) {
            while(j <= right &&
                  (long)nums[i] > 2L * nums[j]) {

                j++;
            }


            count += (j - (mid + 1));
        }
    }


    static void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right) {


            if(nums[i] <= nums[j]) {

                temp[k++] = nums[i++];
            }

            else {

                temp[k++] = nums[j++];
            }
        }



        while(i <= mid) {

            temp[k++] = nums[i++];
        }


        while(j <= right) {

            temp[k++] = nums[j++];
        }



        for(int x = 0; x < temp.length; x++) {

            nums[left+x] = temp[x];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter size: ");
        int n = in.nextInt();


        int[] nums = new int[n];


        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {

            nums[i] = in.nextInt();
        }

        mergeSort(nums,0,n-1);
        System.out.println("Reverse Pairs = " + count);
    }
}
