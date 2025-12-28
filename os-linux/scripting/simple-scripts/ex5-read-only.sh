#!/bin/bash

# Define a read-only variable for backup directory
readonly backup_dir="/root"
echo $backup_dir 

# Attempting to change the value will result in an error
backup_dir="/home/user/backup"