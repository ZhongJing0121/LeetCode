from typing import List


class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        """
        1684.统计一致字符串的数目
        """
        return sum(1 for word in words if all(w in set(allowed) for w in word))
