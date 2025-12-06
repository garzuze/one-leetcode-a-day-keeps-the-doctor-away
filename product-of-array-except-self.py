from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []
        total_prod = 1
        count_zero = 0

        for num in nums:
            if num == 0:
                count_zero += 1
                continue
            total_prod = total_prod * num

        for num in nums:
            if count_zero == 1:
                if num != 0:
                    output.append(0)
                else:
                    output.append(total_prod)
            elif count_zero > 1:
                output.append(0)
            else:
                if num != 0:
                    output.append(total_prod // num)
                else:
                    output.append(total_prod)
        return output