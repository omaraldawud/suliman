#!/bin/bash

# Ask for input
read -p "Enter a number: " num

# Print numbers backwards
echo "------------- using for -------------"
for (( i=num; i>=1; i-- )); do
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



