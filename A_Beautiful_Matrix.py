col, row = 0, 0

for i  in range(5):
    x = list(map(int, input().split()))
    for j in range(5):
        
        if x[j] == 1:
            col = i
            row  = j
            
print(abs(col - 2) + abs(row - 2))