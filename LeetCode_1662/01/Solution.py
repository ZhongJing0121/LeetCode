from typing import List


class Solution:
    """
    1662.检查两个字符串数组是否相等
    """

    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        return ''.join(word1) == ''.join(word2)
