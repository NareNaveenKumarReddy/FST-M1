# Import pandas
import pandas as pd

# Create a Dictionary that will hold our data
data = {
  "Firstname": ["Satvik", "Avinash", "Lahri"],
  "Lastname": ["Shah", "Kati", "Rath"],
  "Email" : ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
  "PhoneNumber" : [4537829158,5892184058,4528727830]
}

# Create a DataFrame using that data
df = pd.DataFrame(data)

# Print the DataFrame
print(df)

"""
 Write the DataFrame to a Excel file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
df.to_excel("sample_excel.xlsx", index=False)