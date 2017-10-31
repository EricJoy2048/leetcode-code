package com.learnning.leetcode.arraytag;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int position = 0;
        if(nums.length == 0)return 0;
        for(int i = 0;  i < nums.length ; i++){
            if(nums[i] >= target){
                break;
            }
            position++;
        }
        
        return position;
    }
}
