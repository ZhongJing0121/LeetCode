from typing import List


class Solution:
    """
    665.非递减数列
    """
    
    def checkPossibility(self, nums: List[int]) -> bool:
        # 表示换没换过
        modified = False
        for i in range(len(nums) - 1):
            if nums[i] > nums[i + 1]:
                # 如果换过直接返回False
                if modified:
                    return False
                # 如果没换过，看看应该换成啥
                if i > 0 and nums[i - 1] > nums[i + 1]:
                    nums[i + 1] = nums[i]
                else:
                    nums[i] = nums[i + 1]
                modified = True
        return True