/*
Count Inversions using Merge Sort

Inversion:
i < j and arr[i] > arr[j]

Approach:
Modify merge sort.
During merging, count how many elements
from left side are greater than current right element.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {


    static long count = 0;


    public static void mergeSort(int[] arr, int left, int right) {


        if(left >= right)
            return;


        int mid = left + (right-left)/2;


        mergeSort(arr, left, mid);

        mergeSort(arr, mid+1, right);


        merge(arr, left, mid, right);
    }



    public static void merge(int[] arr, int left, int mid, int right) {


        int[] temp = new int[right-left+1];


        int i = left;
        int j = mid+1;
        int k = 0;



        while(i <= mid && j <= right) {


            if(arr[i] <= arr[j]) {

                temp[k++] = arr[i++];
            }


            else {

                // All remaining left elements are greater
                count += (mid - i + 1);

                temp[k++] = arr[j++];
            }
        }



        while(i <= mid) {

            temp[k++] = arr[i++];
        }


        while(j <= right) {

            temp[k++] = arr[j++];
        }



        for(int x = 0; x < temp.length; x++) {

            arr[left+x] = temp[x];
        }
    }



    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter size: ");
        int n = in.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {

            arr[i] = in.nextInt();
        }



        mergeSort(arr,0,n-1);



        System.out.println("Inversions = " + count);
    }
}
