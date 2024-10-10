class Solution:
    """
    844.比较含退格的字符串
    """

    def backspaceCompare(self, s: str, t: str) -> bool:
        i, j = len(s) - 1, len(t) - 1
        delCountI, delCountJ = 0, 0
        # 倒序遍历，方便删除退格键之前的字符
        while i >= 0 or j >= 0:
            while i >= 0:
                if s[i] == '#':
                    delCountI += 1
                    i -= 1
                elif delCountI > 0:
                    delCountI -= 1
                    i -= 1
                else:
                    break
            while j >= 0:
                if t[j] == '#':
                    delCountJ += 1
                    j -= 1
                elif delCountJ > 0:
                    delCountJ -= 1
                    j -= 1
                else:
                    break
            # 避免循环结束下标越界
            if i < 0 or j < 0:
                break
            # 不相等且没越界，直接返回False
            if s[i] != t[j]:
                return False
            i -= 1
            j -= 1

        # 如果两个字符串都遍历完了，都没有不一样的，就True
        return i == -1 and j == -1
