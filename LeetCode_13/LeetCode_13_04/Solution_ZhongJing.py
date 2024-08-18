"""
日期：2023-08-04
作者：仲景
"""


class Solution:
    def romanToInt(self, s: str) -> int:
        # 创建一个map
        romanMap = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000,
        }
        
        # 遍历str
        res = 0
        for i in range(len(s) - 1):
            # 如果当前符号比后一个小，说明是后一个-当前
            if romanMap[s[i]] < romanMap[s[i + 1]]:
                res -= romanMap[s[i]]
            # 如果当前符号>=后一个，说明是+当前
            else:
                res += romanMap[s[i]]
        # 最后一个无论如何都是+
        res += romanMap[s[len(s) - 1]]
        
        return res