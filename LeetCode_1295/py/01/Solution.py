from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1295. 统计位数为偶数的数字
    链接：https://leetcode.cn/problems/find-numbers-with-even-number-of-digits/description/
    思路：转成字符串查看长度即可
    """

    def findNumbers(self, nums: List[int]) -> int:
        return sum([1 for num in nums if len(str(num)) % 2 == 0])
