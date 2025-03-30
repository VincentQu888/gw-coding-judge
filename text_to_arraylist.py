# HOW THIS PROGRAM WORKS 
# reads each .in file in a directory
# Prints out ArrayLists containing the test cases
# Instructions for use: Go to a directory containing .in files and run this script

import os, glob
# glob to only open .in files

# find number of files in directory
file_count = 0
counter = 0 # count how many files have been opened (print different characters for last file)
for filename in glob.glob('*.in'): # open all .in files
    file_count += 1

problem_name = input("Enter the problem name: ")
print()
#problem_name = "testing"

print("public static String[]", problem_name, "() {")
print("\t String[] cases = {")
for filename in glob.glob('*.in'): # open all .in files
    counter += 1
    print ()
    with open(os.path.join(os.getcwd(), filename), 'r') as f: # open in read mode
        # print out test case as java arraylist
        print("\t \"", end='')
        for line in f:
            print(line.strip() + "\\n", end='')
        if counter == file_count:
            print("\"") 
        else:
            print("\", ") 

print("\t };")
print("\t return cases;")
print("}")