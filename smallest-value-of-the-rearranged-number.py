class Solution:
    def smallestNumber(self, num: int) -> int:
        if num < 0:
            return self._process_negative(num)
        return self._process_positive(num)

    def _process_negative(self, num: int) -> int:
        digits = [digit for digit in str(num) if digit != "-"]

        digits.sort(key=lambda x: x * 10, reverse=True)

        return - int("".join(digits))

    def _process_positive(self, num: int) -> int:
        digits = []
        zeros = 0

        for digit in str(num):
            if digit == "0":
                zeros += 1
            else:
                digits.append(digit)

        digits.sort(key=lambda x: x * 10)

        if not digits or digits[0] == "0":
            return 0

        digits = [digits[0]] + ["0"] * zeros + digits[1:]

        return int("".join(digits))