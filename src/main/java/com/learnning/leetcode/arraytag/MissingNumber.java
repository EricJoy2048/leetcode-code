package com.learnning.leetcode.arraytag;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                index = Math.abs(nums[i]) - 1;
                if(nums[index] == 0){
                    nums[index] = - Math.abs(nums[i]); 
                }else{
                    nums[index] = - Math.abs(nums[index]);
                }
            }
        }
        
        for(int  i = 0 ;i < nums.length ; i++){
            if(nums[i] >= 0)
                return i+1;
        }
        
        return 0;
    }
}
