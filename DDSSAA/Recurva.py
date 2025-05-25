def count(i, n):
    if i > n:
        return
    else:
        print(i, end=" ")
        return count(i + 1, n)
    
def rev_count(i, n):
    if i == 0:
        return
    else:
        print
count(1, 10)