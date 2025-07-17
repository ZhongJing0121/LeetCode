from typing import List


# noinspection PyMethodMayBeStatic
class Solution01:
    """
    题目链接：https://leetcode.cn/problems/concatenation-of-array/
    思路： Py里直接*2就可以，如果是别的语言，可能需要双指针赋值
    """

    def getConcatenation(self, nums: List[int]) -> List[int]:
        return nums * 2
