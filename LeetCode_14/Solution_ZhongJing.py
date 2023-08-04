from typing import List


class Solution:
    """
    日期：2023-08-04
    作者：仲景
    """
    
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = strs[0]
        
        for i in range(1, len(strs)):
            res = twoStrLongestCommonPrefix(res, strs[i])
        
        return res


def twoStrLongestCommonPrefix(str1: str, str2: str) -> str:
    """
    返回两个字符串的最长公共前缀
    :param str1: 第一个字符串
    :param str2: 第二个字符串
    :return: 最长公共前缀
    """
    prefix = ""
    for i in range(min(len(str1), len(str2))):
        if str1[i] == str2[i]:
            prefix += str1[i]
        else:
            break
    return prefix