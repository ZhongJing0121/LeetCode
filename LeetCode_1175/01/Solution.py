class Solution:
    """
    1175.质数排列
    """

    def isPrime(self, num: int) -> bool:
        """
        是否是质数
        """
        if num <= 1:
            return False
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                return False
        return True

    def countPrime(self, n):
        """
        求1-n有多少个质数
        """

        count = 0
        for i in range(1, n + 1):
            if self.isPrime(i):
                count += 1
        return count

    def factorialRecursive(self, n: int) -> int:
        """
        计算阶乘
        """
        if n == 0 or n == 1:
            return 1
        return n * self.factorialRecursive(n - 1)

    def numPrimeArrangements(self, n: int) -> int:
        # 求质数的个数
        primeCount = self.countPrime(n)
        return int(self.factorialRecursive(primeCount) * self.factorialRecursive(n - primeCount) % (10 ** 9 + 7))
