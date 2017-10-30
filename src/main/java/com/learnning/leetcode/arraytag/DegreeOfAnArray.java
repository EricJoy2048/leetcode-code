package com.learnning.leetcode.arraytag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class DegreeOfAnArray {

	public int findShortestSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer,ArrayList<Integer>> eleMap = new HashMap<Integer,ArrayList<Integer>>();
        for(int i = 0 ; i < nums.length ; i++){
            ArrayList<Integer> indexList = eleMap.get(nums[i]);
            if(indexList == null){
                indexList = new ArrayList<Integer>();
                eleMap.put(nums[i] , indexList);
            }
            indexList.add(i);
            
            max = Math.max(max , indexList.size());
            //System.out.println(max);
        }
        
        for(Entry<Integer,ArrayList<Integer>> entry : eleMap.entrySet()){
            ArrayList<Integer> indexList = entry.getValue();
            if(indexList.size() == max){
                
                min = Math.min(min , Integer.valueOf(indexList.get(indexList.size()-1).toString()) - Integer.valueOf(indexList.get(0).toString()));
            }
        }
        
        return min+1;
    }
}
