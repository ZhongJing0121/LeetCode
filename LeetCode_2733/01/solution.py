from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2733. 既不是最小值也不是最大值
    链接：https://leetcode.cn/problems/neither-minimum-nor-maximum/description/
    思路：nums中不存在相同元素，所以只需要找任意3个数字排序取中间值即可
    如果nums的长度小于3，那么一定不存在答案，直接返回-1
    """

    def findNonMinOrMax(self, nums: List[int]) -> int:
        return sorted(nums[:3])[1] if len(nums) > 2 else -1
