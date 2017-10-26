package com.learnning.leetcode.arraytag;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int tmp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                j++;
                if(i - j > 0){
                    //交换i和j
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
            
        }
    }
}
