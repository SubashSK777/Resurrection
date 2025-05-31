def determine_winner(a, b, c, d):
    # If Gellyfish can kill Flower's knight in one move and survive Flower's attack
    if c >= d and a > d:
        return "Gellyfish"
    # If Flower can kill Gellyfish's knight in one move and survive Gellyfish's attack
    if d >= c and b > c:
        return "Flower"
    # Otherwise, compare the HP of the players
    if a > b:
        return "Gellyfish"
    return "Flower"

# Read number of test cases
t = int(input())
# Process each test case
for _ in range(t):
    a, b, c, d = map(int, input().split())
    print(determine_winner(a, b, c, d))