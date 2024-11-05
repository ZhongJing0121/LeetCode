class Solution:
    """
    3136.有效单词
    Author: 仲景
    Date: 2024/11/5
    """

    def isValid(self, word: str) -> bool:
        if len(word) < 3:
            return False

        s1 = set("AEIOUaeiou")
        haveVowel, haveNotVowel = False, False

        for c in word:
            # 如果是字母
            if c.isalpha():
                # 判断是不是原因
                if c in s1:
                    haveVowel = True
                else:
                    haveNotVowel = True
            elif not c.isdigit():
                return False

        return haveVowel and haveNotVowel
