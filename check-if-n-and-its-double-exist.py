from typing import List


class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        arr_map = {}

        for number in arr:
            arr_map[number] = arr_map.get(number, 0) + 1

        for number in arr_map.keys():
            target = number * 2
            if target == number:
                if arr_map[number] > 1:
                    return True
                continue
            if target in arr_map:
                return True

        return False
