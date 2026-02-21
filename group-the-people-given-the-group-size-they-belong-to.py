from typing import List


class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        groups = {}
        for i, size in enumerate(groupSizes):
            if size not in groups:
                groups[size] = []

            groups[size].append(i)

        result = []
        for group, people in groups.items():
            if len(people) > group:
                result += [people[i:i + group] for i in range(0, len(people), group)]
            else:
                result.append(people)

        return result
