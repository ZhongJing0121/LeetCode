from typing import List


class Solution:
    def hIndex(self, citations: List[int]) -> int:
        # 274.H 指数
        n = len(citations)
        countArr = [0] * (n + 1)
        
        for citation in citations:
            countArr[min(citation, n)] += 1
        
        s = 0
        for i in range(n, -1, -1):
            s += countArr[i]
            if s >= i:
                return i