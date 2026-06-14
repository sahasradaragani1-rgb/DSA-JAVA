/*
Union of Two Sorted Arrays

Approach:
Use two pointers to traverse both sorted arrays.
Add unique elements to the result.

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = in.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter sorted elements of first array:");

        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = in.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter sorted elements of second array:");

        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {

                if (union.size() == 0 ||
                    union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }

                i++;

            } else {

                if (union.size() == 0 ||
                    union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }

                j++;
            }
        }

        while (i < n) {

            if (union.size() == 0 ||
                union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }

            i++;
        }

        while (j < m) {

            if (union.size() == 0 ||
                union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }

            j++;
        }

        System.out.println("Union:");

        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
