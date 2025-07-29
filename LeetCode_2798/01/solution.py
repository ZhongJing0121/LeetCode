from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2798. 满足目标工作时长的员工数目
    链接：https://leetcode.cn/problems/number-of-employees-who-met-the-target/description/
    思路：没啥好说的
    """

    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        return len([1 for hour in hours if hour >= target])
