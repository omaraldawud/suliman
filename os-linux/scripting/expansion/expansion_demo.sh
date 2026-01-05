#!/bin/bash

name="Omar"
course="Linux"

# “Bash reads the line → expands variables → runs the command.”

-----------------------------------------
# basic variable 
# “Expansion happens before the command executes.”
echo $name                  #   WSL: Open Folder in WSL$name → expanded by bash
echo $course                #   echo never sees $name, it sees the value

-----------------------------------------
#
echo '$name'    # → no expansion
echo "$name"    # → allows expansion

#  -----------------------------------------
# Positional Parameter Expansion
echo "Script name: $0"
echo "First argument: $1"
echo "Second argument: $2"
echo "Number of arguments: $#"
# run with params: ./expansion_demo.sh apple banana
    # $0	Script name
    # $1	First argument
    # $2	Second argument
    # $#	Number of arguments

# -----------------------------------------
# Command Substitution
today=$(date)               #   $(command) → command runs first
echo "Today is: $today"     #   output replaces the expression

# -----------------------------------------
# Modify the script so it prints:
    # Hello Omar
    # You are taking Linux
    # Today is <today's date>
    # You passed 2 arguments

        # $name
        # $course
        # $(date)
        # $#
# -----------------------------------------



