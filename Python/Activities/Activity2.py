# Ask the user for a number.
# Depending on what number they enter, tell them if the number is an even or odd number.

number = int(input("Enter a number: "))
if number % 2 == 0:
    print(str(number) + " is a even number")
else:
    print(str(number) + " is a odd number")
