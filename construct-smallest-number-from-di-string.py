class Solution:
    def smallestNumber(self, pattern: str) -> str:
        number_stack = []
        result = []

        for i in range(len(pattern) + 1):
            number_stack.append(str(i + 1))

            if i == len(pattern) or pattern[i] == "I":
                while number_stack:
                    result.append(number_stack.pop())

        return "".join(result)
