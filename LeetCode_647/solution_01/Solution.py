class Solution:
    """
    647.回文子串
    """

    def countSubstrings(self, s: str) -> int:
        # n * n的矩阵
        n = len(s)
        dp, res = [[False] * n for _ in range(n)], 0
        # 从下到上
        for i in range(n - 1, -1, -1):
            # 从左到右
            for j in range(i, n):
                if s[i] == s[j] and (j - i <= 1 or dp[i + 1][j - 1]):
                    res += 1
                    dp[i][j] = True
        return res
