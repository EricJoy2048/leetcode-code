package com.learnning.leetcode.arraytag;

public class NonDecreasingArray {

	// 思路：分析得出，返回false的情况非常多，而返回true的情况比较好判断，我们这里判断返回true的情况：
	// 1.对于任意下标i，满足A[i] <= A[i+1]，最多只能出现一次A[i] > A[i+1]的情况
	// 2.对于唯一出现A[i] > A[i+1]的情况，要满足：对于任意m(m<i)满足A[m] <= A[i+1] 或 对于任意n(n>i+1)满足A[n]
	// >= A[i]

	// 因为i的左边数组都是增加的，所以对于任意m(m<i)满足A[m] <= A[i+1] 只要判断A[i-1] <= A[i+1]即可。
	// 因为唯一出现了一次A[i] > A[i+1]，所以对于任意n(n>i+1)满足A[n] >= A[i]，只要判断A[i+2] >= A[i]即可。
	public boolean checkPossibility(int[] nums) {
		int decNum = 0;
		int decIndex = 0;
		if (nums.length == 1)
			return true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				decNum++;
				decIndex = i;
				if (decNum > 1)
					return false;
			}
		}

		if (decNum == 0) {
			return true;
		} else {// 说明出现了一次A[i] > A[i+1]
			if (decIndex == 0 || decIndex == nums.length - 2)
				return true;

			if (nums[decIndex - 1] <= nums[decIndex + 1] || nums[decIndex + 2] >= nums[decIndex]) {
				return true;
			} else {
				return false;
			}
		}

	}
}
