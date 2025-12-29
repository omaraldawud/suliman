#!/bin/bash
# adder.sh - Adds two numbers from command line arguments

echo "=== Simple Number Adder ==="

echo "Name of the script: $0"
echo "1st Argument: $1"
echo "2nd Argumnet: $2"
echo "Number of arguments: $#"


# Check if we have exactly 2 arguments
if [ $# -ne 2 ]; then
    echo "Usage: $0 <number1> <number2>"
    echo "Example: $0 5 3"
    exit 1
fi

# define local variables
var1=20
var2=30


# Assign arguments to variables
num1=$1
num2=$2

# Add the numbers (using basic arithmetic)
sum=$((num1 + num2))

# Display result
echo "The sum of $num1 and $num2 is: $sum"
echo "The sum of $var1 and $var2 is: $($var1+$var2)"
