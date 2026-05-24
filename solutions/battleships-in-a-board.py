from typing import List


class Solution:
    def countBattleships(self, board: List[List[str]]) -> int:
        result = 0
        
        for i in range(len(board)):
            for j in range(len(board[i])):
                if board[i][j] == "X":
                    result += 1
                    if i - 1 >= 0 and board[i - 1][j] == "X":
                        result -= 1
                    elif j - 1 >= 0 and board[i][j - 1] == "X":
                        result -= 1
        
        return result
