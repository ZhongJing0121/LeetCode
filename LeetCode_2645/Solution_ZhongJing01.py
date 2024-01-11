class Solution:
    """
    2645.构造有效字符串的最少插入数
    解法一：分组
    """
    
    def addMinimum(self, word: str) -> int:
        groupCount, n = 1, len(word)
        
        for i in range(1, n):
            if word[i] <= word[i - 1]:
                groupCount += 1
        
        return groupCount * 3 - n