class Solution:
    """
    551.学生出勤记录 I
    """

    def checkRecord(self, s: str) -> bool:
        return s.count('A') < 2 and "LLL" not in s
