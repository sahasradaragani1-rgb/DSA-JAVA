/*
LeetCode 186: Reverse Words in a String II

Approach:
1. Reverse entire array
2. Reverse each word

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {


    static void reverse(char[] arr, int left, int right) {

        while(left < right) {

            char temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;
            right--;
        }
    }



    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter string: ");
        String s = in.nextLine();


        char[] arr = s.toCharArray();


        // Step 1: reverse whole string
        reverse(arr, 0, arr.length - 1);



        // Step 2: reverse every word
        int start = 0;


        for(int i = 0; i <= arr.length; i++) {


            if(i == arr.length || arr[i] == ' ') {


                reverse(arr, start, i - 1);

                start = i + 1;
            }
        }


        System.out.println("Result:");

        System.out.println(new String(arr));
    }
}
