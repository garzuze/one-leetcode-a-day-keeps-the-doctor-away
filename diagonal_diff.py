def diagonalDifference(arr):
    lr_sum = 0
    rl_sum = 0
    diff = 0
    for index, line in enumerate(arr):
        diff -= 1
        lr_sum += line[index]
        rl_sum += line[diff]
    return (lr_sum - rl_sum) if lr_sum > rl_sum else (rl_sum - lr_sum)
