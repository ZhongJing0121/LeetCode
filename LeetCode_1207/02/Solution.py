from collections import Counter
from typing import List


class Solution:
    """
    1207.独一无二的出现次数
    """

    def uniqueOccurrences(self, arr: List[int]) -> bool:
        numMap = Counter(arr)
        return len(numMap) == len(set(numMap.values()))
