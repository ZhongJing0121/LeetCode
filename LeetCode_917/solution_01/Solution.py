class Solution:
    """
    917.仅仅反转字母
    """

    def reverseOnlyLetters(self, s: str) -> str:
        left, right = 0, len(s) - 1
        charList = list(s)
        while left < right:
            # 最左边的字母
            while left < right and not charList[left].isalpha():
                left += 1
            # 最右边的字母
            while left < right and not charList[right].isalpha():
                right -= 1
            # 交换
            if left < right:
                charList[left], charList[right], left, right = charList[right], charList[left], left + 1, right - 1
        return ''.join(charList)
