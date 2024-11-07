from typing import List


class Solution:
    """
    2164.对奇偶下标分别排序
    Author: 仲景
    Date: 2024/11/7
    """

    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        flag = True
        for i in range(len(nums)):
            cur = i
            while cur - 2 >= 0 and (nums[cur] < nums[cur - 2]) == flag:
                nums[cur], nums[cur - 2] = nums[cur - 2], nums[cur]
                cur -= 2
            flag = not flag
        return nums
