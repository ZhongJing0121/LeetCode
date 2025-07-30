from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：3184. 构成整天的下标对数目 I
    链接：https://leetcode.cn/problems/count-pairs-that-form-a-complete-day-i/description/
    思路：使用数组模仿Map，从左往右遍历，计算除可以和当前数字相加满足条件的数，然后去前面找这个数出现了几次
    如何判断满足条件：两个数字分别与24取模，取模的结果相加等于24，那这两个数相加一定是24的整数倍。
    所以Map中只需要存对24取模的结果为key就好，只要取模的结果相同，这两个数就可以看成是一模一样的
    """

    def countCompleteDayPairs(self, hours: List[int]) -> int:
        res, count_map = 0, [0] * 24
        for hour in hours:
            hour_mod = hour % 24
            # 如果hour_mod=0，24-hour_mod就是24，所以需要再次取模，如果hour_mod!=0，再取模一次结果也一样
            res += count_map[(24 - hour_mod) % 24]
            count_map[hour_mod] += 1
        return res
