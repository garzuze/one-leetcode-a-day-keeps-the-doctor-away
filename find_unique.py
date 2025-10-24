def find_uniq(arr):
    equal = arr[0]
    count_equal = 0
    for number in arr[1:3]:
        if number == equal:
            count_equal += 1
    if count_equal < 1:
        return count_equal
    arr_set = set(arr)
    for number in arr_set:
        if number != equal:
            return number