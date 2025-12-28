#!/bin/bash

echo "=== Math Quiz Generator ==="
echo ""

# Initialize variables
score=0
total_questions=4
question_num=1

# Generate random numbers for questions
num1=$(($RANDOM % 10 + 1))  # Random number 1-10
num2=$(($RANDOM % 10 + 1))  # Random number 1-10

# Question 1: Addition
correct_answer=$(($num1 + $num2))  # Using $(()) for calculation
echo "Question $question_num: What is $num1 + $num2?"
read -p "Your answer: " user_answer

# Check answer
if [ $user_answer -eq $correct_answer ]; then
    echo "Correct! ✓"
    score=$(($score + 1))  # Increment score using $(())
else
    echo "Wrong! The correct answer is $correct_answer ✗"
fi
question_num=$(($question_num + 1))  # Increment question number

# Question 2: Subtraction
correct_answer=$(($num1 - $num2))
echo -e "\nQuestion $question_num: What is $num1 - $num2?"
read -p "Your answer: " user_answer

if [ $user_answer -eq $correct_answer ]; then
    echo "Correct! ✓"
    score=$(($score + 1))
else
    echo "Wrong! The correct answer is $correct_answer ✗"
fi
question_num=$(($question_num + 1))

# Question 3: Multiplication
correct_answer=$(($num1 * $num2))
echo -e "\nQuestion $question_num: What is $num1 × $num2?"
read -p "Your answer: " user_answer

if [ $user_answer -eq $correct_answer ]; then
    echo "Correct! ✓"
    score=$(($score + 1))
else
    echo "Wrong! The correct answer is $correct_answer ✗"
fi
question_num=$(($question_num + 1))

# Question 4: Division (using bc for decimal)
correct_answer=$(echo "scale=0; $num1 / $num2" | bc)  # Using $() with bc command
echo -e "\nQuestion $question_num: What is $num1 ÷ $num2? (whole number only)"
read -p "Your answer: " user_answer

if [ $user_answer -eq $correct_answer ]; then
    echo "Correct! ✓"
    score=$(($score + 1))
else
    echo "Wrong! The correct answer is $correct_answer ✗"
fi

# Calculate percentage score using $()
score_percent=$(echo "scale=0; ($score * 100) / $total_questions" | bc)

# Display results
echo -e "\n=== Results ==="
echo "Total questions: $total_questions"
echo "Correct answers: $score"
echo "Your score: $score_percent%"

# Demonstrate different quotes
echo -e "\n[Using single quotes] 'Score: \$score_percent%' shows: 'Score: $score_percent%'"
echo '[Using double quotes] "Score: $score_percent%" shows: "'Score: $score_percent%'"'
echo "[Using backticks]  \`echo 'Score:' \$score_percent%\` shows: $(echo 'Score:' $score_percent%)"
echo "[Using \$()]       \$(echo 'Score:' \$score_percent%) shows: $(echo 'Score:' $score_percent%)"