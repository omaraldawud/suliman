#!/bin/bash

# Create two READ-ONLY variables (cannot be changed later)
# backup_dir: Where backup files will be saved (/temporary folder)
# files: What to backup (/root folder)
readonly backup_dir=/temporary
readonly files=/root

# Ask user for a filename WITHOUT going to next line (-n)
echo -n "enter backup filename ->"

# Read user's input, allow backslashes (-r for raw input)
read -r backup_file

# Show message with the filename user entered
echo "Backing up to ${backup_file}..."

# Create the backup (tar = tape archive, like zip):
# -z: Compress with gzip
# -c: Create new archive
# -f: Specify filename
# "${backup_dir}/${backup_file}": Save to /temporary/user-filename
# ${files}: Backup /root folder contents
# 2>/dev/null: Hide any error messages
tar -zcf "${backup_dir}/${backup_file}" ${files} 2>/dev/null

# Force all data to be written to disk (flush buffers)
sync

# Done message
echo "Done."