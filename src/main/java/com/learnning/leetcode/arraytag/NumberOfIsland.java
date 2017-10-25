package com.learnning.leetcode.arraytag;

public class NumberOfIsland {

	public int numIslands(char[][] grid) {
		int areaNum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if ("1".equals(grid[i][j] + "")) {

					areaNum += 1;
					seeConnected(grid, i, j);
				}
			}
		}

		return areaNum;
	}

	public void seeConnected(char[][] grid, int i, int j) {

		if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && "1".equals(grid[i][j] + "")) {
			grid[i][j] = '0';
			// 向上
			seeConnected(grid, i - 1, j);
			// 向左
			seeConnected(grid, i, j - 1);
			// 向下
			seeConnected(grid, i + 1, j);
			// 向右
			seeConnected(grid, i, j + 1);
		}
	}
}
