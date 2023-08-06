from typing import List


class Solution:
    """
    啊？还有这好事？
    日期：2023-08-07
    作者：仲景
    """
    
    def reverseString1(self, s: List[str]) -> None:
        return s.reverse()
    
    def reverseString2(self, s: List[str]) -> None:
        left, right = 0, len(s) - 1
        while left < right:
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1
        
        return s