from itertools import zip_longest


class Solution:
    """
    1768.交替合并字符串
    Author: 仲景
    Date: 2024/10/20
    """

    def mergeAlternately(self, word1: str, word2: str) -> str:
        res, len1, len2, index = [], len(word1), len(word2), 0
        while index < len1 or index < len2:
            if index < len1:
                res.append(word1[index])
            if index < len2:
                res.append(word2[index])
            index += 1
        return "".join(res)
