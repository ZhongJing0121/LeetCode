class Solution:
    """
    2696.删除子串后的字符串最小长度
    """
    
    def minLength(self, s: str) -> int:
        # 栈
        stack = []
        # 需要匹配的字符对
        pairs = {('A', 'B'), ('C', 'D')}
        
        for c in s:
            if stack and (stack[-1], c) in pairs:
                stack.pop()
            else:
                stack.append(c)
        
        return len(stack)