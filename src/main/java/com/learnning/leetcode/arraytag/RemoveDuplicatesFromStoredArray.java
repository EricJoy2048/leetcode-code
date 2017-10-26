package com.learnning.leetcode.arraytag;

public class RemoveDuplicatesFromStoredArray {

	public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] != nums[j]){
                j++;
                if(i>j){
                    nums[j] = nums[i];
                }
            }
        }
        return j+1;
    }
}
