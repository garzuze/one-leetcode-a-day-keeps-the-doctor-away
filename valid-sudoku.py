from typing import List


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        squares = {}

        for i in range(len(board)):
            column_set = set()
            row_set = set()

            for j in range(len(board)):
                col_number = board[j][i]
                row_number = board[i][j]

                if row_number != ".":
                    if row_number in row_set:
                        return False
                    row_set.add(row_number)

                if col_number != ".":

                    square_index = (j // 3) * 3 + (i // 3)
                    squares_set = squares.get(square_index, set())

                    if col_number in column_set or col_number in squares_set:
                        return False

                    column_set.add(col_number)
                    squares_set.add(col_number)
                    squares[square_index] = squares_set

        return True
