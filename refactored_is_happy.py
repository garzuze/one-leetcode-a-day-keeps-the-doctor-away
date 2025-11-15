class Solution:
    def isHappy(self, n: int) -> bool:
        def get_next(n):
            output = 0
            while n:
                digit = n % 10
                output += pow(digit, 2)
                n = n // 10
            return output

        visited = set()
        while n not in visited:
            visited.add(n)
            n = get_next(n)
            if n == 1:
                return True
        
        return False

s = Solution()
print(s.isHappy(19))