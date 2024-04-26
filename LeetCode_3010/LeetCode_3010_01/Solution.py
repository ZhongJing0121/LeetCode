from typing import List


class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        """
        3010.将数组分成最小总代价的子数组 I
        """
        min1 = min2 = 51
        for num in nums[1:]:
            if num < min1:
                min2 = min1
                min1 = num
            elif num < min2:
                min2 = num
        return min1 + min2 + nums[0]



if __name__ == '__main__':
    s = Solution()
    print(s.minimumCost([1,2,3,12]), end="\n")
