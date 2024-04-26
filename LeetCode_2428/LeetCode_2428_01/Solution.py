from typing import List


class Solution:
    def maxSum(self, grid: List[List[int]]) -> int:
        """
        2428.沙漏的最大总和
        """
        return max(
            grid[i-1][j - 1] + grid[i-1][j] + grid[i-1][j + 1] +
            grid[i][j] +
            grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1]
            for i in range(1, len(grid) - 1)
            for j in range(1, len(grid[i]) - 1)
        )
