def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

n = int(input("Enter how many Fibonnaci numbers to be generated: "))

if n <= 0:
    print("Please enter a positive number: ")
    n1 = int(input())
    if n1 <=0:
        print("Sorry, Entered Negative number again!!!")
       
    else:
        print("Fibonacci Sequence: ")
        for i in range(n1):
            print(fibonacci(i))
else:
    print("Fibonacci Sequence: ")
    for i in range(n):
        print(fibonacci(i))