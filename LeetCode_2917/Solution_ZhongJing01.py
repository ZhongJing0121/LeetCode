import math
from typing import List


class Solution:
    """
    2917.找出数组中的 K-or 值
    """
    
    def findKOr(self, nums: List[int], k: int) -> int:
        res = 0
        # num最多31位
        for bit in range(0, 32):
            # 记录当前位为1的数量
            cur_bit_count = 0
            # 遍历nums
            for num in nums:
                if num & (1 << bit):
                    cur_bit_count += 1
                    # 如果当前位为1的数量大于等于k，说明当前位为1
                    if cur_bit_count >= k:
                        # 增加结果
                        res = res + int(math.pow(2, bit))
                        break
        return res