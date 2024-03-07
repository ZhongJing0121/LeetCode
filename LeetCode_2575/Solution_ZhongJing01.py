from typing import List


class Solution:
    """
    2575.找出字符串的可整除数组
    """
    
    def divisibilityArray(self, word: str, m: int) -> List[int]:
        n = len(word)
        res = []
        preNum = 0
        for i in range(n):
            preNum = (preNum * 10 + int(word[i])) % m
            res.append(int(preNum == 0))
        return res