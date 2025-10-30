import math

def is_prime(number):
    if number <= 1:
        return False
    
    if number == 2:
        return True
    
    if number % 2 == 0:
        return False     

    for i in range (3, int(math.sqrt(number)) + 1, 2):
        if number % i == 0:
            return False
    return True

def gap(g, m, n):
    prev_prime = 0
    for i in range(m, n + 1):
        if is_prime(i):
            if i - prev_prime == g:
                return [prev_prime, i]
            prev_prime = i
    return None