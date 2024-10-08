from typing import List


class Solution:
    """
    2460.对数组执行操作
    备注：使用额外空间解法
    """

    def applyOperations(self, nums: List[int]) -> List[int]:
        n, j, res = len(nums), 0, [0] * len(nums)
        for i in range(n - 1):
            # 如果当前数字不为0
            if nums[i]:
                # 如果和下一个相等，执行逻辑
                if nums[i] == nums[i + 1]:
                    nums[i] *= 2
                    nums[i + 1] = 0
                # 添加当前数字到res
                res[j] = nums[i]
                j += 1
        # 最后一位直接补到最后（因为0都在最后，不需要判断是否非0）
        res[j] = nums[-1]
        return res
