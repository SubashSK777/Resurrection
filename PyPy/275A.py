m = [list(map(int, input().split())) for _ in range(3)]


r = []

for i in range(3):
    for j in range(3):
        r[i][j].append(0)




for i in range(3):
    for j in range(3):
        print(r[i][j], end="")
    print()
