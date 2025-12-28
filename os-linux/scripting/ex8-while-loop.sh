#!/bin/bash
# #####################################################################################
#  Counting backwards exercise
# #####################################################################################

 

echo "=== Counting Backwards ==="
echo -n "Enter a number: "
read user_number

echo "Counting backwards from $user_number to 1:"
count=$user_number
while [ $count -gt 0 ]; do
    echo $count
    count=$((count - 1))
done