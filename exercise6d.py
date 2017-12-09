def get_primes(count):
    primes = []

    n = 2
    while len(primes) != count:
        for i in range(2, n // 2 + 1):
            if n % i == 0:
                break
        else:
            primes.append(n)
        n += 1

    return primes

a=get_primes(10)
print (a)
