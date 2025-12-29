#!/bin/bash

echo "=== File Creator ==="

# Ask user for input
echo -n "How many files do you want to create? "
read file_count

echo -n "What prefix name should the files have? "
read prefix_name

echo -e "\nCreating $file_count files..."

# WHILE loop to create files
counter=1
while [ $counter -le $file_count ]; do
    filename="${prefix_name}_${counter}.txt"
    touch "$filename"  # Create empty file
    echo "Created: $filename"
    counter=$((counter + 1))
done

echo -e "\nVerifying files were created..."

# WHILE loop to delete files
echo -e "\nDeleting files..."
counter=1
while [ $counter -le $file_count ]; do
    filename="${prefix_name}_${counter}.txt"
    rm "$filename" 2>/dev/null
    echo "Deleted: $filename"
    counter=$((counter + 1))
done

echo "All files deleted. Goodbye!"