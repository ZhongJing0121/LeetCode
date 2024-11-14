class Solution:
    """
    3178.找出 K 秒后拿着球的孩子
    Author: 仲景
    Date: 2024/11/14
    """

    def numberOfChild(self, n: int, k: int) -> int:
        d, m = divmod(k, n - 1)
        return m if d % 2 == 0 else n - m - 1
