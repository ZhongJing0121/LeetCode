from typing import List


class Solution:
    """
    2194.Excel 表中某个范围内的单元格
    Author: 仲景
    Date: 2024/11/13
    """

    def cellsInRange(self, s: str) -> List[str]:
        c1, c2, r1, r2 = s[0], s[3], int(s[1]), int(s[4])
        res = []

        for i in range(ord(c1), ord(c2) + 1):
            for j in range(r1, r2 + 1):
                res.append(f'{chr(i)}{j}')
        return res
