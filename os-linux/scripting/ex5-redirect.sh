#!/bin/bash

echo "First line" > file.txt    # file.txt contains: First line
echo "Second line" > file.txt   # file.txt contains: Second line (overwrote!)
echo "Third line" >> file.txt   # file.txt contains: Second line\nThird line
