from collections import Counter


class Solution:
    """
    242.有效的字母异位词
    Author: 仲景
    Date: 2024/10/20
    """
    def isAnagram(self, s: str, t: str) -> bool:
        return Counter(s) == Counter(t)
