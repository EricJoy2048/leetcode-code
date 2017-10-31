package com.learnning.leetcode.arraytag;

import java.util.HashMap;

public class TwoSum2ArraySorted {
	public int[] twoSum(int[] numbers, int target) {
        int[] reIndex = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < numbers.length ; i++){
            map.put(numbers[i],i);
        }
        
        for(int i = 0 ; i < numbers.length ; i++){
            if(map.get(target-numbers[i]) != null && i < map.get(target-numbers[i])){
                reIndex[0] = i + 1;
                reIndex[1] = map.get(target-numbers[i]) + 1;
            }
        }
        
        return reIndex;
    }
}
