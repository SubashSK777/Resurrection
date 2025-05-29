s = input()
arr = [0] * len(s)
for i in range(len(s)):
    d = int(i)
    f = 9 - d
    
    if (i == 0 and f == 0): arr.append(d)
    else: arr.append(min(d, f))
    
print("".join(arr))