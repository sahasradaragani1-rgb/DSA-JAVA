/*
Reverse String

Approach:
Use two pointers:
left -> start
right -> end

Swap characters until they meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter string: ");
        String s = in.nextLine();


        char[] arr = s.toCharArray();


        int left = 0;
        int right = arr.length - 1;


        while(left < right) {


            char temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;


            left++;
            right--;
        }


        System.out.println("Reversed String:");

        System.out.println(new String(arr));
    }
}
