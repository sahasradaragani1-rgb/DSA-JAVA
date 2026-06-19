/*
LeetCode 557: Reverse Words in a String III

Approach:
Reverse every word individually.
Keep spaces in the same position.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter string: ");
        String s = in.nextLine();


        char[] arr = s.toCharArray();


        int start = 0;


        for(int i = 0; i <= arr.length; i++) {


            // word ends at space or string end
            if(i == arr.length || arr[i] == ' ') {


                int left = start;
                int right = i - 1;


                while(left < right) {


                    char temp = arr[left];

                    arr[left] = arr[right];

                    arr[right] = temp;


                    left++;
                    right--;
                }


                start = i + 1;
            }
        }


        System.out.println("Result:");

        System.out.println(new String(arr));
    }
}
