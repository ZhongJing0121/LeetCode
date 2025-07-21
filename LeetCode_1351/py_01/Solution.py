from typing import List

# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1351. 统计有序矩阵中的负数
    链接：https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/description/
    思路：暴力统计负数的个数即可
    时间复杂度：O(nm)，其中n和m代表有几行和有几列
    """

    def countNegatives(self, grid: List[List[int]]) -> int:
        return sum([1 if num < 0 else 0 for num in [col for row in grid for col in row]])
