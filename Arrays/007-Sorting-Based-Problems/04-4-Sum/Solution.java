/*
LeetCode 18: 4Sum

Approach:
1. Sort array
2. Fix first two elements
3. Use two pointers for remaining two

Time Complexity: O(n³)
Space Complexity: O(1) (excluding output)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        System.out.print("Enter target: ");
        int target = in.nextInt();


        Arrays.sort(nums);


        ArrayList<List<Integer>> ans = new ArrayList<>();


        for(int i = 0; i < n - 3; i++) {


            // skip duplicate i
            if(i > 0 && nums[i] == nums[i-1])
                continue;


            for(int j = i + 1; j < n - 2; j++) {


                // skip duplicate j
                if(j > i + 1 && nums[j] == nums[j-1])
                    continue;


                int left = j + 1;
                int right = n - 1;


                while(left < right) {


                    long sum = (long)nums[i]
                             + nums[j]
                             + nums[left]
                             + nums[right];


                    if(sum == target) {


                        ans.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ));


                        while(left < right &&
                              nums[left] == nums[left+1])
                            left++;


                        while(left < right &&
                              nums[right] == nums[right-1])
                            right--;


                        left++;
                        right--;
                    }


                    else if(sum < target) {

                        left++;
                    }


                    else {

                        right--;
                    }
                }
            }
        }


        System.out.println("Quadruplets:");

        for(List<Integer> x : ans) {
            System.out.println(x);
        }
    }
}
