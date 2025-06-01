n = int(input())

for i in range(n):
    a, b, c = map(int, input().split())
    count = 0
    while a <= c and b <= c:
        if a < b:
            a += b
        else:
            b += a
        count += 1
        
    print(count)
        