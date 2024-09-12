from typing import List


class Solution:
    """
    1408.数组中的字符串匹配
    """

    def stringMatching(self, words: List[str]) -> List[str]:
        res = []
        for i, v in enumerate(words):
            for j, v2 in enumerate(words):
                if i != j and v in v2:
                    res.append(v)
                    break
        return res
