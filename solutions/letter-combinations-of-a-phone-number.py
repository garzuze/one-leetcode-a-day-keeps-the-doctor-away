from typing import List


class Solution:
    def __init__(self):
        self.result = []
        self.digit_map = {
            1: [],                2: ['a', 'b','c'],    3: ['d','e','f'],
            4: ['g','h','i'],     5: ['j','k','l'],     6: ['m','n','o'],
            7: ['p','q','r','s'], 8: ['t','u','v'],     9: ['w','x','y','z']
        }

    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        
        self.backtrack("", digits)

        return self.result
    
    def backtrack(self, subset: str, next_digits: str):
        # because for s = "a", s[1:] == ''
        if not next_digits:
            self.result.append(subset)
            return
        
        for letter in self.digit_map[int(next_digits[0])]:
            self.backtrack(subset + letter, next_digits[1:])
        
