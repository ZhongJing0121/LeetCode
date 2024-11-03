from typing import List


class Solution:
    """
    49.字母异位词分组
    Author: 仲景
    Date: 2024/11/3
    """

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        m = {}
        for s in strs:
            sortedStr = ''.join(sorted(s))
            if sortedStr not in m:
                m[sortedStr] = []
            m[sortedStr].append(s)
        return list(m.values())
