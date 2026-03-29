from typing import List


class Solution:
    def findingUsersActiveMinutes(self, logs: List[List[int]], k: int) -> List[int]:
        result = [0] * k
        activity = {}

        for log in logs:
            if log[0] not in activity:
                activity[log[0]] = set()
            activity[log[0]].add(log[1])

        for act in activity.values():
            result[len(act) - 1] += 1
        
        return result
