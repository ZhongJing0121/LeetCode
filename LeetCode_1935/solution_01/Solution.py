class Solution:
    """
    1935.可以输入的最大单词数
    """

    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        return len([s for s in text.split() if len(set(s) & set(brokenLetters)) == 0])
