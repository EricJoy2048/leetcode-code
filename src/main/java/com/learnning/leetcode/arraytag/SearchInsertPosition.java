package com.learnning.leetcode.arraytag;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)return 0;
        return binarySearch(nums , 0 , nums.length-1 , target);
        
    }
    
    public int binarySearch(int[] nums , int left , int right , int target){
        if(right>=left){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) return binarySearch(nums , mid + 1, right ,target);
            if(nums[mid] > target) return binarySearch(nums , left , mid - 1, target);
            
        }
        return left;
    }
}
