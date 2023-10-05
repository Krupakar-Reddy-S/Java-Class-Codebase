# AutoCommit Cronjob
This Repository has me adding code locally to it almost daily and it seemed very redundant for me to keep on syncing it online, So i have automated this process using a simple shell script and a cronjob. this process is explained below in detail.

&nbsp;

## AutoCommit Shell Script

### File: AutoCommit.sh
```bash
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

```

1. The above shell script runs in bash as indicated by **&nbsp; #! /bin/bash**.

2. First we navigate to the directory where the local repository is present using the **cd** command .

3. Next we check all file changes and track them with git.
   
4. Lastly we commit and push our change to the remote repository and verify it with pull.

#### NOTE: The full path of git is used, it can be found with the command "which git"

&nbsp;

## AutoCommit Cronjob

```
0 22 * * *  /bin/bash  /absolute-path-to-AutoCommit.sh
```

1. Here &nbsp; **&nbsp;0 &nbsp; 22 &nbsp; * &nbsp; * &nbsp; * &nbsp;** indicates that the cronjob is scheduled to run every day at 10 PM.

2. The **&nbsp; /bin/bash &nbsp;** makes sure the given command is executed using bash.
   
3. Then we specify the absolute path to the **&nbsp; AutoCommit.sh &nbsp;** file which performs the git operations.

#### Now this cronjob will run daily at 10 PM and commit and push chages to the repository automatically to github. 

&nbsp;

#### NOTE: The cronjob only runs if the system in which it is present is On and if it is missed the AutoCommit is not executed, but this can be solved with a tool called Anacron, which checks if a previous task was missed and executes it next time the system is On (will be updated here soon).