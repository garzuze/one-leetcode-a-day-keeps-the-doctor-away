from typing import List


class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        count = {}

        for el in arr:
            count[el] = count.get(el, 0 ) + 1

        for el in arr:
            if count[el] == 1:
                k -= 1
                if k == 0:
                    return el
        
        return ""
