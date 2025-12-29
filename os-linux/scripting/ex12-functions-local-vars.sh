#!/bin/bash

greet_user() {
    local name=$1  # Local variable
    local greeting="Hello, $name!"
    echo "$greeting"
}

greet_user "Alice"
greet_user "Bob"