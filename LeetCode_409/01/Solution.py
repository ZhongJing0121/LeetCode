class Solution:
    """
    409.最长回文串
    """

    def longestPalindrome(self, s: str) -> int:
        # 记录最长的长度，初始为0
        max_length = 0
        # 记录各个字符出现的次数
        count = [0] * 58
        # 记录所有字母出现次数
        for char in s:
            count[ord(char) - 65] += 1
        # 遍历次数数组
        for i in count:
            max_length += i if i % 2 == 0 else i - 1
        # 如果可以白嫖，就+1
        return max_length if max_length == len(s) else max_length + 1
