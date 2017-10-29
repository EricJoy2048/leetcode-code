package com.learnning.leetcode.arraytag;

public class MaximumProductOfThreeNumbers {
	public int maximumProduct(int[] nums) {
		int[] positiveNums = { -1, -1, -1 };
		int[] negativeNums = new int[3];
		int[] maxNeNums = { -1001, -1001, -1001 };

		if (nums.length == 3)
			return nums[0] * nums[1] * nums[2];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				if (nums[i] > positiveNums[0]) {
					positiveNums[2] = positiveNums[1];
					positiveNums[1] = positiveNums[0];
					positiveNums[0] = nums[i];
				} else if (nums[i] > positiveNums[1]) {
					positiveNums[2] = positiveNums[1];
					positiveNums[1] = nums[i];
				} else if (nums[i] > positiveNums[2]) {
					positiveNums[2] = nums[i];
				}
			} else {
				if (nums[i] < negativeNums[0]) {
					negativeNums[2] = negativeNums[1];
					negativeNums[1] = negativeNums[0];
					negativeNums[0] = nums[i];
				} else if (nums[i] < negativeNums[1]) {
					negativeNums[2] = negativeNums[1];
					negativeNums[1] = nums[i];
				} else if (nums[i] < negativeNums[2]) {
					negativeNums[2] = nums[i];
				}

				if (nums[i] > maxNeNums[0]) {
					maxNeNums[2] = maxNeNums[1];
					maxNeNums[1] = maxNeNums[0];
					maxNeNums[0] = nums[i];
				} else if (nums[i] > maxNeNums[1]) {
					maxNeNums[2] = maxNeNums[1];
					maxNeNums[1] = nums[i];
				} else if (nums[i] > maxNeNums[2]) {
					maxNeNums[2] = nums[i];
				}
			}

		}

		int poN = 0;
		int neN = 0;
		for (int i = 0; i < 3; i++) {

			if (positiveNums[i] >= 0)
				poN++;
			if (negativeNums[i] < 0)
				neN++;
		}

		if (poN == 3) {
			if (neN > 1) {
				return Math.max(positiveNums[0] * positiveNums[1] * positiveNums[2],
						positiveNums[0] * negativeNums[0] * negativeNums[1]);
			} else {
				return positiveNums[0] * positiveNums[1] * positiveNums[2];
			}
		} else if (poN > 0) {
			return positiveNums[0] * negativeNums[0] * negativeNums[1];
		} else {
			return maxNeNums[0] * maxNeNums[1] * maxNeNums[2];
		}

	}
}
