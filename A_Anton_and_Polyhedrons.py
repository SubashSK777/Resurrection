r = 0
n = int(input())
for i in range(n):
    s = input()
    if s[0] == 'T': r += 4
    elif s[0] == 'C': r += 6
    elif s[0] == 'O': r += 8
    elif s[0] == 'D': r += 12
    elif s[0] == 'I': r += 20
    
print(r)