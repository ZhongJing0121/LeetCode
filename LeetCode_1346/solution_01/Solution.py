from typing import List


class Solution:
    """
    1346.检查整数及其两倍数是否存在
    """

    def checkIfExist(self, arr: List[int]) -> bool:
        # hash表
        numSet = set()
        for i in arr:
            if i * 2 in numSet or i / 2 in numSet:
                return True
            numSet.add(i)
        return False
