#!/bin/bash

echo "=== Quote Comparison Calculator ==="

# Get user input
echo -n "Enter first number: "
read num1
echo -n "Enter second number: "
read num2

echo -e "\n[Using Single Quotes ' ']"
echo 'Result: $num1 + $num2 = $num1 + $num2'  # Single quotes: everything literal
# Single quotes treat EVERYTHING as plain text - no variable expansion

echo -e "\n[Using Double Quotes \" \"]"
echo "Result: $num1 + $num2 = $(($num1 + $num2))"  # Double quotes: variables expanded
# Double quotes allow variable expansion and command substitution

echo -e "\n[Using Backticks \` \`]"
result=`echo "$num1 + $num2" | bc`  # Backticks: old way for command substitution
echo "Old way: $num1 + $num2 = $result"
# Backticks are the old way to capture command output - $(...) is preferred now

echo -e "\n[Using \$() for calculation]"
# $(...) is the modern way for command substitution and calculations
addition=$(($num1 + $num2))
multiplication=$(($num1 * $num2))
division=$(echo "scale=2; $num1 / $num2" | bc)  # Using bc for decimal division

echo "Modern way using \$():"
echo "$num1 + $num2 = $addition"
echo "$num1 * $num2 = $multiplication"
echo "$num1 / $num2 = $division"
# $(...) is clearer, can be nested, and handles complex expressions better

# Single quotes: everything literal
# Double quotes allow variable expansion
# Backticks are the old way to capture command output
# $(...) is clearer, can be nested, and handles complex expressions better