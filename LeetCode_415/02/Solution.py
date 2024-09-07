class Solution:
    """
    415.字符串相加
    """

    def addStrings(self, num1: str, num2: str) -> str:
        n1_len, n2_len, d, res = len(num1), len(num2), 0, []
        p1, p2 = n1_len - 1, n2_len - 1

        while p1 >= 0 or p2 >= 0:
            n1 = n2 = 0
            if p1 >= 0:
                n1 = ord(num1[p1]) - ord('0')
            if p2 >= 0:
                n2 = ord(num2[p2]) - ord('0')
            curSum = n1 + n2 + d
            res += str(curSum % 10)
            d = curSum // 10
            p1, p2 = p1 - 1, p2 - 1

        if d != 0:
            res += "1"

        return "".join(reversed(res))
