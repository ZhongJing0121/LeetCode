from typing import List


class Solution:
    """
    2496.数组中字符串的最大值
    """

    def maximumValue(self, strs: List[str]) -> int:
        return max(int(s) if s.isdigit() else len(s) for s in strs)
