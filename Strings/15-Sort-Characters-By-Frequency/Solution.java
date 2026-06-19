/*
LeetCode 451: Sort Characters By Frequency

Approach:
1. Count frequency of characters
2. Use max heap based on frequency
3. Build answer

Time Complexity: O(n log k)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter string: ");
        String s = in.nextLine();



        HashMap<Character, Integer> freq = new HashMap<>();


        for(char ch : s.toCharArray()) {

            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }



        PriorityQueue<Character> pq =
            new PriorityQueue<>(
                (a,b) -> freq.get(b) - freq.get(a)
            );



        for(char ch : freq.keySet()) {

            pq.add(ch);
        }



        StringBuilder ans = new StringBuilder();



        while(!pq.isEmpty()) {


            char ch = pq.poll();


            int count = freq.get(ch);


            while(count-- > 0) {

                ans.append(ch);
            }
        }



        System.out.println("Sorted by frequency:");

        System.out.println(ans);
    }
}
