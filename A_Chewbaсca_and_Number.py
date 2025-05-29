s = input()
res = ''
for i in range(len(s)):
    d = int(s[i])
    f = 9 - d
    
    if (i == 0 and f == 0): res+= str(d)
    else: res += str(min(d, f))
    
print(res)
    
