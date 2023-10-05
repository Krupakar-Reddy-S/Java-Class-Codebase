#! /bin/bash
echo
echo "1: Print Current Time"
echo "2: Print Current Date"
echo "3: Print Raw Date"

read -p "Enter An Option: " input
echo

case $input in

    1)  # val= date | awk '{print $4}'
        echo "Time now is: ";
        date | awk '{print $4}'
        ;;

    2)  
        echo "Today's date is: ";
        date | awk '{print $3"/"$2"/"$7}'
        ;;

    3)
        echo "The raw Date is: "; 
        date | awk '{print $0}'
        ;;
    
    *) echo "Enter a valid Input!"
esac

bash Case.sh
