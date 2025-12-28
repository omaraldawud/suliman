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

# UNTIL loop to verify files exist
counter=1
until [ $counter -gt $file_count ]; do
    filename="${prefix_name}_${counter}.txt"
    if [ -f "$filename" ]; then
        echo "✓ $filename exists"
    else
        echo "✗ $filename is missing!"
    fi
    counter=$((counter + 1))
done

echo "All files created successfully!"

# UNTIL loop to keep asking until user says "yes"
answer="no"
until [ "$answer" = "yes" ]; do
    echo -e "\nDo you want to delete these files? (yes/no): "
    read answer
    
    if [ "$answer" = "no" ]; then
        echo "Files will be kept."
    elif [ "$answer" != "yes" ]; then
        echo "Please answer 'yes' or 'no'"
    fi
done

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