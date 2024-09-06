class Solution:
    """
    605.种花问题
    """

    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count = 0  # 统计可以种植的花的数量
        size = len(flowerbed)

        for i in range(size):
            if flowerbed[i] == 0 and (i == 0 or flowerbed[i - 1] == 0) and (i == size - 1 or flowerbed[i + 1] == 0):
                flowerbed[i] = 1
                count += 1
                # 如果已经种完，提前返回
                if count >= n:
                    return True

        return count >= n
