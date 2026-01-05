#!/bin/bash

# Function to check if file exists
file_exists() {
    if [ -f "$1" ]; then
        echo "File $1 exists"
        return 0  # Success
    else
        echo "File $1 not found"
        return 1  # Failure
    fi
}

# Function to create backup
backup_file() {
    local file="$1"
    if [ -f "$file" ]; then
        cp "$file" "$file.backup"
        echo "Backup created: $file.backup"
    else
        echo "Cannot backup - file doesn't exist"
    fi
}

# Function to display system info
system_info() {
    echo "=== System Information ==="
    echo "Date: $(date)"
    echo "User: $(whoami)"
    echo "Hostname: $(hostname)"
    echo "Uptime: $(uptime -p)"
}

# Use the functions
file_exists "/etc/passwd"
backup_file "myfile.txt"
system_info