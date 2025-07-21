from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1351. 统计有序矩阵中的负数
    链接：https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/description/
    思路：因为是递减排列的，所以只需要找到每一行从左数的第一个负数，那么这个负数后面的所有都是负数。
    所以我们可以使用二分法来查找从左往右数的第一个负数，这样内层循环的时间复杂度就变成了logN，整体时间复杂度就成了NlogN
    时间复杂度：O(nlogm)，其中n代表有几行，m代表有几列
    """

    def countNegatives(self, grid: List[List[int]]) -> int:
        res = 0
        for row in grid:
            # 遍历整行书序，找到从左到右第一个负数，那么这一行的负数个数就是(当前行的长度-第一个负数的索引)
            res += len(row) - index if (index := search_first_negative_number(row)) != -1 else 0
        return res


def search_first_negative_number(nums: List[int]) -> int:
    """
    查找数组中第一个出现的负数
    """
    left, right, index = 0, len(nums) - 1, -1
    while left <= right:
        mid = left + ((right - left) >> 1)
        # 如果num[mid]>=0，那么位置一定在mid的右边
        if nums[mid] >= 0:
            left = mid + 1
        # 如果mid小于0，位置一定在mid的左边，也有可能是mid
        else:
            index = mid
            right = mid - 1
    return index
