#!/bin/bash

# 
echo "This is a simple shell script"
echo "Hello, welcome to Linux!"
echo "Today is: $(date)"            #$(...) executes the command inside the parentheses
echo "Your current directory is: $(pwd)"

echo "What is your name?"
read name
echo "Nice to meet you, $name!"

echo "Enter a number:"
read num
echo "The double of your number is $((num * 2))"



echo "Files in current folder:"
ls -l

echo "Enter a file name:"
read file

# Check if a file exists
if [ -f "$file" ]; then
    echo "$file exists!"
else
    echo "$file does NOT exist."
fi


# Writing to a file with redirection
echo "Say Something:"
read saySomething
echo "$saySomething" > myfile.txt
echo "Hello World" >> myfile.txt
echo "You said: $(cat myfile.txt)"
