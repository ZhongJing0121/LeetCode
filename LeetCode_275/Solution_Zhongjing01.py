from typing import List


class Solution:
    def hIndex(self, citations: List[int]) -> int:
        # 275.H 指数II
        left = 1
        right = len(citations)
        
        while left <= right:
            mid = (left + right) // 2
            
            if citations[-mid] >= mid:
                left = mid + 1
            else:
                right = mid - 1
        
        return right