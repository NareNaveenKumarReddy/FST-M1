
def sum(numbers):
	sum = 0
	for number in numbers:
		sum += int(number)
	return sum

# Define the list of numbers
numList = list(input("Enter a sequence of comma seperated values: ").split(","))

# Call the sum() function with numList as argument
result = sum(numList)

# Print result with message
print("The sum of all the elements in list is: " + str(result))