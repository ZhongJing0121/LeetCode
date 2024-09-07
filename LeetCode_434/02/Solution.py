class Solution:
    """
    434.字符串中的单词数
    """

    def countSegments(self, s: str) -> int:
        return len([sub for sub in s.split(" ") if sub])
