#!/bin/bash

# Function that returns a value
add_numbers() {
    local sum=$(( $1 + $2 ))
    echo $sum  # Return value by printing
}

# Call function and capture result
result=$(add_numbers 5 3)
echo "The sum is: $result"

# Another way
add_numbers 10 20