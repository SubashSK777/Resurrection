n = int(input())
res, maxi = 0, 0

for i in range(n):
    a, b = map(int, input().split())
    res -= a
    res += b
    
    if (res > maxi): maxi = res
    
print(maxi)