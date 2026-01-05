#
var=1                                   # Sets variable 'var' to integer value 1
echo "Initial value: $var"
echo $((var+1))                         # Outputs 2 (arithmetic expansion: 1+1=2), doesn't change var
echo "After adding 2: $((var+2))"        
var=$((var+4))                          # Updates var to 5 (arithmetic: 1+4=5, then assign to var)


var=${var+1}             # Parameter expansion, NOT arithmetic! If var is set, returns "1" (string)


# example 2
var=5
echo $((var+1))    # Output: 6 (arithmetic: 5+1)
echo ${var+1}      # Output: 1 (parameter expansion, returns "1" because var is set)

