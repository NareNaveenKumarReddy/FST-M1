# Write a Python program to create the multiplication table (from 1 to 10) of a number.
number = input("Enter a number: ")
for i in range(1,11):
    print(number + ' * ' + str(i) + ' = ', int(number)*i) 