#!/bin/bash

# Get numbers from command line arguments, use default 0 if not provided
num1=${1:=0}
num2=${2:=0}

# Calculate sum and multiplication
sum=$(( num1 + num2 ))
product=$(( num1 * num2 ))

# Check if sum is even or odd
if (( sum % 2 == 0 )); then
    echo "Sum is even: ${sum}"
else
    echo "Sum is odd, multiplication is: ${product}"
fi
