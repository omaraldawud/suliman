#!/bin/bash

# read a number from the user and print backwards all numbers between 0 and the read number.
#


# Ask for input
read -p "Enter a number: " num

# Print numbers backwards
echo "------------- using for -------------"
for (( i=num; i>=1; i-- )); do
    echo "${i}"
done

# print from 0 the read number
#
for (( i=0; i>=num; i++ )); do
    echo "${i}"
done


read -p "Enter a number: " num
echo "------------- using while -------------"
while (( num >= 1 )); do
    echo "${num}"
    (( num-- ))
done

read -p "Enter a number: " num
echo "------------- using until -------------"
until (( num < 1 )); do
    echo "${num}"
    (( num-- ))
done



