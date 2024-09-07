from typing import List


class Solution:
    """
    2108.找出数组中的第一个回文字符串
    """

    def firstPalindrome(self, words: List[str]) -> str:
        for word in words:
            if word == word[::-1]:
                return word
        return ""
