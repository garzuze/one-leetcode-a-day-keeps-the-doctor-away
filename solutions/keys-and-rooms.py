from typing import List


class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        seen = [False] * len(rooms)
        seen[0] = True
        stack = [0]

        while stack:
            next_key = stack.pop()

            for key in rooms[next_key]:
                if not seen[key]:
                    seen[key] = True
                    stack.append(key)
        
        return all(seen)
