from collections import Counter


class Solution:
    """
    2283.判断一个数的数字计数是否等于数位的值
    Author: 仲景
    Date: 2024/11/13
    """

    def digitCount(self, num: str) -> bool:
        count = Counter(num)
        return all(count[str(i)] == int(num[i]) for i in range(len(num)))
