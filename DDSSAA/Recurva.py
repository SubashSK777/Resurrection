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
    if n == 0: return 1
    return factorial(n - 1) * n

def fibonacci(n):
    if n <= 1: return n
    return fibonacci(n - 1) + fibonacci(n - 2)

def fibonacci_seq(n):
    if n<= 1: return n
    return fibonacci_seq(n - 1) + fibonacci_seq(n - 2)

for i in range(11):
    print(fibonacci_seq(i), end= " ")

# count(1, 10) 
# rev_count(10)
# print(sum_n(10))
# print(factorial(10))
# print(fibonacci(10))
fibonacci_seq(10)