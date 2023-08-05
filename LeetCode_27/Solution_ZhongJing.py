from typing import List


class Solution:
    """
    日期：2023-08-04
    作者：仲景
    """
    
    def removeElement(self, nums: List[int], val: int) -> int:
        # 双指针，左指针用于遍历，右指针用于置换
        left, right = 0, len(nums) - 1
        
        # 遍历数组
        while left <= right:
            if nums[left] == val:
                nums[left], nums[right] = nums[right], nums[left]
                right -= 1
            else:
                left += 1
        
        return left