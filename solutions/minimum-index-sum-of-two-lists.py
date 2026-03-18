from typing import List

class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        list1_map = {}
        list2_map = {}
        result = {}
        min_sum = None
        
        for i in range(len(list1)):
            list1_map[list1[i]] = i
        
        for i in range(len(list2)):
            list2_map[list2[i]] = i
        
        for i in range(len(list1)):
            if list1[i] in list2_map:
                word_sum = i + list2_map.get(list1[i])
                result[list1[i]] = word_sum
                
                if min_sum is None:
                    min_sum = word_sum

                if word_sum < min_sum:
                    min_sum = word_sum


        return [key for key, value in result.items() if value == min_sum]