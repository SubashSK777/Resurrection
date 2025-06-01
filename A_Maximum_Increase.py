n = int(input())
arr = list(map(int, input().split()))

curr, maxi = 0, 1 

for i in range(len(arr)):
    if arr[i] > arr[i - 1]:
        curr += 1
        maxi = max(curr, maxi)

    else:
        curr = 1
        
print(maxi)