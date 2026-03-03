from typing import List


class Solution:
    def processQueries(self, queries: List[int], m: int) -> List[int]:
        p = []

        for i in range(1, m + 1):
            p.append(i)

        result = []

        for i in range(len(queries)):
            for j in range(len(p)):
                if p[j] == queries[i]:
                    result.append(j)
                    del p[j]
                    break
            p = [queries[i]] + p

        return result
