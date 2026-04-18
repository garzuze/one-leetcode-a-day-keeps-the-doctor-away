class Solution:
    def mirrorDistance(self, n: int) -> int:
        reversed_num = 0
        og_n = n

        while n != 0:
            digit = n % 10
            reversed_num = reversed_num * 10 + digit
            n //= 10
        
        return abs(og_n - reversed_num)
