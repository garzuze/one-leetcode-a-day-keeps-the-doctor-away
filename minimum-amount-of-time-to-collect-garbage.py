from typing import List


class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        last_seen = {}
        trucks = {"P", "G", "M"}

        for i in reversed(range(len(garbage))):
            unique = set(garbage[i])
            for letter in trucks:
                if letter in unique and letter not in last_seen:
                    last_seen[letter] = i

            if len(last_seen) == 3:
                break

        result = sum([len(g) for g in garbage])

        for distances in last_seen.values():
            result += sum(travel[:distances])

        return result
