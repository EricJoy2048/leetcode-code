package com.learnning.leetcode.arraytag;

public class MaxAreaOfIsland {

	int max = 0;
	int tmp_max = 0;

	public int maxAreaOfIsland(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					seeConnected(grid, i, j);
					max = Math.max(max, tmp_max);
					tmp_max = 0;
				}
			}
		}

		return max;
	}
	public void seeConnected(int[][] arr, int i, int j) {
		if (arr[i][j] == 1) {
			tmp_max += 1;
			arr[i][j] = 0;
			// 向上
			if (i > 0) {
				seeConnected(arr, i - 1, j);
			}
			// 向左
			if (j > 0) {
				seeConnected(arr, i, j - 1);
			}
			// 向下
			if (i < arr.length - 1) {
				seeConnected(arr, i + 1, j);
			}
			// 向右
			if (j < arr[0].length - 1) {
				seeConnected(arr, i, j + 1);
			}
		}
	}
}
