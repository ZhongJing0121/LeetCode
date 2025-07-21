from typing import List

# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1351. 统计有序矩阵中的负数
    链接：https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/description/
    思路：可以合理利用从左至右是降序，从上至下也是降序的特性，类似走楼梯一样，使用区间来得到所有负数的数量
    时间复杂度：O(n+m)，其中nm代表行和列的长度
    """

    def countNegatives(self, grid: List[List[int]]) -> int:
        # x,y初始化为矩阵右上角的坐标
        row_count, col_count = len(grid), len(grid[0])
        x, y, res = 0, col_count - 1, 0
        while x < row_count and y >= 0:
            # 当前位置都不是负数，左边一定不会存在负数，直接向下移动
            if grid[x][y] >= 0:
                x += 1
            # 当前位置是负数
            else:
                # 当前位置是负数，那么当前坐标向下的所有数字都是负数
                res += row_count - x
                # 当前列统计完毕，向左移动一列
                y -= 1
        return res
