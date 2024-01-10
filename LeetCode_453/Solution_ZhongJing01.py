from typing import List


class Solution:
    """
    453.最小操作次数使数组元素相等
    """
    
    def minMoves(self, nums: List[int]) -> int:
        """
        假设：
            1.最终数组中的每个数都是end
            2.一共增加了k次，
        则：
            1.一共满足表达式：sum + k * (n - 1) = end * n
            
        因为:如果想要达成最终数组，每次增加时候当前数组的最小值一定会存在于+1的数组里，
        如果最小值不存在的话，那么最小值和其他数字的差距会+1，永远不会达到最终数组状态
        所以最小值必定每次都要+1
        所以可以得出：end = min + k
        """
        return sum(nums) - len(nums) * min(nums) if len(nums) != 1 else 0