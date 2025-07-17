from typing import List


class Solution:
    """
    题目名称：3024. 三角形类型
    题目链接：https://leetcode.cn/problems/type-of-triangle/description/
    思路：按照题目要求判断即可，直接把3条边排序，这样更方便判断。
    判断的顺序需要注意，等边三角形一定可以组成三角形，非等边三角形需要先判断是否能够满足三角形的定义，例如[2,2,4]
    """

    def triangleType(self, nums: List[int]) -> str:
        # 给nums正序排序
        nums.sort()
        # 判断等边三角形
        if nums[0] == nums[-1]:
            return "equilateral"
        # 判断能否构成三角形
        elif nums[0] + nums[1] <= nums[-1]:
            return "none"
        # 判断等腰三角形
        elif nums[0] == nums[1] or nums[1] == nums[-1]:
            return "isosceles"
        return "scalene"
