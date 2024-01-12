from collections import Counter
from typing import List


class Solution:
    """
    2085.统计出现过一次的公共字符串
    """
    
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        res = 0
        # 遍历words1组成map
        map1 = Counter(words1)
        map2 = Counter(words2)
        for key in map1.keys():
            if map1[key] == 1 and map2[key] == 1:
                res += 1
        return res