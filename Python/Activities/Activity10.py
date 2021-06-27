numbers = tuple(input("Enter a sequence of comma seperated values: ").split(","))
print("Values below divisible by 5 from above tuple:")
for i in numbers:
    if int(i) % 5 == 0:
        print(int(i))