# does not solve the question but it is cool

def next_bigger(n):
    n_array = list(map(int, str(n)))
    sorted_array = sorted(n_array, reverse=True)
    new_number = int("".join(map(str, sorted_array)))
    if new_number > n:
        return new_number
    return -1