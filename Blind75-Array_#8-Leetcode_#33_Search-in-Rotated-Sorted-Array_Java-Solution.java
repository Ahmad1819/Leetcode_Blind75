#LeetCode Blind 75: Arrays problem no. 8
#LeetCode Problem 33: Search in Rotated Sorted Array

Solution 1: with Linear Seach
TimeComplexity: O(n)
SpaceComplexity: O(1)

Solution 2: with Binary Search
TimeComplexity: O(log n)
SpaceComplexity: O(1)

class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            if(target == nums[m]) return m;
            else {
                if(nums[l]<=nums[m]) {
                    if(nums[l] <= target && target < nums[m]){
                        r = m - 1;
                    } else l = m + 1;
                }
                else {
                    if(nums[m] < target && target <= nums[r]){
                        l = m + 1;
                    } else r= m-1;
                }
            }
        }
        return -1;
    }
}
