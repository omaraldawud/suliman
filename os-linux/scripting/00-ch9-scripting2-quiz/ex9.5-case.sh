#!/bin/bash

echo "Choose a fruit:"
read fruit

case $fruit in
    apple)
        echo "You chose an apple 🍎"
        ;;
    banana)
        echo "You chose a banana 🍌"
        ;;
    orange|grapefruit)
        echo "You chose a citrus fruit 🍊"
        ;;
    *)
        echo "Unknown fruit"
        ;;
esac