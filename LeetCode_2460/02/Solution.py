from typing import List


class Solution:
    """
    2460.对数组执行操作
    备注：没有额外空间解法
    """

    def applyOperations(self, nums: List[int]) -> List[int]:
        n, j = len(nums), 0
        for i in range(n - 1):
            # 如果当前数字不为0
            if nums[i]:
                # 如果和下一个相等，执行逻辑
                if nums[i] == nums[i + 1]:
                    nums[i] *= 2
                    nums[i + 1] = 0
                # j标记的数要么是i，要么是没用的数（至少和i相同）
                nums[j] = nums[i]
                j += 1
        # 处理最后一个数
        if nums[-1]:
            nums[j] = nums[-1]
            j += 1

        # 补0
        for i in range(j, n):
            nums[i] = 0

        return nums
