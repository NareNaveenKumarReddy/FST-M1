fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "mango": 15
}

fruit = input("Which fruit are you looking for? ").lower()

if(fruit in fruit_shop.keys()):
    print("Yes, " +  fruit + " is available in shop")
    
else:
    print("No, " +  fruit + " is not available in shop")