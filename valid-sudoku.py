from typing import List


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        squares = {}

        for row in board:
            row_set = set()
            for number in row:
                if number != ".":
                    if number in row_set:
                        return False
                    row_set.add(number)

        for i in range(len(board)):
            column_set = set()
            for j in range(len(board)):
                number = board[j][i]

                if number != ".":
                    if number in column_set:
                        return False
                    column_set.add(number)

                    square_index = (j // 3) * 3 + (i // 3)
                    squares_set = squares.get(square_index, set())

                    if number in squares_set:
                        return False

                    squares_set.add(number)

                    squares[square_index] = squares_set

        return True
