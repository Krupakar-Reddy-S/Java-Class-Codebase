#!/bin/bash

for line in cat input
do
    echo $line
    if [ (wc -c) -g 10 ]
    then
            echo $line
    fi
done