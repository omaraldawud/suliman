#!/bin/bash
# #####################################################################################
# This script performs the following actions:
# 1. Checks if you gave it a directory name
# 2. If you did, it lists all files in that directory
# 3. If you didn't, it prints an error message and an example of how to use it
# #####################################################################################

# Check if user provided exactly 1 argument
if [ $# -ne 1 ]; then
    echo "Error: Please provide a directory path"
    echo "Example: ./script.sh /home/user"
    exit 1
fi

echo "Listing files in: $1"

# Loop through files in the given directory
# The 2>/dev/null hides "directory doesn't exist" errors
for f in $(ls $1 2>/dev/null); do
    echo "Found: $f"  # Print each filename
done

echo "Done!"