package com.learnning.leetcode.arraytag;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
	     
        if(nums.length <= 1){
            return false;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
            
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        
        boolean[] hash = new boolean[max - min + 1];
        
        for(int i=0; i<nums.length; i++) {
            
            if(hash[max - nums[i]]){
                return true;
            } 
            hash[max - nums[i]] = true;
        }
        
        return false;
    }
}