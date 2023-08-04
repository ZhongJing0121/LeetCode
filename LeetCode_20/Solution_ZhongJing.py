class Solution:
    """
    日期：2023-08-04
    作者：仲景
    """
    
    def isValid(self, s: str) -> bool:
        # map
        sMap = {
            ")": "(",
            "]": "[",
            "}": "{",
        }
        # 栈
        stack = []
        # 遍历s
        for c in s:
            # 如果是左括号，入栈
            if c in ["(", "[", "{"]:
                stack.append(c)
                # 如果是右括号，出栈，判断
            else:
                if len(stack) == 0 or stack.pop() != sMap[c]:
                    return False
        return len(stack) == 0