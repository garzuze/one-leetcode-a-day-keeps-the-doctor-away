from typing import List


class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        result = [0] * n
        freq = [0] * (n + 1)
        acc = 0

        for i in range(n):
            freq[A[i]] += 1

            if freq[A[i]] == 2:
                acc += 1

            freq[B[i]] += 1

            if freq[B[i]] == 2:
                acc += 1

            result[i] = acc

        return result
