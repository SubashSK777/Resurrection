n = int(input())
a = list(map(int, input().split()))

high = a.index(max(a))
low = n - 1 - a[::-1].index(min(a))
res = (high - 0) + ((n - 1) - low) - (low < high)
print(res)