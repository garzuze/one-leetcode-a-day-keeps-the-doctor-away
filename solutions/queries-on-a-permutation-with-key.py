from typing import List


class Solution:
    def processQueries(self, queries: List[int], m: int) -> List[int]:
        p = []

        for i in range(1, m + 1):
            p.append(i)

        result = []

        for i in range(len(queries)):
            index = p.index(queries[i])
            result.append(index)
            value = p.pop(index)
            p.insert(0, value)

        return result
