from typing import List


class Solution:
    """
    832.翻转图像
    Author: 仲景
    Date: 2024/10/22
    """

    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for row in image:
            # 翻转每一行同时0变1
            i, j = 0, len(row) - 1
            while i <= j:
                row[j], row[i] = row[i] ^ 1, row[j] ^ 1
                i += 1
                j -= 1
        return image
