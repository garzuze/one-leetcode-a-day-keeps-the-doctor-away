from typing import List


class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        a_set = set()
        b_set = set()
        result = [0] * len(A)

        for i in range(len(A)):
            a_set.add(A[i])
            b_set.add(B[i])
            result[i] = len(a_set.intersection(b_set))

        return result
