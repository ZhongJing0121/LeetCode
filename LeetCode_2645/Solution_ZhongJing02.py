class Solution:
    """
    2645.构造有效字符串的最少插入数
    解法二：宇宙的尽头是枚举
    """
    
    def addMinimum(self, word: str) -> int:
        n = len(word)
        word = word.replace('abc', 'ZZZ')
        word = word.replace('bc', 'ZZZ')
        word = word.replace('ab', 'ZZZ')
        word = word.replace('ac', 'ZZZ')
        word = word.replace('a', 'ZZZ')
        word = word.replace('b', 'ZZZ')
        word = word.replace('c', 'ZZZ')
        return len(word) - n