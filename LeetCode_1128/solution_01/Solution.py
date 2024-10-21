from typing import List


class Solution:
    """
    1128.等价多米诺骨牌对的数量
    Author: 仲景
    Date: 2024/10/21
    """

    def numEquivDominoPairs(self, dominoes: List[List[int]]) -> int:
        # 创建一个10 * 10的矩阵
        m, res = [[0] * 10 for _ in range(10)], 0
        for a, b in dominoes:
            res += m[a][b] + m[b][a] if a != b else m[a][b]
            m[a][b] += 1
        return res
