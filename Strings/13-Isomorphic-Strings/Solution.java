/*
LeetCode 205: Isomorphic Strings

Approach:
Maintain one-to-one mapping between characters.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String s = in.nextLine();


        System.out.print("Enter second string: ");
        String t = in.nextLine();



        if(s.length() != t.length()) {

            System.out.println("Not Isomorphic");
            return;
        }



        HashMap<Character, Character> map1 = new HashMap<>();

        HashMap<Character, Character> map2 = new HashMap<>();



        boolean valid = true;



        for(int i = 0; i < s.length(); i++) {


            char a = s.charAt(i);
            char b = t.charAt(i);



            // s -> t mapping
            if(map1.containsKey(a) &&
               map1.get(a) != b) {

                valid = false;
                break;
            }



            // t -> s mapping
            if(map2.containsKey(b) &&
               map2.get(b) != a) {

                valid = false;
                break;
            }



            map1.put(a,b);
            map2.put(b,a);
        }



        System.out.println(
            valid ? "Isomorphic" : "Not Isomorphic"
        );
    }
}
