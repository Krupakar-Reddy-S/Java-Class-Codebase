#! /bin/bash

read -p "Enter server to connect to: " server

if [ -z "$server" ]
then
    echo "Please enter a server name!";
else
    ping -c 1 $server >> output.txt && echo "Successfully connected to $server" || echo " Could not connect to $server!";
fi
