#!/bin/bash

# Check if exactly one argument is provided
if [ $# -ne 1 ]; then
    # Determine the type of error
    if [ $# -eq 0 ]; then
        echo "Error: No directory specified."
    elif [ $# -gt 1 ]; then
        echo "Error: Too many arguments. Expected 1, got $#."
    fi
    
    # Show usage instructions
    echo "Usage: $0 <directory>"
    echo "Example: $0 /home/user/documents"
    
    exit 1
fi

# Rest of the script remains the same
for f in $(ls $1 2>/dev/null); do
    echo $f
done
