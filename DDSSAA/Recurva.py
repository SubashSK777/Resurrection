def count(i, n):
    if i > n:
        return
    else:
        print(i, end=" ")
        return count(i + 1, n)
    
print(count(1, 10))