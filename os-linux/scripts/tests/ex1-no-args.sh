#!/bin/bash

if [ $# -ne 1 ]; then
  exit 1
fi

for f in $(ls $1 2>/dev/null); do
  echo $f
done


