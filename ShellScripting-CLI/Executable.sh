#! /bin/bash

read -e -p "Enter the filename to make executable: " filename

if [ -z "$filename" ]
then
    echo "Please enter a file name!";
else
    chmod u+x $filename && echo "$filename is now executable!";
fi
