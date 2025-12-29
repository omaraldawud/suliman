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