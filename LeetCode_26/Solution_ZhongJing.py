from typing import List


class Solution:
    """
    日期：2023-08-04
    作者：仲景
    """
    
    def removeDuplicates(self, nums: List[int]) -> int:
        index = 0
        for i in range(len(nums)):
            if nums[i] != nums[index]:
                index += 1
                nums[index] = nums[i]
        
        return index + 1