from collections import Counter


class Solution:
    """
    2186.制造字母异位词的最小步骤数 II
    Author: 仲景
    Date: 2024/11/8
    """

    def minSteps(self, s: str, t: str) -> int:
        sMap, tMap = Counter(s), Counter(t)
        return sum(abs(sMap[key] - tMap[key]) for key in sMap.keys() | tMap.keys())
