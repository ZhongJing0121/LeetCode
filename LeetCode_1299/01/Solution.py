from typing import List


class Solution:
    """
    1299.将每个元素替换为右侧最大元素
    """

    def replaceElements(self, arr: List[int]) -> List[int]:
        rightMaxNum = -1
        for i in range(len(arr) - 1, -1, -1):
            curNum = arr[i]
            arr[i] = rightMaxNum
            rightMaxNum = max(rightMaxNum, curNum)
        return arr


if __name__ == '__main__':
    print(Solution().replaceElements([17, 18, 5, 4, 6, 1]))
