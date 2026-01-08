#!/bin/bash

# get one number from the command line and if the number is even double it, if odd triple it.
# print the number and the results 


num=$1      # get one number from the command line 

if [ $# -lt 1 ]; then
    echo "Error no args provided"
    echo "use as follows: $0 number"
    exit 1
fi


if ((num % 2 == 0)); then
    result=$((num * 2))
    echo "the number ${num} is even.  its double is ${result}"
else
    result=$((num * 3))
    echo "the number ${num} is odd.  its triple is ${result}"

fi


exit 0



















# num1=${1:-0}        
# num2=${2:-0}

# # Calculate sum and multiplication
# sum=$(( num1 + num2 ))
# product=$(( num1 * num2 ))

# # Check if sum is even or odd
# if (( sum % 2 == 0 )); then
#     echo "Sum is even: ${sum}"
# else
#     echo "Sum is odd, multiplication is: ${product}"
# fi
