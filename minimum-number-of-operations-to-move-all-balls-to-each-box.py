from typing import List


class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        n = len(boxes)
        answer = n * [0]
        balls = cost = 0

        for i in range(n):
            answer[i] = cost
            if boxes[i] == "1":
                balls += 1
            cost += balls

        balls = cost = 0
        for j in reversed(range(n)):
            answer[j] += cost
            if boxes[j] == "1":
                balls += 1
            cost += balls

        return answer
