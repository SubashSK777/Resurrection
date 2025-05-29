n, b, l, c, d, p, nl, np = map(int, input().split())

drink = (b * l) // nl
lime = c * d
salt = p // np
min_drink = min(drink, lime, salt)
print(min_drink // n)