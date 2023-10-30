class Solution:
    # 191.位1的个数
    def hammingWeight(self, n: int) -> int:
        return sum(1 for i in range(32) if n & (1 << i))