#!/bin/bash
echo#!/bin/bash
# This is a simple shell script

echo "Hello, welcome to Linux!"
echo "Today is: $(date)"
echo "Your current directory is: $(pwd)"

echo "What is your name?"
read name
echo "Nice to meet you, $name!"

echo "Enter a number:"
read num
echo "The double of your number is $((num * 2))"



echo "Files in current folder:"
ls -l

# read file name from user
echo "Enter a file name:"
read filename

# Check the type of the file
if [ -f "$filename" ]; then
    echo "$filename is a normal file (like .txt, .jpg, etc.)"
elif [ -d "$filename" ]; then
    echo "$filename is a directory/folder"
else
    echo "$filename doesn't exist or is a special file"
fi

