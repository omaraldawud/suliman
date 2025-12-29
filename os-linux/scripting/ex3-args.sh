#!/bin/bash
# adder.sh - Adds two numbers from command line arguments

echo "=== Simple Number Adder ==="
echo "1st Argument: $1"
echo "2nd Argumnet: $2"

echo "numnber of arguments passed is: $#"

if [ $# -ne 2 ]; then
    echo "Usage: $0 <number1> <number2>"
    echo "Example: $0 5 3"
    exit 1
fi

# Assign arguments to variables
num1=$1
num2=$2

# Add the numbers (using basic arithmetic)
sum=$((num1 + num2))

# Display result
echo "The sum of $num1 and $num2 is: $sum"
