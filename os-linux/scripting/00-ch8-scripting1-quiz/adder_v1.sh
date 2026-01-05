#!/bin/bash

# Ask for input
read -p "Enter first number: " num1
read -p "Enter second number: " num2

# Arithmetic expansion
sum=$(( num1 + num2 ))
product=$(( num1 * num2 ))

# Output
echo "Sum: ${sum}"
echo "Multiplication: ${product}"

