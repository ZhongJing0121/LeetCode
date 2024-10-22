class Solution:
    """
    2309.兼具大小写的最好英文字母
    Author: 仲景
    Date: 2024/10/22
    """

    def greatestLetter(self, s: str) -> str:
        charSet = set(s)
        for i in range(90, 64, -1):
            if chr(i) in charSet and chr(i + 32) in charSet:
                return chr(i)
        return ""