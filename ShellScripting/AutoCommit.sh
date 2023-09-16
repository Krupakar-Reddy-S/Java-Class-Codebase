#!/bin/bash

cd /absolute-path-to-local-repo
echo "Succesfully set working directory to local Repository"

/usr/bin/git status
echo "Successfully showed all changes"

/usr/bin/git add .
echo "Successfully tracked all files"

/usr/bin/git commit -m "Daily Code Update"
echo "Successfully committed all changes"

/usr/bin/git push
echo "Successfully pushed to remote repository"

/usr/bin/git pull
echo "Successfully verified remote repository sync"
