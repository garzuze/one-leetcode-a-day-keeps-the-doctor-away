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
    primes = []
    for i in range(m, n + 1):
        if is_prime(i):
            primes.append(i)
    
    for index, prime in enumerate(primes):
        if index == len(primes) - 1:
            return None
        if primes[index + 1] == prime + g:
            return [prime, primes[index + 1]]
            
result = gap(6,100,110)
print(result)