from typing import List


class Solution:
    def rotateTheBox(self, boxGrid: List[List[str]]) -> List[List[str]]:
        for row in boxGrid:
            write = len(row) - 1

            for i in reversed(range(len(row))):
                if row[i] == "*":
                    write = i - 1
                elif row[i] == "#":
                    row[i] = "."
                    row[write] = "#"
                    write -= 1

        result = []

        for i in range(len(boxGrid[0])):
            line = []
            for j in reversed(range(len(boxGrid))):
                line.append(boxGrid[j][i])
            result.append(line)

        return result
