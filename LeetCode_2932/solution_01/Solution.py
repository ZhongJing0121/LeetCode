from typing import List


class Solution:
    """
    2932.找出强数对的最大异或值 I
    Author: 仲景
    Date: 2024/11/4
    """

    def maximumStrongPairXor(self, nums: List[int]) -> int:
        # 排序，方便找到强数对， | x - y | > min(x, y)，如果x<=y，那么可以化简为 2x >= y
        nums.sort()
        # 保存结果、保存当前位掩码
        ans, mask = 0, 0
        # 求二进制长度
        high_bit = nums[-1].bit_length() - 1
        for i in range(high_bit, -1, -1):
            # 把掩码的当前bit位变成1
            mask |= 1 << i
            # 假设存在new_ans
            new_ans = ans | (1 << i)
            # 保存掩码对应的数字
            d = {}
            for y in nums:
                # 把当前数字i bit位后的位全变成0，因为掩码只到第i位，别的都是0
                mask_y = y & mask
                # 如果存在一个数字，和掩码异或可以得到当前数字，且那个数字的2倍大于等于y，那么这个假设的ans就是存在的，当前位可以为1
                # 异或运算满足结合交换律
                if new_ans ^ mask_y in d and d[new_ans ^ mask_y] * 2 >= y:
                    ans = new_ans
                    break
                # 如果当前掩码无法找到匹配数字，记录当前掩码和数字
                d[mask_y] = y
        return ans
