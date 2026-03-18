from typing import List


class Solution:
    def sortTheStudents(self, score: List[List[int]], k: int) -> List[List[int]]:
        student_map = {}
        result = []

        for row in score:
            student_map[row[k]] = row

        for key in sorted(student_map.keys(), reverse=True):
            result.append(student_map[key])

        return result