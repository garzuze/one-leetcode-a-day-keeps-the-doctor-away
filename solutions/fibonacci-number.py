class Solution:
    def fib(self, n: int) -> int:
        if n <= 1:
            return n

        prev1 = 1
        prev2 = 0
        current = 0
        for _ in range(1, n):
            current = prev1 + prev2
            prev2 = prev1
            prev1 = current
        
        return current