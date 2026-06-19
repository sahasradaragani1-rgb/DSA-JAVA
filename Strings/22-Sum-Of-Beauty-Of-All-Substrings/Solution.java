/*
LeetCode 1781: Sum of Beauty of All Substrings

Beauty = Maximum Frequency - Minimum Frequency
(consider only characters that appear)

Time Complexity: O(n² * 26) ≈ O(n²)
Space Complexity: O(26) = O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.nextLine();

        int n = s.length();

        int answer = 0;

        for(int i = 0; i < n; i++) {

            int[] freq = new int[26];

            for(int j = i; j < n; j++) {

                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for(int k = 0; k < 26; k++) {

                    if(freq[k] > 0) {

                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                answer += (maxFreq - minFreq);
            }
        }

        System.out.println("Sum of Beauty = " + answer);
    }
}
