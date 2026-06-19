/*
LeetCode 56: Merge Intervals

Approach:
1. Sort intervals by starting value
2. Merge overlapping intervals

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter number of intervals: ");
        int n = in.nextInt();


        int[][] intervals = new int[n][2];


        System.out.println("Enter intervals:");

        for(int i = 0; i < n; i++) {

            intervals[i][0] = in.nextInt();
            intervals[i][1] = in.nextInt();
        }


        // Sort by start time
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);


        ArrayList<int[]> ans = new ArrayList<>();


        int start = intervals[0][0];
        int end = intervals[0][1];


        for(int i = 1; i < n; i++) {


            // overlapping
            if(intervals[i][0] <= end) {

                end = Math.max(end, intervals[i][1]);
            }


            else {

                ans.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }


        // add last interval
        ans.add(new int[]{start, end});


        System.out.println("Merged Intervals:");

        for(int[] x : ans) {

            System.out.println(x[0] + " " + x[1]);
        }
    }
}
