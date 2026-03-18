class Solution:
    def smallestNumber(self, num: int) -> int:
        if num < 0:
            return self._process_negative(num)
        return self._process_positive(num)

    def _process_positive(self, num: int) -> int:
        digits = sorted(str(num))

        if digits[0] == "0" and len(digits) == 1:
            return 0

        i = 0
        while digits[0] == "0":
            digits[0], digits[i] = digits[i], "0"
            i += 1

        return int("".join(digits))

    def _process_negative(self, num: int) -> int:
        digits = sorted(str(-num), reverse=True)

        return - int("".join(digits))
