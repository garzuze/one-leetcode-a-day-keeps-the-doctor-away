from typing import List



class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        result = []
        number = 1

        for _ in range(n):
            result.append(number)
            if number * 10 <= n:
                number *= 10
            else:
                while number % 10 == 9 or number >= n:
                    number //= 10
                number += 1
        
        return result
