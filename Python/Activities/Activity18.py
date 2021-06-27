# Import pandas
import pandas as pd

# Read the CSV file and store it into a DataFrame
df = pd.read_csv("sample.csv")

# Print the full data
print("Full Data: ")
print(df)

# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(df["Usernames"])

# Print the username and password of the second row
print("===============")
print("Username: ", df["Usernames"][1], " | ", "Password: ", df["Passwords"][1])

#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(df.sort_values('Usernames'))

#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(df.sort_values('Passwords', ascending=False))