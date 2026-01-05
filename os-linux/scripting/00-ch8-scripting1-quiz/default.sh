#!/bin/bash

# Ask for input (optional)
read -p "Enter a word (or press Enter to skip): " word

# Set default value if empty
echo "Before expansion, word='$word'"
echo "Using default: ${word:=hello}"
echo "After expansion, word='$word'"
