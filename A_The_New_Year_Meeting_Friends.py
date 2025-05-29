x, y, z = map(int, input().split())

mini = min(x, y, z)
maxi = max(x, y, z)
avgi = maxi + mini // 2
print(abs(maxi - avgi) + abs(mini - avgi))