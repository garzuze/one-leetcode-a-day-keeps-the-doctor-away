def move_zeros(lst):
    for number in lst:
        if number == 0:
            lst.remove(number)
            lst.append(number)
    return lst

print(move_zeros([1, 0, 1, 2, 0, 1, 3]))