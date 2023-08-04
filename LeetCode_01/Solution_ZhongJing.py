from typing import List


class Solution:
    """
    题目：1.两数之和
    日期：2023-08-04
    作者：仲景
    """
    
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # 创建一个map
        numMap = {}
        for i in range(len(nums)):
            cur = nums[i]
            if target - cur in numMap:
                return [i, numMap[target - cur]]
            numMap[cur] = i