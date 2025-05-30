n, m = map(int, input().split())

for i in range(1, n + 1):
    if i % 2 == 1:
        for j in range(m):
            print("#", end="")
        print()
        
    elif i % 4 == 0:
        print("#", end="")
        for j in range(m - 1):
            print(".", end="")
        print()
        
    else:
        for j in range(m - 1):
            print(".", end="")
        print("#", end="")
        print()
        
        
        