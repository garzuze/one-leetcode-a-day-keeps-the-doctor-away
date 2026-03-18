from typing import List


class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        seen = set()

        for number in arr:
            if number * 2 in seen:
                return True
            if number % 2 == 0 and number // 2 in seen:
                return True
            seen.add(number)
        return False
