class Solution:
    """
    1876.长度为三且各字符不同的子字符串
    Author: 仲景
    Date: 2024/11/4
    """

    def countGoodSubstrings(self, s: str) -> int:
        return sum(len(set(s[i:i + 3])) == 3 for i in range(len(s) - 2))
