from math import inf
from typing import List


class Solution:
    """
    2908.元素和最小的山形三元组 I
    Author: 仲景
    Date: 2024/11/14
    """

    def minimumSum(self, nums: List[int]) -> int:
        n, res = len(nums), inf
        # 构建后缀数组：当前索引及之后最小的数字
        suffixArr = [0] * n
        minPre = suffixArr[-1] = nums[-1]
        for i in range(n - 2, 0, -1):
            minPre = min(minPre, nums[i])
            suffixArr[i] = minPre

        minPre = nums[0]
        for i in range(1, n - 1):
            # 如果可以构成山脉数组
            if minPre < nums[i] > suffixArr[i + 1]:
                res = min(res, minPre + nums[i] + suffixArr[i + 1])
            minPre = min(nums[i], minPre)

        return res if res < inf else -1
