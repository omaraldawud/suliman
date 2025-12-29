#!/bin/bash
# Default values${word} displays the content of "word", but what if it does not exist?
 
${word:-hello}
# displays the content of the variable "word"
if "word" does not exist (or is empty), this returns the word "hello"
# does not change the value of "word"!
