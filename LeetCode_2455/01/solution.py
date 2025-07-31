from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2455. 可被三整除的偶数的平均值
    链接：https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
    思路：所有能被3整除的偶数，换句话说就是6的倍数，因为同时满足3还是偶数，那就是同时是3和2的倍数，3和2的最小公倍数就是6
    所以求出所有能被6整除的数即可
    """

    def averageValue(self, nums: List[int]) -> int:
        # 6的倍数的总和，6的倍数的个数
        num_sum, num_len = 0, 0
        for num in nums:
            if num % 6 == 0:
                num_sum += num
                num_len += 1
        # 如果数组中没有6的倍数，返回0，避免除0异常
        return num_sum // num_len if num_len else 0
