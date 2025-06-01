t = input()
arr = list(map(str, input().split()))

f = 0

for i in arr:
    for j in range(len(i)):
        if (i[j] == t[j]):
            f = 1
            
            
res = "YES" if f == 1 else "NO"

print(res)