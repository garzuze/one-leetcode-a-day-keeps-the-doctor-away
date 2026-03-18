def valid_ISBN10(isbn):
    isbn_list = []
    if len(isbn) != 10:
        return False
    for index, n in enumerate(isbn):
        if n.isdigit():
            isbn_list.append(int(n))
        elif n == "X":
            if index == len(isbn) - 1:
                isbn_list.append(10)
            else:
                return False
        else:
            return False
    
    positions = [x for x in range(1, 11)]
    combinations = zip(isbn_list, positions)
    result = sum(a * b for a, b in combinations)
    return result % 11 == 0
