def count(i, n):
    if i > n:
        return
    else:
        print(i, end=" ")
        return count(i + 1, n)
    
def rev_count(i):
    if i == 0:
        return
    else:
        print(i, end=" ")
        return rev_count(i - 1)
    
def sum_n(n):
    if n == 0: return 0
    return sum_n(n - 1) + n

def factorial(n):
    if n

# count(1, 10) 
# rev_count(10)
print(sum_n(10))