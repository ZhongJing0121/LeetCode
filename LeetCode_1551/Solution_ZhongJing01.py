class Solution:
    """
    1551.使数组中所有元素相等的最小操作数
    """

    def minOperations(self, n: int) -> int:
        return sum(x - n for i in range(n) if (x := 2 * i + 1) > n)
