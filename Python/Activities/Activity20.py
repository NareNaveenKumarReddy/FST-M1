# Import pandas
import pandas as pd

# Read the CSV file and store it into a DataFrame
df = pd.read_excel("sample_excel.xlsx")

# Print the full data
print("Full Data: ")
print(df)

# Print the number of rows and columns
print("===============")
print("Number of rows and columns")
print(df.shape)

# Print the data in the emails column only
print("===============")
print("Emails:\n",df["Email"])

# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Data sorted in ascending Firstname:")
print(df.sort_values('Firstname'))
