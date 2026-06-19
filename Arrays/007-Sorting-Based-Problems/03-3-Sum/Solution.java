/*
LeetCode 15: 3Sum

Approach:
1. Sort array
2. Fix one element
3. Use two pointers for remaining two

Time Complexity: O(n²)
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


        Arrays.sort(nums);


        ArrayList<List<Integer>> ans = new ArrayList<>();


        for(int i = 0; i < n - 2; i++) {


            // skip duplicate first elements
            if(i > 0 && nums[i] == nums[i-1])
                continue;


            int left = i + 1;
            int right = n - 1;


            while(left < right) {


                int sum = nums[i] + nums[left] + nums[right];


                if(sum == 0) {

                    ans.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));


                    // skip duplicates
                    while(left < right &&
                          nums[left] == nums[left+1])
                        left++;


                    while(left < right &&
                          nums[right] == nums[right-1])
                        right--;


                    left++;
                    right--;
                }


                else if(sum < 0) {

                    left++;
                }


                else {

                    right--;
                }
            }
        }


        System.out.println("Triplets:");

        for(List<Integer> x : ans) {

            System.out.println(x);
        }
    }
}
