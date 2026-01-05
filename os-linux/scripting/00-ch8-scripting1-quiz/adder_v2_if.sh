#!/bin/bash

# Ask for input
read -p "Enter first number: " num1
read -p "Enter second number: " num2

# Calculate sum and multiplication
sum=$(( num1 + num2 ))
product=$(( num1 * num2 ))

# Check if sum is even or odd
if (( sum % 2 == 0 )); then
    echo "Sum is even: ${sum}"
else
    echo "Sum is odd, multiplication is: ${product}"
fi

# ----------------------------------
# (( )) → arithmetic comparison
# Use "${var}" when printing
# ----------------------------------

