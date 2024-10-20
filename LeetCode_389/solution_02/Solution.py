class Solution:
    """
    388.找不同
    Author: 仲景
    Date: 2024/10/20
    """

    def findTheDifference(self, s: str, t: str) -> str:
        return chr(sum(map(ord, t)) - sum(map(ord, s)))
