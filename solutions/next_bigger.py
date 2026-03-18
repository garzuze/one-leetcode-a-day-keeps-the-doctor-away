from itertools import permutations

def next_bigger(n):
    n_array = [int(number) for number in str(n)]
    permutations_tuple = permutations(n_array)
    per_arr = [list(permutation) for permutation in permutations_tuple]
    print(per_arr)
    permutations_arr = []
    for num_array in per_arr:
        if num_array[0] == 0:
            continue
        num = int("".join(str(n) for n in num_array))
        if num > n:
            permutations_arr.append(num)
    sorted_permutations = sorted(permutations_arr)
    if len(sorted_permutations) == 0:
        return -1
    return sorted_permutations[0]

next_bigger(2081)