def find_uniq(arr):
    a, b = set(arr)
    if arr.count(a) > 1:
        return b
    return a

print(find_uniq([ 1, 1, 1, 2, 1, 1 ]))