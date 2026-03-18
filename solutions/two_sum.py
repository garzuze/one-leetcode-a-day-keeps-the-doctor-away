def two_sum(nums, target):
    prev_numbers = {}
    for index, number in enumerate(nums):
        missing_number = target - number
        if missing_number in prev_numbers:
            return [index, prev_numbers[missing_number]]
        prev_numbers[number] = index
    return []

print(two_sum([2, 4, 5, 6, 9, 10, 15], 25))
