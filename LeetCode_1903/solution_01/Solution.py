class Solution:
    """
    1903.字符串中的最大奇数
    Author: 仲景
    Date: 2024/11/4
    """

    def largestOddNumber(self, num: str) -> str:
        seen = set("13579")
        for i in range(len(num) - 1, -1, -1):
            if num[i] in seen:
                return num[:i + 1]
        return ""
