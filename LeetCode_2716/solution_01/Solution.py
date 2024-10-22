class Solution:
    """
    2716.最小化字符串长度
    Author: 仲景
    Date: 2024/10/22
    """
    def minimizedStringLength(self, s: str) -> int:
        return len(set(s))