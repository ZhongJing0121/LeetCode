class Solution:
    """
    1009.十进制整数的反码
    Author: 仲景
    Date: 2024/10/17
    """

    def bitwiseComplement(self, n: int) -> int:
        # 去掉前缀
        b = bin(n)[2:]
        # 构建全是1的数字
        tmp = ''
        for i in range(len(b)):
            tmp += '1'
        mask = int(tmp, 2)
        # 和n异或，每一位算出相反数
        return n ^ mask
