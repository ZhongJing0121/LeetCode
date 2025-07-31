from collections import Counter
from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1460. 通过翻转子数组使两个数组相等
    链接：https://leetcode.cn/problems/make-two-arrays-equal-by-reversing-subarrays/description/
    思路：可以任意交换子数组就意味着，只要两个数组相等，arr就一定可以转换成target，所以问题就变成了判断数组是否完全相同
    时间复杂度：O(n)
    空间复杂度：O(n)
    """

    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        return Counter(target) == Counter(arr)
