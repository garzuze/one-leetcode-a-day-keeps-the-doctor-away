def sort_array(source_array):
    odd_numbers = [x for x in source_array if x % 2 != 0]
    odd_sorted = sorted(odd_numbers)
    count_odd = 0
    for index, number in enumerate(source_array):
        if number % 2 != 0:
            source_array[index] = odd_sorted[count_odd]
            count_odd += 1
    return source_array

print(sort_array([9, 8, 7, 6, 5, 4, 3, 2, 1, 0]))