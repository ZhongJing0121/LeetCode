from typing import List


class Solution:
    """
    500.键盘行
    """
    
    def findWords(self, words: List[str]) -> List[str]:
        # 记录结果
        res = []
        # 三行字母
        line1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}
        line2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'}
        line3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'}
        # 遍历每个单词
        for word in words:
            # 转换为小写
            newWord = word.lower()
            # 判断是否在同一行
            if all(c in line1 for c in newWord) or all(c in line2 for c in newWord) or all(c in line3 for c in newWord):
                res.append(word)
        
        return res