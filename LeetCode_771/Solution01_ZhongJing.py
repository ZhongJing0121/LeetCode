# 题目：771.宝石与石头
# 日期：2023-07-24
# 作者：仲景
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewel_set = set(jewels)
        count = 0
        for stone in stones:
            if stone in jewel_set:
                count += 1
        return count