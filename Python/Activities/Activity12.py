
def sum(n):
    if n <= 1:
        return n

    else:
        return n + sum(n-1)

print("Sum of numbers from 0 to 10 : ",sum(10))