#!/bin/bash

# wrtie a program that accepts 2 numbers as arguments and if both numbers are present print their sum. 
# if the script is ran without argumentas display error msg. 


num1=$1
num2=$2

if [ $# -lt 2 ]; then
    echo "error: ${0} need 2 args"
    echo "example  6 7"
else
    echo "the sum of ${num1} and ${num2} is = $((num1 + num2))"
fi




# <. >. ==, , >=, <= 
# lt, gt, eq etc.
#  run the command as follows: ./adder_v1.sh 6 7
















# # Ask for input
# read -p "Enter first number: " num1
# read -p "Enter second number: " num2

# # Arithmetic expansion
# sum=$(( num1 + num2 ))
# product=$(( num1 * num2 ))

# # Output
# echo "Sum: ${sum}"
# echo "Multiplication: ${product}"

