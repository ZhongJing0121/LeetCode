class Solution:
    """
    2481.分割圆的最少切割次数
    Author: 仲景
    Date: 2024/10/23
    """

    def numberOfCuts(self, n: int) -> int:
        return n if n > 1 and n % 2 else n // 2
