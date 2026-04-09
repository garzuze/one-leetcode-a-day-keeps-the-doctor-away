from typing import List


class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        result = []
        
        for i in range(left, right + 1):
            num = i
            is_self_dividing = True

            while num:
                digit = num % 10

                if digit == 0 or i % digit != 0:
                    is_self_dividing = False 
                    break
                
                num //= 10

            if is_self_dividing:
                result.append(i)
        
        return result