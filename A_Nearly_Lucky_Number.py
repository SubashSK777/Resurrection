n = input()
r = 0
for i in n:
    if i == '4' or i == '7':
        r += 1
print("YES" if (r == 4 or r == 7) else "NO")

