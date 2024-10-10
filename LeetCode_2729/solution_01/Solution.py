class Solution:
    """
    2729.判断一个数是否迷人
    """

    def isFascinating(self, n: int) -> bool:
        s = str(n) + str(2 * n) + str(3 * n)
        charSet = set()
        for c in s:
            if c == '0' or c in charSet:
                return False
            charSet.add(c)
        return len(charSet) == 9
