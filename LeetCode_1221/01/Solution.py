class Solution:
    """
    1221.分割平衡字符串
    """

    def balancedStringSplit(self, s: str) -> int:
        l, r, res = 0, 0, 0
        for char in s:
            if char == 'L':
                l += 1
            elif char == 'R':
                r += 1
            if l == r and l != 0 and r != 0:
                res += 1
        return res
