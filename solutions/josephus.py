def josephus(items,k):
    index = 0
    iterations = len(items)
    order = []
    for i in range(iterations):
        index = (index + k - 1) % len(items)
        order.append(items.pop(index))
    return order