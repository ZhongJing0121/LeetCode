class Solution:
    def sortSentence(self, s: str) -> str:
        """
        1859.将句子排序
        """
        words = s.split()
        res = [''] * len(words)
        for word in words:
            res[int(word[-1])-1] = word[:-1]
        return " ".join(res)
