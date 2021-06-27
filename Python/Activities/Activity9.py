firstlist = list(input("Enter a sequence of comma separated values into list 1: ").split(","))
secondlist = list(input("Enter a sequence of comma separated values into list 2: ").split(","))
thirdlist = []

for number in firstlist:
    if int(number) % 2 == 0:
        thirdlist.append(int(number))

for number in secondlist:
    if int(number) % 2 != 0:
        thirdlist.append(int(number))

print("Values in third list: ", thirdlist)