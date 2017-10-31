package com.learnning.leetcode.arraytag;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxNum = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            if(max < map.get(nums[i])){
                max = map.get(nums[i]);
                maxNum = nums[i];
            }
        }
        return maxNum;
    }		
}
