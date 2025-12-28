#!/bin/bash

# Variables do not need to be declared: they are always of type String.
# You can put a number in a variable, but it will then be a String
# If you want to perform calculations with these numbers, use the following syntax (only works with integers!):

var=1
echo "Initial value: $var"
echo $((var+1))
echo "After adding 2: $((var+2))"
var=$((var+4))




# ${var}
var=Good
echo $varbye
echo ${var}bye
 

var="Hello"
suffix="World"

# WRONG - thinks variable is 'varsuffix' which doesn't exist
echo $varsuffix        # Output: (nothing)

# RIGHT - clearly shows variable is 'var' then adds 'suffix'
echo ${var}suffix      # Output: Hellosuffix

# ALSO RIGHT - using $()
echo ${var}$suffix     # Output: HelloWorld

# Useful for:
filename="document"
extension="txt"
echo ${filename}.${extension}    # Output: document.txt
echo ${filename}_backup.${extension}  # Output: document_backup.txt