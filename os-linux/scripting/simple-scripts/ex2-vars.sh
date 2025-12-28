var="*.txt"
echo ${var}

touch doc.txt
echo ${var}
echo "${var}"
ls "${var}"




# You ran: ./ex2-vars.sh
# Here's what each line did:

# 1. var="*.txt"  - Created a variable containing TEXT "*.txt"

# 2. echo ${var}  - FIRST OUTPUT: doc.txt
#    Wait, why not "*.txt"? Because there's a doc.txt file in your directory!
#    Without quotes, bash sees ${var} as "*.txt" and EXPANDS it to match files
#    It found doc.txt, so it shows: doc.txt

# 3. touch doc.txt  - Created doc.txt (but you already had one!)

# 4. echo ${var}  - SECOND OUTPUT: doc.txt
#    Same as before - expands to matching files, shows doc.txt

# 5. echo "${var}" - THIRD OUTPUT: *.txt
#    WITH quotes! Now bash treats it as literal text "*.txt"
#    Shows the actual text in the variable: *.txt

# 6. ls "${var}"   - FOURTH OUTPUT: Error message
#    This runs: ls "*.txt" (with quotes)
#    Bash looks for a file literally named "*.txt" (star-dot-txt)
#    There's no file with that exact name, so: ls: cannot access '*.txt': No such file or directory