def sum_pairs(ints, s):
    prev_numbers = {}
    for index, number in enumerate(ints):
        target = s - number
        if target in prev_numbers:
            if index > prev_numbers[target]:
                return [target, number]
            return [number, target]
        prev_numbers[number] = index