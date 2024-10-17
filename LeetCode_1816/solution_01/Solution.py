class Solution:
    """
    1816.截断句子
    Author: 仲景
    Date: 2024/10/17
    """
    def truncateSentence(self, s: str, k: int) -> str:
        return " ".join(s.split()[:k])