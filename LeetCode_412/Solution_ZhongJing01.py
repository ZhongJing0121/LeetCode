from typing import List


class Solution:
    """
    412.Fizz Buzz
    """
    
    def fizzBuzz(self, n: int) -> List[str]:
        s = []
        for i in range(1, n + 1):
            if i % 5 == 0 and i % 3 == 0:
                s.append("FizzBuzz")
            elif i % 3 == 0:
                s.append("Fizz")
            elif i % 5 == 0:
                s.append("Buzz")
            else:
                s.append(str(i))
        return s