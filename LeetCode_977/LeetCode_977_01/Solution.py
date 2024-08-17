from typing import List


class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        """
        977.有序数组的平方
        """
        index = -1
        for i, num in enumerate(nums):
            if num < 0:
                index = i
            else:
                break

        left, right = index, index + 1

        res = list()

        while left >= 0 or right < len(nums):
            if left < 0:
                res.append(nums[right] * nums[right])
                right += 1
            elif right == len(nums):
                res.append(nums[left] * nums[left])
                left -= 1
            else:
                leftAbs = nums[left] * nums[left]
                rightAbs = nums[right] * nums[right]
                if leftAbs < rightAbs:
                    res.append(leftAbs)
                    left -= 1
                else:
                    res.append(rightAbs)
                    right += 1

        return res
