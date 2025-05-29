a = 0
n = int(input())
for i in range(n):
    s = input()
    if "++" in s:
        a += 1
    else:
        a -= 1
        
print(a)