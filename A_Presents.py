n = int(input())
arr = list(map(int, input().split()))
inv = [0] * n
for i in range(n):
    x = arr[i]
    inv[x - 1] = i + 1

for i in inv:
    print(i, end= " ")