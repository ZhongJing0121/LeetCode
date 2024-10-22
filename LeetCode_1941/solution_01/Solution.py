from collections import Counter


class Solution:
    """
    1941.检查是否所有字符出现次数相同
    Author: 仲景
    Date: 2024/10/22
    """

    def areOccurrencesEqual(self, s: str) -> bool:
        return len(set(Counter(s).values())) == 1
