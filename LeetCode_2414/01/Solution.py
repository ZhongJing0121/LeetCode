class Solution:
    """
    2414.最长的字母序连续子字符串的长度
    """

    def longestContinuousSubstring(self, s: str) -> int:
        maxLen = curLen = 1
        for i in range(1, len(s)):
            curLen = curLen + 1 if ord(s[i]) - ord(s[i - 1]) == 1 else 1
            maxLen = max(maxLen, curLen)
        return maxLen
