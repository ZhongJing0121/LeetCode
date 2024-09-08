from typing import List


class Solution:
    """
    860.柠檬水找零
    """

    def lemonadeChange(self, bills: List[int]) -> bool:
        count5, count10 = 0, 0
        for bill in bills:
            if bill == 5:
                count5 += 1
            elif bill == 10:
                count5 -= 1
                count10 += 1
            elif count10 > 0:
                count5 -= 1
                count10 -= 1
            else:
                count5 -= 3
            if count5 < 0:
                return False
        return True
