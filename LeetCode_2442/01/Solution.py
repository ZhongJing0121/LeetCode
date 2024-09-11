from typing import List


class Solution:
    """
    2442.反转之后不同整数的数目
    """

    def countDistinctIntegers(self, nums: List[int]) -> int:
        numsSet = set(nums)
        for num in nums:
            numsSet.add(self.reverseNum(num))
        return len(numsSet)

    def reverseNum(self, num: int) -> int:
        """
        翻转数字
        """
        res = 0
        while num > 0:
            res = res * 10 + num % 10
            num //= 10
        return res
