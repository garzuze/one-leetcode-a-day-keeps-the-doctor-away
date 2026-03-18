from typing import List


class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        prev = None
        result = 0

        for line in bank:
            count = line.count("1")
            if count != 0:
                if prev is not None:
                    result += count * prev
                prev = count

        return result
