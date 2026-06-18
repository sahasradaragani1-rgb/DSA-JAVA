/*
Merge Two Sorted Arrays Without Extra Space

Approach:
Use Gap Method.

Time Complexity: O((n+m) log(n+m))
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = in.nextInt();

        System.out.print("Enter size of second array: ");
        int m = in.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter first sorted array:");

        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println("Enter second sorted array:");

        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < len) {

                // arr1 and arr1
                if (left < n && right < n) {

                    if (arr1[left] > arr1[right]) {
                        int temp = arr1[left];
                        arr1[left] = arr1[right];
                        arr1[right] = temp;
                    }
                }

                // arr1 and arr2
                else if (left < n && right >= n) {

                    if (arr1[left] > arr2[right - n]) {
                        int temp = arr1[left];
                        arr1[left] = arr2[right - n];
                        arr2[right - n] = temp;
                    }
                }

                // arr2 and arr2
                else {

                    if (arr2[left - n] > arr2[right - n]) {
                        int temp = arr2[left - n];
                        arr2[left - n] = arr2[right - n];
                        arr2[right - n] = temp;
                    }
                }

                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }

            gap = (gap / 2) + (gap % 2);
        }

        System.out.println("First Array:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Second Array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
