class Solution:
    """
    292.Nim 游戏
    """
    
    def canWinNim(self, n: int) -> bool:
        return n % 4 != 0