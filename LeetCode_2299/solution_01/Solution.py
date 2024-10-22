class Solution:
    """
    2299.强密码检验器 II
    Author: 仲景
    Date: 2024/10/22
    """

    def strongPasswordCheckerII(self, password: str) -> bool:
        if len(password) < 8:
            return False
        isLowerCase, isUpperCase, isDigit, isSpecial = False, False, False, False
        charSet = set("!@#$%^&*()-+")
        for i, c in enumerate(password):
            if c.islower():
                isLowerCase = True
            if c.isupper():
                isUpperCase = True
            if c.isdigit():
                isDigit = True
            if c in charSet:
                isSpecial = True
            if i != len(password) - 1 and password[i] == password[i + 1]:
                return False
        return isLowerCase and isUpperCase and isDigit and isSpecial


print(Solution().strongPasswordCheckerII("$Aa1a1a1"))
