from itertools import zip_longest


class Solution:
    """
    1417.重新格式化字符串
    Author: 仲景
    Date: 2024/10/22
    """

    def reformat(self, s: str) -> str:
        l1, l2 = [], []
        for c in s:
            if c.isdigit():
                l1.append(c)
            if c.isalpha():
                l2.append(c)
        if len(l1) < len(l2):
            l1, l2 = l2, l1
        return ''.join(x + y for x, y in zip_longest(l1, l2, fillvalue='')) if abs(len(l1) - len(l2)) < 2 else ""
