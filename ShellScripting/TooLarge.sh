#! /bin/bash

SEARCH_DIR= /home/krupakar-reddy/Desktop/ShellScripting

if [ ! -d $SEARCH_DIR ]
then
        echo "Provided directory does not exist, please enter a valid directory!"
        exit 1
fi

if [ ! -d "$SEARCH_DIR/archive" ]
then
        mkdir "$SEARCH_DIR/archive"
fi

for file in find "$SEARCH_DIR/" -maxdepth 1 -type f -size -1M
do
        echo "Archiving file $file"
        gzip -c "$file"
        mv "$SEARCH_DIR/$file" "$SEARCH_DIR/archive/$file"
done
