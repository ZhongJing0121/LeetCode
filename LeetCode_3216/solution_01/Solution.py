from itertools import pairwise


class Solution:
    """
    3216.交换后字典序最小的字符串
    Author: 仲景
    Date: 2024/10/22
    """

    def getSmallestString(self, s: str) -> str:
        charArray = list(s)
        for i in range(len(s) - 1):
            cur, next = int(charArray[i]), int(charArray[i + 1])
            if cur % 2 == next % 2 and next < cur:
                charArray[i], charArray[i + 1] = charArray[i + 1], charArray[i]
                break
        return ''.join(charArray)
