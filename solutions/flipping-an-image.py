from typing import List



class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        final = []

        for arr in image:
            final.append(list(reversed(arr)))

        for arr in final:
            for i in range(len(arr)):
                if arr[i] == 0:
                    arr[i] = 1
                else:
                    arr[i] = 0
        
        return final
