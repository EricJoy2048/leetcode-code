package com.learnning.leetcode.arraytag;

public class LongestContinuousIncreasingSubsequence {
	public int findLengthOfLCIS(int[] nums) {
        int maxSubArrLength = Integer.MIN_VALUE;
        int subArrLength = 1;
        
        if(nums.length <= 1)return nums.length;
        
        for(int i = 1 ; i < nums.length ; i++){
            int currDiff = nums[i] - nums[i-1];
            if(currDiff <= 0){
                maxSubArrLength = Math.max(maxSubArrLength , subArrLength);
                subArrLength = 1;
            }else{
                subArrLength++;
            }
            
        }
        maxSubArrLength = Math.max(maxSubArrLength , subArrLength);
        return maxSubArrLength;
    }
}
