m = int(input())

for i in range(m):
    res = []
    n = int(input())
    power = 1
    while (n > 0):
        if (n % 10 > 0):
            res.append((n % 10) * power)
            
        n //= 10
        power *= 10
        
    print(len(res))
    for i in res:
        print(i, end=" ")
    print()