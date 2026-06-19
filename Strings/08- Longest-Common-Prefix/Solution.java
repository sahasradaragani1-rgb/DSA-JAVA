/*
LeetCode 14: Longest Common Prefix

Approach:
Compare characters column by column.

Time Complexity: O(n*m)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter number of strings: ");
        int n = in.nextInt();

        in.nextLine();


        String[] words = new String[n];


        System.out.println("Enter strings:");

        for(int i = 0; i < n; i++) {

            words[i] = in.nextLine();
        }



        String prefix = "";


        for(int i = 0; i < words[0].length(); i++) {


            char ch = words[0].charAt(i);



            for(int j = 1; j < n; j++) {


                if(i >= words[j].length() ||
                   words[j].charAt(i) != ch) {


                    System.out.println("Longest Common Prefix: " + prefix);

                    return;
                }
            }


            prefix += ch;
        }



        System.out.println("Longest Common Prefix: " + prefix);
    }
}
