from typing import List

class Solution:
    def validStrings(self, n: int) -> List[str]:
        result = []
        for i in range(2 ** n):
            bin_rep = bin(i)[-n:].replace("b", "")
            while len(bin_rep) < n:
                bin_rep = "0" + bin_rep

            if "00" not in bin_rep:
                result.append(bin_rep)

        return result
