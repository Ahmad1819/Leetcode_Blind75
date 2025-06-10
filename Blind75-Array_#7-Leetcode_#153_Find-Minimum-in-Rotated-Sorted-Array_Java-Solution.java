#LeetCode Blind 75: Arrays problem no. 7
#LeetCode Problem 153: Find Minimum in Rotated Sorted Array

Solution 1: with Linear Seach
TimeComplexity: O(n)
SpaceComplexity: O(1)

Solution 2: with Binary Search
TimeComplexity: O(log n)
SpaceComplexity: O(1)

class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int min = Integer.MAX_VALUE;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[l]<=nums[m]){
                min = Math.min(min, nums[l]);
                l=m+1;
            }
            else {
                min = Math.min(nums[m], nums[r]);
                r=m-1;
            }
        }
        return min;
    }
}
