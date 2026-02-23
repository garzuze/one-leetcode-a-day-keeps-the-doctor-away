from typing import List


class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        rows = []

        for line in bank:
            count = line.count("1")
            if count != 0:
                rows.append(count)

        if len(rows) == 0:
            return 0

        prev = rows[0]
        result = 0

        for i in range(1, len(rows)):
            result += prev * rows[i]
            prev = rows[i]

        return result
