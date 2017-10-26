package com.learnning.leetcode.arraytag;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {

		int j = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				j++;
				if (i > j) {
					nums[j] = nums[i];
				}
			}
		}
		return j + 1;
	}
}
