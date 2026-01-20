from typing import List

class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        indexes = []
        result = [0] * len(temperatures)
        
        for i in range(len(temperatures) - 1, -1, -1):

            while indexes and temperatures[indexes[-1]] <= temperatures[i]:
                indexes.pop()
            
            if len(indexes) ==  0:
                indexes.append(i)

            result[i] = indexes[-1] - i

            indexes.append(i)

        return result