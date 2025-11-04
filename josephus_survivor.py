def josephus_survivor(n, k):
    circle = [x for x in range(1, n + 1)]
    index = 0
    iterations = len(circle)
    for i in range(iterations):
        index = (index + k - 1) % len(circle)
        last = circle.pop(index)
    return last


print(josephus_survivor(7, 3))
