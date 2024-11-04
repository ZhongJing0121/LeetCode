class Solution:
    """
    3226.使两个整数相等的位更改次数
    Author: 仲景
    Date: 2024/11/4
    """

    def minChanges(self, n: int, k: int) -> int:
        return (n ^ k).bit_count() if n & k == k else -1
