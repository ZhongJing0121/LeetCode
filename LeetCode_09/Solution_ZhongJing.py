"""
日期：2023年08月04日
作者：仲景
"""


class Solution:
    def isPalindrome(self, x: int) -> bool:
        # 如果是负数，一定不是回文数
        if x < 0:
            return False
        
        num = x
        reverseNum = 0
        while num > 0:
            reverseNum = reverseNum * 10 + num % 10
            num //= 10
        
        return reverseNum == x